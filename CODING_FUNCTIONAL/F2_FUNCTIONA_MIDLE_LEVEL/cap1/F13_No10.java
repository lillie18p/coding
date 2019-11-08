package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list of those numbers, 
 * omitting any that are between 13 and 19 inclusive.
 * 
 * noTeen([12, 13, 19, 20]) -> [12, 20]
 * noTeen([1, 14, 1]) -> [1, 1]
 * noTeen([15]) -> []
 * 
 * @author lilith
 *
 */
public class F13_No10 {
	
	public static List<Integer> noTeen(List<Integer> list){
		return list.stream()
		.filter(n -> !(n>=13 && n<=19))
		.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(noTeen(Arrays.asList(12, 13, 19, 20)));// -> [12, 20]
		System.out.println(noTeen(Arrays.asList(1, 14, 1)));// -> [1, 1]
		System.out.println(noTeen(Arrays.asList(15)));// ->[]
		
	}

}
