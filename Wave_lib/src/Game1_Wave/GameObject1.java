package Game1_Wave;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject1 {
	
	protected int x,y;
	protected ID id;
	protected int VelX, VelY;
	
	public GameObject1(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();

	public abstract void render(Graphics g);
	
	public abstract Rectangle getBounds();
	
	public void setX(int x) {
		this.x =x;
	}
	public void setY(int y) {
		this.y =y;
	}
	public float getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public ID getId() {
		return id;
	}
	public void setVelX(int VelX) {
		this.VelX = VelX;
	}
	public void setVelY(int VelY) {
		this.VelY = VelY;
	}
	public int getVelX() {
		return VelX;
	}
	public int getVelY() {
		return VelY;
	}
}
