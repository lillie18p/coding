package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given a list of integers, return a list of the integers, 
 * divible for 2 and get the 6 first number.
 * 
 */

public class F3_IteratorList {
	
	public static List<Integer> IteratorList(List<Integer> list) {
		return list.stream()
		 .filter(num ->num%2==0)
		.limit(6)
		.sorted()
		.collect(Collectors.toList());

	}

	public static void main(String[] args) {
	
	 System.out.println(IteratorList(Arrays.asList(16, 17,66, 21, 48, 10, 12,14, 31, 42,11, 80)));// -> [12, 20]

	}

}
