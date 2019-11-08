package cap1;

import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: if the key "a" has a value, 
 * set the key "b" to have that same value. In all cases remove the key "c", 
 * leaving the rest of the map unchanged.
 * 
 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) -> {"a": "aaa", "b": "aaa"}
 * mapShare({"b": "xyz", "c": "ccc"}) -> {"b": "xyz"}
 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) -> {"a": "aaa", "b": "aaa", "d": "hi"}

 * @author lilith
 *
 */
public class M2_MapShare {

	public static Map<String, String> mapShare(Map<String, String> map) {
		  if(map.containsKey("a")){
		    map.put("b", map.get("a"));
		  }
		  map.remove("c");
		  return map;
		}
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "aaa");
		map.put("b", "bbb");
		map.put("c", "ccc");
		System.out.println(mapShare(map));
//		System.out.println(mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}));//-> {"a": "aaa", "b": "aaa"}
//		System.out.println(mapShare({"b": "xyz", "c": "ccc"}));// {"b": "xyz"}
//		System.out.println(mapShare({"a": "aaa", "c": "meh", "d": "hi"}));// {"a": "aaa", "b": "aaa", "d": "hi"}
	}
	
}
