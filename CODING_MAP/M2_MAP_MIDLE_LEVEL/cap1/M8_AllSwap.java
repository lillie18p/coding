package cap1;

import java.util.HashMap;
import java.util.Map;

/**
 * We'll say that 2 string match if they are non-empty 
 * and their first char are the same.
 * Loop over and the return the given array of non. empty string as follows:
 * if a string matches an earlier string in the array , swap the 2 strings in the array.
 * When a position in the array has been swapped, it no longer matches anything. 
 * Using a map, this can be solved making just one pass over the array.
 * More difficult than it looks
 * 
 * allSwap(["ab", "ac"]) ->["ac", "ab"]
 * allSwap(["ax", "bx", "cx","cy", "by", "aaa","azz"])
 * allSwap(["ax", "bx", "ay", "by","ai", "aj", "bx", "by"])


 * @author lilith
 *
 */
public class M8_AllSwap {

	public static String[] allSwap(String[] strings) {
		  Map<String, Integer> map = new HashMap<>();
		  for (int i = 0; i < strings.length; i++) {
			String key = String.valueOf(strings[i].charAt(0));
			if(map.containsKey(key)) {
				int pos= map.get(key);
				String tmp = strings[pos];
				strings[pos] = strings[i];
				strings[i] = tmp;
				
				//delete
				map.remove(key);
				
			}else {
				map.put(key, i);
			}
		}
		return strings;
	}
	public static void main(String[] args) {
//		String[] strings1 = {"ab", "ac"};
		String[] strings2 = {"ax", "bx", "cx","cy", "by", "aaa","azz"};
//		String[] strings3 = {"ax", "bx", "ay", "by","ai", "aj", "bx", "by"};
//		System.out.println(allSwap(strings1).toString());		
		System.out.println(allSwap(strings2));		
//		System.out.println(allSwap(strings3));
		

	}

}
