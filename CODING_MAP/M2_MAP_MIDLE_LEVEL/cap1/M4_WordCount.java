package cap1;

import java.util.HashMap;
import java.util.Map;

/**
 * The classic word-count algorithm: given an array of strings, 
 * return a Map<String, Integer> with a key for each different string, 
 * with the value the number of times that string appears in the array.
 * 
 * wordCount(["a", "b", "a", "c", "b"]) -> {"a": 2, "b": 2, "c": 1}
 * wordCount(["c", "b", "a"]) -> {"a": 1, "b": 1, "c": 1}
 * wordCount(["c", "c", "c", "c"]) -> {"c": 4}
 * 
 * @author lilith
 *
 */
public class M4_WordCount {

	public static Map<String, Integer> wordCount(String[] strings) {
	    Map<String, Integer> map = new HashMap<>();
		     String a="";
		     int count=0;
		     for(int i=0; i<strings.length; i++){
		         a=strings[i];
		         for(int j=0; j<strings.length; j++){
		           if(strings[j].equals(a)){
		               count++;
		           }
		         }
		         
		         map.put(a,count);
		         count=0;
		     }
		  return map;
	}
	public static void main(String[] args) {
//		String[] strings1 = {"a", "b", "a", "c", "b"};
//		String[] strings2 = {"c", "b", "a"};
		String[] strings3 = {"c", "c", "c", "c"};
//		System.out.println(wordCount(strings1));		
//		System.out.println(wordCount(strings2));		
		System.out.println(wordCount(strings3));
		

	}

}
