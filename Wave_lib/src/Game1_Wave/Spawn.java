package Game1_Wave;

import java.util.Random;

public class Spawn {
	
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	private int scoreKeep = 0;
	
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick() {
		scoreKeep++;
		
		if(scoreKeep >= 1000) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
			if(hud.getLevel() == 2) {
			handler.addObject(new BasicEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 3 ) {
				handler.addObject(new FastEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.FastEnemy, handler));
			
			}else if(hud.getLevel() == 4) {
				handler.addObject(new BasicEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.BasicEnemy, handler));
				
			}else if(hud.getLevel() == 5) {
				handler.addObject(new FastEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.FastEnemy, handler));
				
			}else if(hud.getLevel() == 6) {
				handler.addObject(new FastEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.FastEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.BasicEnemy, handler));
			}else if (hud.getLevel() == 7) {
				handler.addObject(new BasicEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.BasicEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.FastEnemy, handler));
				
			}else if (hud.getLevel() == 8) {
				handler.addObject(new BasicEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.BasicEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game1.WIDTH), r.nextInt(Game1.HEIGHT), ID.FastEnemy, handler));
			}
		}
		
	}

}
