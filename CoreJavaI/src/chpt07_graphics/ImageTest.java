package chpt07_graphics;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageTest {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ImageFrame frame = new ImageFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
	
}

class ImageFrame extends JFrame {
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	
	public ImageFrame() {
		setTitle("Image Test");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		ImageComponent component = new ImageComponent();
		add(component);
	}
	
}


class ImageComponent extends JPanel {
	private Image image;
	
	public ImageComponent() {
		try {
			image = ImageIO.read(new File("purpleBall.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g) {
		if (image == null) {
			return;
		}
		
		int imageWidth = image.getWidth(this);
		int imageHeight = image.getHeight(this);
		
		// draw the image in the top-left corner
		g.drawImage(image, 0, 0, null);
		
		// tile the image across the component
		for (int i = 0; i * imageWidth <= getWidth(); i++) {
			for (int j = 0; j * imageHeight <= getHeight(); j++) {
				if (i + j > 0) {
					g.copyArea(0, 0, imageWidth, imageHeight, i * imageWidth, j * imageHeight);
				}
			}
		}
	}
}