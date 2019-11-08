package cap1;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of non-empty strings, 
 * return a Map<String, String> with a key for every different first character seen, 
 * with the value of all the strings starting with that character appended together 
 * in the order they appear in the array.
 * 
 * firstChar(["salt", "tea", "soda", "toast"]) -> {"s": "saltsoda", "t": "teatoast"}
 * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) -> {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
 * firstChar([]) -> {}
 * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) -> {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
 * @author lilith
 *
 */
public class M5_FirstChar {
	
	public static Map<String, String> firstChar(String[] strings) {//TODO
		Map<String, String> map = new HashMap<>();
		boolean trovato=false;
		String result="";
		for (int i = 0; i < strings.length; i++) {
			result=strings[i];
			for (int j = i+1; j < strings.length; j++) {
				if(strings[i].substring(0,1).equals(strings[j].substring(0,1))) {
					result = result+strings[j];
					trovato = true;
				}
				
			}
			if(!map.containsKey(strings[i].substring(0,1))) {
				map.put(strings[i].substring(0,1),result);
			}
			if(!trovato && !map.containsKey(strings[i].substring(0,1))) {
				map.put(strings[i].substring(0,1),strings[i]);
			}
			trovato = false;
		}
		return map;
	}
	public static void main(String[] args) {
		String[] strings1 = {"salt", "tea", "soda", "toast"};//, "sopa"
		String[] strings2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
		String[] strings3 = {};
		String[] strings4 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
		String[] strings5 = {"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"}; //{"a": "appleaardvark", "b": "bellsbellsbells", "s": "saltsun", "z": "zen"}
		System.out.println(firstChar(strings1));		
		System.out.println(firstChar(strings2));		
		System.out.println(firstChar(strings3));
		System.out.println(firstChar(strings4));
		System.out.println(firstChar(strings5));
	}

}
