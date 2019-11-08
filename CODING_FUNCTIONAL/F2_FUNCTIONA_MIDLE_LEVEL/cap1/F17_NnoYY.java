package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string 
 * has "y" added at its end, omitting any resulting strings 
 * that contain "yy" as a substring anywhere.


noYY(["a", "b", "c"]) -> ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) -> ["ay", "by"]
noYY(["xx", "ya", "zz"]) -> ["xxy", "yay", "zzy"]

 * 
 * @author lilith
 *
 */
public class F17_NnoYY {
	
	public static List<String> noYY(List<String> list){
		return list.stream()
		.map(n -> (n + "y"))
		.filter(n ->  !(n.contains("yy")))
		.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(noYY(Arrays.asList("a", "b", "c")));// -> ["ay", "by", "cy"]
		System.out.println(noYY(Arrays.asList("a", "b", "cy")));// -> ["ay", "by"]
		System.out.println(noYY(Arrays.asList("xx", "ya", "zz")));// -> ["xxy", "yay", "zzy"]

		
	}

}
