package chpt03_network;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Get Time of Day using Socket 
 *
 */
public class SocketTest {
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("time-A.timefreq.bldrdoc.gov", 13);
			socket.setSoTimeout(10000);
			try {
				InputStream inStream = socket.getInputStream();
				Scanner sc = new Scanner(inStream);
				while (sc.hasNextLine()) {
					String line = sc.nextLine();
					System.out.println(line);
				}
			} finally { socket.close(); }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
