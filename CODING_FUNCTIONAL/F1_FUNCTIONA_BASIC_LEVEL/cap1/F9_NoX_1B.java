package cap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 *Given a list of strings, return a list where each string has all its "x" removed.
 *
 *noX(["ax", "bb", "cx"]) - ["a", "bb", "c"]
 *noX(["xxax", "xbxbx", "xxcx"]) - ["a", "bb", "c"]
 *noX(["x"]) - [""]
 * 
 * @author lilith
 *
 */
public class F9_NoX_1B {
	
		
	public static List<String> noX1A(List<String> strings) {
		strings.replaceAll(s -> findCharGiven(s));
        return strings;		
    }

	private static String findCharGiven(String str) {
		StringBuffer buffer = new StringBuffer();
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='x') {
				
			}else {
				buffer.append(c[i]);
			}
		}
		return buffer.toString();
	}

	public static void main(String[] args) {

		List<String> list1=noX1A(Arrays.asList("xxax", "xbxbx", "xxcx")); 
		System.out.println(list1);
		List<String> list2=noX1A(Arrays.asList("the", "taxi")); 
		System.out.println(list2);
	}

}
