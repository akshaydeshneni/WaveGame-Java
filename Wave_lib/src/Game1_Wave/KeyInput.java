package Game1_Wave;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	private boolean[] keyDown = new boolean[4];
	
	public KeyInput(Handler handler) {
		this.handler = handler;
		
		keyDown[0] = false;
		keyDown[1] = false;
		keyDown[2] = false;
		keyDown[3] = false;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		//System.out.println(key);
		
		for(int i = 0; i< handler.object.size(); i++) {
			GameObject1 tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
				if(key == KeyEvent.VK_UP) {tempObject.setVelY(-8); keyDown[0] = true;}
				if(key == KeyEvent.VK_DOWN) {tempObject.setVelY(8); keyDown[1] = true;}
				if(key == KeyEvent.VK_RIGHT) {tempObject.setVelX(8); keyDown[2] = true;}
				if(key == KeyEvent.VK_LEFT) {tempObject.setVelX(-8); keyDown[3] = true;}
			}
		}
		if(key == KeyEvent.VK_ESCAPE) System.exit(1);
	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		for(int i = 0; i< handler.object.size(); i++) {
			GameObject1 tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
				if(key == KeyEvent.VK_UP) keyDown[0] = false; //tempObject.setVelY(0);
				if(key == KeyEvent.VK_DOWN) keyDown[1] = false;  //tempObject.setVelY(0);
				if(key == KeyEvent.VK_RIGHT) keyDown[2] = false; //tempObject.setVelX(0);
				if(key == KeyEvent.VK_LEFT) keyDown[3] = false; //tempObject.setVelX(0);
				
				// vertical movement
				if(!keyDown[0] && !keyDown[1]) tempObject.setVelY(0);
				//horizontal movement
				if(!keyDown[2] && !keyDown[3]) tempObject.setVelX(0);
					
			}
			
		}
		
	}

}
