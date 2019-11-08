package cap1;

import java.util.HashMap;
import java.util.Map;

/**
 * Loop over the given array of strings to build a result string like this: 
 * when a string appears the 2nd, 4th, 6th, etc. time in the array, 
 * append the string to the result. Return the empty string if no string appears a 2nd time.
 * 
 * wordAppend(["a", "b", "a"]) -> "a"
 * wordAppend(["a", "b", "a", "c", "a", "d", "a"]) -> "aa"
 * wordAppend(["a", "", "a"]) -> "a"
 * 
 * @author lilith
 *
 */
public class M6_WordAppend {

			public static String wordAppend(String[] strings) {
				Map<String, Integer> map = new HashMap<>();
		 
				  String result="";
				  for(int i=0;i<strings.length;i++)
				  {
				    String s=strings[i];
				    if (!map.containsKey(s)) {  // first time we've seen this string
				      map.put(s, 1);
				    }
				    else {
				      //int count = map.get(s);
				      map.put(s, map.get(s) + 1);
				    if (map.get(s)!=1&& map.get(s)%2==0)
				    {
				      result+=s;
				    }
				    }

				  }
				  return result;

		}
	public static void main(String[] args) {
		String[] strings1 = {"a", "b", "a"};
		String[] strings2 = {"a", "b", "a", "c", "a", "d", "a"};
		String[] strings3 = {"a", "", "a"};
		System.out.println(wordAppend(strings1));		
		System.out.println(wordAppend(strings2));		
		System.out.println(wordAppend(strings3));
		

	}

}
