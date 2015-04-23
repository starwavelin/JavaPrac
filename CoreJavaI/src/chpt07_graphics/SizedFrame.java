package chpt07_graphics;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SizedFrame extends JFrame {
	
	public SizedFrame() {
		// get screen dimensions
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		// set frame width, height, and let platform pick screen location
		
		setSize(screenWidth / 2, screenHeight / 2);
		this.setLocation(20, 90);
		
		// set frame icon and title
		
		Image img = kit.getImage("icon.jpg");
		setIconImage(img);
		setTitle("SizedFrame");
		
		// add panel
		
		HelloPanel panel = new HelloPanel();
		add(panel);
		
	}
	
	class HelloPanel extends JPanel {
		public static final int MESSAGE_X = 75;
		public static final int MESSAGE_Y = 100;
		
		
		public void paintComponent(Graphics g) {
			g.drawString("HELLO BENJAMIN!", MESSAGE_X, MESSAGE_Y);			
		}
	}
	
}
