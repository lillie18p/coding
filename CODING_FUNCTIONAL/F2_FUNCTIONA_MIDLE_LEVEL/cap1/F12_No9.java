package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of non-negative integers, 
 * return a list of those numbers except omitting 
 * any that end with 9. (Note: % by 10)
 * 
 * no9([1, 2, 19]) -> [1, 2]
 * no9([9, 19, 29, 3]) -> [3]
 * no9([1, 2, 3]) -> [1, 2, 3]

 * @author lilith
 *
 */
public class F12_No9 {
	
	public static List<Integer> no9(List<Integer> list){
		return list.stream()
		.filter(n -> !(n%10 ==9))
		.collect(Collectors.toList());
		
	}
	public static List<Integer> noNeg_v2(List<Integer> list){
		list.removeIf(n -> n%10 ==9);
	  return list;
	}
	public static void main(String[] args) {
		
		System.out.println(no9(Arrays.asList(1, 2, 19)));// -> [1, 2]
		System.out.println(no9(Arrays.asList(9, 19, 29, 3)));// -> [3]
		System.out.println(no9(Arrays.asList(1, 2, 3)));// ->[1, 2, 3]
		
	}

}
