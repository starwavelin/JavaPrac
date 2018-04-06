package demo;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class SSingleNumberTest {

	@Test
	void test1() {
		SSingleNumber s = new SSingleNumber();
		int[] input = new int[] {1, 2, 3, 2};
		assertEquals("should return 2", 2, s.getSingleNum(input));
	}
	
	@Test
	void test2() {
		SSingleNumber s = new SSingleNumber();
		int[] input = new int[] {3, 2, 4, 1, 7, 5, 6, 5};
		assertEquals("should return 2", 5, s.getSingleNum(input));
	}
	
}
