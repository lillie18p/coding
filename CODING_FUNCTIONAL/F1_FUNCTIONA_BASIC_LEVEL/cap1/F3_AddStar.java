package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Given a list of strings, return a list where
 * each string has "*" added at its end.
 * 
 * addStar(["a", "bb", "ccc"]) - ["a*", "bb*", "ccc*"]
 * addStar(["hello", "there"]) - ["hello*", "there*"]
 * addStar(["*"]) - ["**"]
 * 
 * @author lilith
 *
 */
public class F3_AddStar {
	
	public static List<String> addStar(List<String> nums) {
		return nums
			.stream()
			.map(n -> n+"*")
			.collect(Collectors.toList());
	}
	public static List<String> addStar_v2(List<String> nums) {
	 nums.replaceAll(n -> n + "*");
	  return nums;
	}
	public static void main(String[] args) {
		
		List<String> list1=addStar(Arrays.asList("a", "bb", "ccc")); 
		System.out.println(list1);
		List<String> list2=addStar(Arrays.asList("hello", "there"));
		System.out.println(list2);
		List<String> list3=addStar(Arrays.asList("*")); 
		System.out.println(list3);
	}

}
