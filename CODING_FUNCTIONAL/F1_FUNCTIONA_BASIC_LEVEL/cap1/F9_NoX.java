package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * Given a list of strings, return a list where each string has all its "x" removed.
 *
 * noX(["ax", "bb", "cx"]) - ["a", "bb", "c"]
 * noX(["xxax", "xbxbx", "xxcx"]) - ["a", "bb", "c"]
 * noX(["x"]) - [""]
 * 
 * @author lilith
 *
 */


@FunctionalInterface
interface IRemoveChar{
	public String removeX(String str);
}
public class F9_NoX {
	
	
	public static List<String> noX(List<String> strings) {
		 return strings.stream()
				.map(n -> removeChar(n))
				.collect(Collectors.toList());
	}
	public static List<String> noX_v2(List<String> strings) {
		 strings.replaceAll(str -> removeChar(str));
				return strings;
	}
			
	public static String removeChar(String str) {
		String strx="x";
		StringBuffer buffer = new StringBuffer(str);
		int i=0;
			while(i<buffer.length()) {
				if(String.valueOf(buffer.charAt(i)).equals(strx)) {
					buffer.deleteCharAt(i);
					i=0;
				}else {
					i++;
				}
		}
		return buffer.toString();
	}
	public static void main(String[] args) {
		
		System.out.println(noX(Arrays.asList("xxax", "xbxbx", "xxcx"))); 		
		System.out.println(noX(Arrays.asList("the", "taxi"))); 
		
	}

}
