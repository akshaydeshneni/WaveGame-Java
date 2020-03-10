package Game1_Wave;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window1 extends Canvas {

	private static final long serialVersionUID = 7406232635667285779L;

	public Window1(int width, int height, String title, Game1 game1) {
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game1);
		frame.setVisible(true);
		game1.start();
	}
}
