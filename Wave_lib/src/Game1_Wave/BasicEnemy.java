package Game1_Wave;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class BasicEnemy  extends GameObject1{
	
	private Handler handler;

	public BasicEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		VelX = 5;
		VelY = 5;
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y, 16, 16);
		}

	
	public void tick() {
		x += VelX;
		y += VelY;
		
		if(y <= 0 || y >= Game1.HEIGHT - 32) VelY *= -1;
		if(x <= 0 || x >= Game1.WIDTH - 16) VelX *= -1;
		
		handler.addObject(new Trail(x,y, ID.Trail, Color.red, 16,16, 0.1f, handler));
	}


	public void render(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;	
		g.setColor(Color.green);
		g2d.draw(getBounds());
		
		g.setColor(Color.RED);
		g.fillRect(x, y, 16, 16);
		
	}
	
	

}
