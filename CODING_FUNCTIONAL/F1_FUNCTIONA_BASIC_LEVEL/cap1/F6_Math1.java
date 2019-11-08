package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * 
 * Given a list of integers, return a list where each integer
 * is added to 1 and the result is multiplied by 10.
 * 
 * math1([1, 2, 3]) - [20, 30, 40]
 * math1([6, 8, 6, 8, 1]) - [70, 90, 70, 90, 20]
 * math1([10]) - [110]
 * 
 * @author lilith
 *
 */
public class F6_Math1 {
	
	public static List<Integer> math1(List<Integer> nums) {
		return nums
			.stream()
			.map(n -> n + 1)
			.map(n -> n * 10)
			.collect(Collectors.toList());
	}
	public static List<Integer> math1_v2(List<Integer> nums) {
	 nums.replaceAll(n -> n + 1);
	 nums.replaceAll(n -> n * 10);
	 return nums;
	}
	public static void main(String[] args) {
		
		List<Integer> list1=math1(Arrays.asList(1, 2, 3)); 
		System.out.println(list1);
		List<Integer> list2=math1(Arrays.asList(6, 8, 6, 8, 1));
		System.out.println(list2);
		List<Integer> list3=math1(Arrays.asList(10)); 
		System.out.println(list3);
	}

}
