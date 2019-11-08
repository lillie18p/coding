package cap1;

import java.util.HashMap;
import java.util.Map;

/**
 * We'll say that 2 strings "match" if they are non-empty 
 * and their first chars are the same. 
 * Loop over and then return the given array of non-empty strings as follows: 
 * if a string matches an earlier string in the array, swap the 2 strings in the array. 
 * A particular first char can only cause 1 swap, so once a char has caused a swap, 
 * its later swaps are disabled. 
 * Using a map, this can be solved making just one pass over the array. 
 * More difficult than it looks.


firstSwap(["ab", "ac"]) ->["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) ->["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) ->["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]


 * @author lilith
 *
 */
public class M9_FirstSwap {

	public static String[] firstSwap(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String temp="";
		
		  for (int i = 0; i < strings.length; i++) {//ax", "bx", "ay", "by", "ai", "aj", "bx", "by
			for (int j = i+1; j < strings.length; j++) {
				if(strings[i].substring(0,1).equals((strings[j].substring(0,1)))){
					if(!map.containsKey(strings[i].substring(0,1))) {
					
							temp = strings[i];
							strings[i]= strings[j];
							strings[j]=temp;
							map.put(strings[i].substring(0,1), 1);
							
							break;
						}
					}
				}
			
			
		}
		  return strings;
	}
	public static void main(String[] args) {
//		String[] strings1 = {"ab", "ac"};
//		String[] strings2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
//		String[] strings3 = {"ax", "bx", "ay", "by","ai", "aj", "bx", "by"};
//		
		String[] strings4 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}; //-> ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
//		String[] strings5 = {"ax", "bx", "cx", "ay", "cy", "aaa", "abb"}; // -> ["ay", "bx", "cy", "ax", "cx", "aaa", "abb"]
//		System.out.println(firstSwap(strings1).toString());
		String[] stringsR = firstSwap(strings4);
		for (int i = 0; i < stringsR.length; i++) {
			System.out.print(stringsR[i]+ " ");	
		}
			
//		System.out.println(allSwap(strings3));
		

	}

}
