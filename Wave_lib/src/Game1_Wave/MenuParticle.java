package Game1_Wave;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class MenuParticle extends GameObject1{
	
	private Handler handler;
	
	Random r = new Random();
	
	private int red = r.nextInt(255);
	private int green = r.nextInt(255);
	private int blue = r.nextInt(255);
	private Color col;
	

	public MenuParticle(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		VelX = (r.nextInt(7 - - 7) + -7);
		VelY = (r.nextInt(7 - - 7)+ - 7);
		if(VelX ==0) VelX =1;
		if(VelY ==0) VelY =1;
		
				
		col = new Color(red, green, blue);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y, 16, 16);
		}

	
	public void tick() {
		x += VelX;
		y += VelY;
		
		if(y <= 0 || y >= Game1.HEIGHT - 32) VelY *= -1;
		if(x <= 0 || x >= Game1.WIDTH - 16) VelX *= -1;
		
		handler.addObject(new Trail(x,y, ID.Trail, col, 16,16, 0.02f, handler));
	}


	public void render(Graphics g) {

		g.setColor(col);
		g.fillRect(x,y, 16, 16);
		
	}
	

}



