package Game1_Wave;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject1 {
	
	Random r = new Random();
	Handler handler;
	

public Player(int x, int y, ID id, Handler handler) {
	super(x, y, id);
	this.handler = handler;
		
		
	}
	
public Rectangle getBounds() {
	return new Rectangle(x,y, 32, 32);
	}

public void tick() {
	x += VelX;
	y += VelY;
		
	x = Game1.clamp(x, 0, Game1.WIDTH -30);
	y = Game1.clamp(y, 0, Game1.HEIGHT - 54 );
	
	
	collision();
		
	}
	

private void collision() {
	for(int i = 0; i< handler.object.size(); i++) {
		GameObject1 tempObject = handler.object.get(i);
		
		if(tempObject.getId() == ID.BasicEnemy || tempObject.getId() == ID.FastEnemy) {
			if(getBounds().intersects(tempObject.getBounds())) {
				//collision code
				HUD.HEALTH -= 2;
			}
		}
	}
}


public void render(Graphics g) {
	
	Graphics2D g2d = (Graphics2D) g;
	
	g.setColor(Color.green);
	g2d.draw(getBounds());
	
	if (id == ID.Player) g.setColor(Color.WHITE);
	
	
	g.fillRect(x, y, 32, 32);
	
}
}

