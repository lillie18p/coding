package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Given a list of integers, return a list where each integer is multiplied by 2.
 * 
 * doubling([1, 2, 3]) - [2, 4, 6]
 * doubling([6, 8, 6, 8, -1]) - [12, 16, 12, 16, -2]
 * doubling([]) - []
 * 
 * @author lilith
 *
 */
public class F1_doubling {
	
	public static List<Integer> doubling(List<Integer> nums) {
		return nums
			.stream()
			.map(n -> n*2)
			.collect(Collectors.toList());
	}
	public static List<Integer> doubling_v2(List<Integer> nums) {
	  nums.replaceAll(n -> n * 2);
	  return nums;
	}
	public static void main(String[] args) {
		
		List<Integer> list1=doubling(Arrays.asList(1, 2, 3)); // [2, 4, 6]
		System.out.println(list1);
		List<Integer> list2=doubling(Arrays.asList(6, 8, 6, 8, -1)); // [12, 16, 12, 16, -2]
		System.out.println(list2);
		List<Integer> list3=doubling(Arrays.asList()); // []
		System.out.println(list3);
	}

}
