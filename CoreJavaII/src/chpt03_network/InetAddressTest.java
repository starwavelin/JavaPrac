package chpt03_network;

import java.net.InetAddress;

/**
 * Print Internet address
 * of my local host
 *
 */
public class InetAddressTest {
	
	public static void main(String[] args) {
		try {
			if (args.length > 0) {
				String host = args[0];
				InetAddress[] addresses = InetAddress.getAllByName(host);
				for (InetAddress addr : addresses) {
					System.out.println(addr);
				}
			} else {
				InetAddress localHostAddress = InetAddress.getLocalHost();
				System.out.println(localHostAddress);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
