package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list of the integers, 
 * omitting any that are less than 0.


noNeg([1, -2]) -> [1]
noNeg([-3, -3, 3, 3]) -> [3, 3]
noNeg([-1, -1, -1]) -> []

 * @author lilith
 *
 */
public class F11_NoNeg {
	
	public static List<Integer> noNeg(List<Integer> list){
		return list.stream()
		.filter(n -> n>=0)
		.collect(Collectors.toList());
		
	}
	public static List<Integer> noNeg_v2(List<Integer> list){
		list.removeIf(n -> n < 0);
	  return list;
	}
	public static void main(String[] args) {
		
		System.out.println(noNeg(Arrays.asList(1, -2)));// -> [1]
		System.out.println(noNeg(Arrays.asList(-3, -3, 3, 3)));// -> [3, 3]
		System.out.println(noNeg(Arrays.asList(-1, -1, -1)));// -> []
		
	}

}
