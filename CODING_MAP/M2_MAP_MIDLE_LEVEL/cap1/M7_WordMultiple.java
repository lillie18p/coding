package cap1;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Boolean> 
 * where each different string is a key and its value is true 
 * if that string appears 2 or more times in the array.
 * 
 * wordMultiple(["a", "b", "a", "c", "b"]) -> {"a": true, "b": true, "c": false}
 * wordMultiple(["c", "b", "a"]) -> {"a": false, "b": false, "c": false}
 * wordMultiple(["c", "c", "c", "c"]) -> {"c": true}
 * 
 * @author lilith
 *
 */
public class M7_WordMultiple {

	public static Map<String, Boolean> wordMultiple(String[] strings) {
		  Map<String, Boolean> map = new HashMap<>();
		  boolean trovato=false;
		  
		  for (int i = 0; i < strings.length; i++) {
			for (int j = i+1; j < strings.length; j++) {
				if(strings[i].equals(strings[j])) {
					if(!map.containsKey(strings[j])) {
						map.put(strings[j], true);
						trovato=true;
					}
				}
			}
			if(!trovato && !map.containsKey(strings[i])) {
				map.put(strings[i], false);				
			}
			trovato=false;
		}
		return map;
	  
		}
	public static void main(String[] args) {
		String[] strings1 = {"a", "b", "a", "c", "b"};
		String[] strings2 = {"c", "b", "a"};
		String[] strings3 = {"c", "c", "c", "c"};
		System.out.println(wordMultiple(strings1));		
		System.out.println(wordMultiple(strings2));		
		System.out.println(wordMultiple(strings3));
		

	}

}
