package cap1;

import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: 
 * for this problem the map may or may not contain the "a" and "b" keys. 
 * If both keys are present, append their 2 string values together 
 * and store the result under the key "ab".
 * 
 * mapAB({"a": "Hi", "b": "There"}) -> {"a": "Hi", "ab": "HiThere", "b": "There"}
 * mapAB({"a": "Hi"}) -> {"a": "Hi"}
 * mapAB({"b": "There"}) -> {"b": "There"}
 * 
 * @author lilith
 *
 */
public class M3_MapAB {

	public static Map<String, String> mapAB(Map<String, String> map) {
		  if(map.containsKey("a") && map.containsKey("b")){
		    map.put("ab",(map.get("a")+  map.get("b")));		    
		  }
		  return map;
		  
		}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "Hi");
		map.put("b", "There");
		System.out.println(mapAB(map));
//		System.out.println(mapAB({"a": "Hi", "b": "There"}) -> {"a": "Hi", "ab": "HiThere", "b": "There"}
//		System.out.println(mapAB({"a": "Hi"}) -> {"a": "Hi"}
//		System.out.println(mapAB({"b": "There"}) -> {"b": "There"}

	}

}
