package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Given a list of strings, return a list 
 * where each string is converted to lower
 * case (Note: String toLowerCase() method).
 * 
 * lower(["Hello", "Hi"]) - ["hello", "hi"]
 * lower(["AAA", "BBB", "ccc"]) - ["aaa", "bbb", "ccc"]
 * lower(["KitteN", "ChocolaTE"]) - ["kitten", "chocolate"]
 * 
 * @author lilith
 *
 */
public class F8_Lower {
	
	public static List<String> lower_(List<String> nums) {
		return nums
			.stream()
			.map(n -> n.toLowerCase())//resto
			.collect(Collectors.toList());
	}
	public static List<String> lower(List<String> nums) {
	 nums.replaceAll(n -> n.toLowerCase());
	  return nums;
	}
	public static void main(String[] args) {
		
		List<String> list1=lower(Arrays.asList("Hello", "Hi")); 
		System.out.println(list1);
		List<String> list2=lower(Arrays.asList("AAA", "BBB", "ccc"));
		System.out.println(list2);
		List<String> list3=lower(Arrays.asList("KitteN", "ChocolaTE")); 
		System.out.println(list3);
	}

}
