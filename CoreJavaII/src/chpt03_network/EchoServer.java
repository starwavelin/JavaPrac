package chpt03_network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
	
	public static void main(String[] args) {
		
		try {
			// establish Server socket
			ServerSocket serverSocket = new ServerSocket(8189);
			
			// wait for client connection
			Socket incoming = serverSocket.accept();
			
			try {
				
				System.out.println("DEBUG: Inside 2nd try");
				InputStream inStream = incoming.getInputStream();
				OutputStream outStream = incoming.getOutputStream();
				
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(outStream, true); /* true: autoFlush */
				
				out.println("Hello Guru. Please enter EXIT to exit.");
				
				boolean done = false;
				while (!done && in.hasNextLine()) {
					String line = in.nextLine();
					out.println("Echo: " + line);
					if (line.trim().toUpperCase().equals("EXIT")) {
						done = true;
					}
				}
				
			} finally {
				incoming.close();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
