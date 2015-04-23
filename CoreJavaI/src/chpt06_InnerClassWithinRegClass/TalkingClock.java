package chpt06_InnerClassWithinRegClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;


/**
 * A clock that prints the time in regular intervals
 * @author Guru
 *
 */
public class TalkingClock {
	
	private int interval;
	private boolean beep;
	
	
	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}
	
	
	/**
	 * Starts the clock.
	 */
	public void start() {
		ActionListener timePrinter = new TimePrinter();
		Timer t = new Timer(interval, timePrinter);
		t.start();
	}
	
	
	public class TimePrinter implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Date now = new Date();
			System.out.println("At the tone, the time is " + now);
			if (beep) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	
}
