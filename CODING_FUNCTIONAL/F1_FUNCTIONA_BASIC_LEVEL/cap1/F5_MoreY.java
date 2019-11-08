package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Given a list of strings, return a list where each string 
 * has "y" added at its start and end.
 * 
 * moreY(["a", "b", "c"]) - ["yay", "yby", "ycy"]
 * moreY(["hello", "there"]) - ["yhelloy", "ytherey"]
 * moreY(["yay"]) - ["yyayy"]
 * 
 * @author lilith
 *
 */
public class F5_MoreY {
	
	public static List<String> moreY(List<String> strings) {
		return strings
			.stream()
			.map(n -> "y" + n + "y")
			.collect(Collectors.toList());
	}
	public static List<String> moreY_v2(List<String> nums) {
	 nums.replaceAll(n -> "y" + n + "y");
	  return nums;
	}
	public static void main(String[] args) {
		
		List<String> list1=moreY(Arrays.asList("a", "b", "c")); 
		System.out.println(list1);
		List<String> list2=moreY(Arrays.asList("hello", "there"));
		System.out.println(list2);
		List<String> list3=moreY(Arrays.asList("yay")); 
		System.out.println(list3);
	}

}
