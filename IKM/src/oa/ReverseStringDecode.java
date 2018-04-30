package oa;

public class ReverseStringDecode {
	private static String encode(String text) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			b.append(c += c + i);
		}
		return b.reverse().toString();
	}
	
	private static String decode(String encodedMessage) {
		char[] tmp = encodedMessage.toCharArray();
		reverse(tmp, 0, tmp.length - 1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tmp.length; i++) {
			char c = (char) ((tmp[i] - i) / 2);
			sb.append(c);
		}
		return sb.toString();
    }
	
	static void reverse(char[] tmp, int start, int end) {
		while (start < end) {
			char t = tmp[start];
			tmp[start++] = tmp[end];
			tmp[end--] = t;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(encode("h"));
		System.out.println(decode(encode("h")));
		
		System.out.println(encode("ha"));
		System.out.println(decode(encode("ha")));
	}
	
}
