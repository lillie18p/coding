package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list of the strings,
 * omitting any string length 3 or 4.
 * 


no34(["a", "bb", "ccc"]) -> ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) -> ["a", "bb"]
no34(["ccc", "dddd", "apple"]) -> ["apple"]
 * 
 * @author lilith
 *
 */
public class F16_No34 {
	
	public static List<String> no34(List<String> list){
		return list.stream()
		.filter(n -> !(n.length()==3||n.length()==4))
		.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(no34(Arrays.asList("a", "bb", "ccc")));// -> ["a", "bb"]
		System.out.println(no34(Arrays.asList("a", "bb", "ccc", "dddd")));// -> ["a", "bb"]
		System.out.println(no34(Arrays.asList("ccc", "dddd", "apple")));// ->["apple"]
		
	}

}
