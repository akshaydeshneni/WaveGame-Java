package Game1_Wave;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler{
	
	LinkedList<GameObject1> object = new LinkedList<GameObject1>();
	
	public void tick() {
		for(int i = 0; i< object.size(); i++) {
			GameObject1 tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for(int i = 0; i< object.size(); i++) {
			GameObject1 tempObject = object.get(i);
			
			tempObject.render(g);
			
		}
	}
	
	public void addObject(GameObject1 object) {
		this.object.add(object);
	}
	
	public void removeObject(GameObject1 object) {
		this.object.remove(object);
		
	}

	public void clearEnemys() {
		for(int i =0; i < object.size(); i++) {
			GameObject1 tempObject = object.get(i);
	
			if(tempObject.getId() == ID.Player) {
				
				object.clear();
				if(Game1.gameState != Game1.STATE.End)
				addObject(new Player((int) tempObject.getX(), (int) tempObject.getY(), ID.Player, this));
			}
		}
		
		
	}

}

