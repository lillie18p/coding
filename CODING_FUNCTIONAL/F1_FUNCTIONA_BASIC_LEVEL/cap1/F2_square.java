package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Given a list of integers, return a list where each integer is multiplied with itself.
 * 
 * square([1, 2, 3]) - [1, 4, 9]
 * square([6, 8, -6, -8, 1]) - [36, 64, 36, 64, 1]
 * square([]) - []
 * 
 * @author lilith
 *
 */
public class F2_square {
	
	public static List<Integer> square(List<Integer> nums) {
		return nums
			.stream()
			.map(n -> n*n)
			//.filter(n -> n >= 0)
			.collect(Collectors.toList());
	}
	public static List<Integer> square_v2(List<Integer> nums) {
	 nums.replaceAll(n -> n * n);
	  return nums;
	}
	public static void main(String[] args) {
		
		List<Integer> list1=square(Arrays.asList(1, 2, 3)); // [2, 4, 6]
		System.out.println(list1);
		List<Integer> list2=square(Arrays.asList(6, 8, -6, -8, 1)); // [12, 16, 12, 16, -2]
		System.out.println(list2);
		List<Integer> list3=square(Arrays.asList()); // []
		System.out.println(list3);
	}

}
