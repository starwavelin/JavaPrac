package io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadWriteLog {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		// Path
		String path = "./src/io/";
		
		// Read the string filename
		String filename;
		filename = scan.nextLine();
		
		try {
			// Setup file reading 
			BufferedReader br = new BufferedReader(new FileReader(new File(path + filename)));
			
			String line;
			Map<String, Integer> map = new HashMap<>();
			while ((line = br.readLine()) != null) {
				String[] strs = line.split(" ");
				if (!map.containsKey(strs[0])) {
					map.put(strs[0], 1);
				} else {
					map.put(strs[0], map.get(strs[0]) + 1);
				}
			}
			
			// Setup file output process
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(path + "records_" + filename))));
			
			for (String key: map.keySet()) {
				bw.write(key + " " + map.get(key));
				bw.newLine();
			} 
			br.close();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
