package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 *Given a list of non-negative integers, 
 *return an integer list of the rightmost digits.
 * (Note: use %)
 * 
 * rightDigit([1, 22, 93]) - [1, 2, 3]
 * rightDigit([16, 8, 886, 8, 1]) - [6, 8, 6, 8, 1]
 * rightDigit([10, 0]) - [0, 0]
 * 
 * @author lilith
 *
 */
public class F7_RightDigit {
	

	public static List<Integer> rightDigit(List<Integer> nums) {
		return nums
				.stream()
				.map(n -> n % 10)
				.collect(Collectors.toList());
				//.forEach(System.out::print);
				//.forEach(System.out::print);
		
	}
	public static List<Integer> rightDigit_v2(List<Integer> nums) {
		nums.replaceAll(n -> n % 10);
//		nums.forEach(System.out::print);
//		System.out.println();
		return nums;
	}
	public static void main(String[] args) {
		
//		List<Integer> list1=rightDigit(Arrays.asList(1, 22, 93)); 
//		System.out.println(list1);
//		List<Integer> list2=rightDigit(Arrays.asList(16, 8, 886, 8, 1));
//		System.out.println(list2);
//		List<Integer> list3=rightDigit(Arrays.asList(10, 0)); 
//		System.out.println(list3);
		
		
		rightDigit(Arrays.asList(1, 22, 93)); 
		rightDigit(Arrays.asList(16, 8, 886, 8, 1)); 
		rightDigit(Arrays.asList(10, 0));
		
		
//		System.out.println(rightDigit(Arrays.asList(1, 22, 93)));
//		System.out.println(rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
//		System.out.println(rightDigit(Arrays.asList(10, 0))); 

	}

}
