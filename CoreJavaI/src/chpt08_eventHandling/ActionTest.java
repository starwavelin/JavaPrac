package chpt08_eventHandling;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class ActionTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ActionFrame frame = new ActionFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}


class ActionFrame extends JFrame {
	
	private JPanel buttonPanel;
	
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	
	
	public ActionFrame() {
		setTitle("ActionTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		// add panel to frame
		buttonPanel = new JPanel();
		add(buttonPanel);
		
		//define actions
		Action yellowAction = 
				new ColorAction("Yellow", new ImageIcon("yellowBall.png"), Color.YELLOW);
		Action blueAction = 
				new ColorAction("Blue", new ImageIcon("blueBall.png"), Color.BLUE);
		Action redAction = 
				new ColorAction("Red", new ImageIcon("redBall.png"), Color.RED);
		
		// add buttons onto the panel
		// and buttons are registered with these actions 
		// JButton(Action a)
		buttonPanel.add(new JButton(yellowAction));
		buttonPanel.add(new JButton(blueAction));
		buttonPanel.add(new JButton(redAction));
		
		// associate the Y, B, and R keys with names
		InputMap imap = 
				buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		imap.put(KeyStroke.getKeyStroke("ctrl Y"), "panel.yellow");
		imap.put(KeyStroke.getKeyStroke("ctrl B"), "panel.blue");
		imap.put(KeyStroke.getKeyStroke("ctrl R"), "panel.red");
		
		// associate names with actions
		ActionMap amap = buttonPanel.getActionMap();
		amap.put("panel.yellow", yellowAction);
		amap.put("panel.blue", blueAction);
		amap.put("panel.red", redAction);		
	}
	
	
	class ColorAction extends AbstractAction { // not called ActionAdapter

		public ColorAction(String name, Icon icon, Color c) {
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, "set panel color to " + name.toUpperCase());
			putValue("color", c);
		}
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c = (Color) getValue("color");  // get the color from putValue("color", c); Action#putValue
			buttonPanel.setBackground(c);
		} 
	}  // end of ColorAction class
	
}
