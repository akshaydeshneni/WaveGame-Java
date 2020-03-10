package Game1_Wave;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import Game1_Wave.Game1.STATE;

public class Menu extends MouseAdapter {
	
	private Game1 game;
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	public Menu(Game1 game, Handler handler, HUD hud) {
		this.game = game;
		this.hud = hud;
		this.handler = handler;
	}
		
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(game.gameState == STATE.Menu) {
			//play button
			if(mouseOver(mx, my, 210, 150, 200, 64)) {
				game.gameState = STATE.Game;
				handler.addObject(new Player(Game1.WIDTH/2-32, Game1.HEIGHT/2-32, ID.Player, handler));
				
				handler.clearEnemys();
				
				handler.addObject(new BasicEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.BasicEnemy, handler));
				
			}
			
			//help button
			if(mouseOver(mx, my, 210, 250, 200, 64)) {
				game.gameState = STATE.Help;
			}
			
			//quit button
			if(mouseOver(mx, my, 210, 350, 200, 64)) {
				System.exit(1);
			}
			
		}
		
		
		//back button for help
		if(game.gameState == STATE.Help) {
			if(mouseOver(mx, my, 210, 350, 200, 64 )) {
				game.gameState = STATE.Menu;
				return;
			}
		}
		
		if(game.gameState == STATE.End) {
			if(mouseOver(mx, my, 210, 350, 200, 64 )) {
				game.gameState = STATE.Game;
				handler.addObject(new Player(Game1.WIDTH/2-32, Game1.HEIGHT/2-32, ID.Player, handler));
				
				handler.clearEnemys();
				
				handler.addObject(new BasicEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.BasicEnemy, handler));
				
				return;
			}
		}

		
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
	
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if(mx > x && mx < x + width) {
			if(my > y && my < y + height) {
				return true;
			}else return false;
		}else return false;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		
		if(game.gameState == STATE.Menu) {
		
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Wave", 240, 70);
	
		g.setFont(fnt2);
		g.drawRect(210, 150, 200, 64);
		g.drawString("Play", 270, 190);
		
		
		g.drawRect(210, 250, 200, 64);
		g.drawString("Help", 270, 290);
		
		g.drawRect(210, 350, 200, 64);
		g.drawString("Quit", 270, 390);
	}else if(game.gameState == STATE.Help) {
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		Font fnt3 = new Font("arial", 1, 20);
		
		g.setFont(fnt);
		g.setColor(Color.WHITE);
		g.drawString("Help", 240, 70);
		
		g.setFont(fnt3);
		g.drawString("Use Arrow keys to move player and dodge enemies", 55, 200);
		
		g.setFont(fnt2);
		g.drawRect(210, 350, 200, 64);
		g.drawString("Back", 270, 390);
	}else if(game.gameState == STATE.End) {
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		Font fnt3 = new Font("arial", 1, 20);
		
		g.setFont(fnt);
		g.setColor(Color.WHITE);
		g.drawString("Game Over", 200, 70);
		
		g.setFont(fnt3);
		g.drawString("You Scored: " + hud.getScore(), 235, 200);
		
		g.setFont(fnt2);
		g.drawRect(210, 350, 200, 64);
		g.drawString("Try Again", 245, 390);
	}
	}
}
