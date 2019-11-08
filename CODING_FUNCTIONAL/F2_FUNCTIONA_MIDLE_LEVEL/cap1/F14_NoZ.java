package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list of the strings, 
 * omitting any string that contains a "z". 
 * (Note: the str.contains(x) method returns a boolean)
 * 
 * noZ(["aaa", "bbb", "aza"]) -> ["aaa", "bbb"]
 * noZ(["hziz", "hzello", "hi"]) -> ["hi"]
 * noZ(["hello", "howz", "are", "youz"]) -> ["hello", "are"]
 * 
 * @author lilith
 *
 */
public class F14_NoZ {
	
	public static List<String> noZ(List<String> list){
		return list.stream()
		.filter(n -> !(n.contains("z")))
		.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(noZ(Arrays.asList("aaa", "bbb", "aza")));// -> ["aaa", "bbb"]
		System.out.println(noZ(Arrays.asList("hziz", "hzello", "hi")));// -> ["hi"]
		System.out.println(noZ(Arrays.asList("hello", "howz", "are", "youz")));// ->["hello", "are"]
		
	}

}
