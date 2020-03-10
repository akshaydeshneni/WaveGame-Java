package Game1_Wave;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FastEnemy extends GameObject1{
	
	private Handler handler;

	public FastEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		VelX = 2;
		VelY = 9;
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y, 16, 16);
		}

	
	public void tick() {
		x += VelX;
		y += VelY;
		
		if(y <= 0 || y >= Game1.HEIGHT - 32) VelY *= -1;
		if(x <= 0 || x >= Game1.WIDTH - 16) VelX *= -1;
		
		handler.addObject(new Trail(x,y, ID.Trail, Color.orange, 16,16, 0.1f, handler));
	}


	public void render(Graphics g) {

		g.setColor(Color.orange);
		g.fillRect(x,y, 16, 16);
		
	}
	

}
