package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list of the strings, 
 * omitting any string length 4 or more.
 * 
 * noLong(["this", "not", "too", "long"]) -> ["not", "too"]
noLong(["a", "bbb", "cccc"]) -> ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) -> []
 * 
 * @author lilith
 *
 */
public class F15_NoLong {
	
	public static List<String> noLong(List<String> list){
		return list.stream()
		.filter(n -> !(n.length()>=4))
		.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(noLong(Arrays.asList("this", "not", "too", "long")));// -> ["not", "too"]
		System.out.println(noLong(Arrays.asList("a", "bbb", "cccc")));// -> ["a", "bbb"]
		System.out.println(noLong(Arrays.asList("cccc", "cccc", "cccc")));// ->[]
		
	}

}
