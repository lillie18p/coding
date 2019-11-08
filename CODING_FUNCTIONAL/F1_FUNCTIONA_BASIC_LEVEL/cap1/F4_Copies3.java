package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Given a list of strings, return a list where each string is 
 * replaced by 3 copies of the string concatenated together.
 * 
 * copies3(["a", "bb", "ccc"]) - ["aaa", "bbbbbb", "ccccccccc"]
 * copies3(["24", "a", ""]) - ["242424", "aaa", ""]
 * copies3(["hello", "there"]) - ["hellohellohello", "theretherethere"]
 * 
 * @author lilith
 *
 */
public class F4_Copies3 {
	
	public static List<String> copies3_(List<String> strings) {
		return strings
			.stream()
			.map(n -> n + n + n)
			.collect(Collectors.toList());
	}
	public static List<String> copies3(List<String> strings) {//KO
		strings.replaceAll(n -> (n + n + n));
		  return strings;
	}
	public static void main(String[] args) {
		
		List<String> list1=copies3(Arrays.asList("a", "bb", "ccc")); 
		System.out.println(list1);
		List<String> list2=copies3(Arrays.asList("24", "a", ""));
		System.out.println(list2);
		List<String> list3=copies3(Arrays.asList("hello", "there")); 
		System.out.println(list3);
	}

}
