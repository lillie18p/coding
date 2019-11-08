package cap1;

import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: 
 * if the key "a" has a value, set the key "b" to have that value, 
 * and set the key "a" to have the value "". 
 * Basically "b" is a bully, taking the value and replacing it with the empty string.
 * 
 * mapBully({"a": "candy", "b": "dirt"}) -> {"a": "", "b": "candy"}
 * mapBully({"a": "candy"}) -> {"a": "", "b": "candy"}
 * mapBully({"a": "candy", "b": "carrot", "c": "meh"}) -> {"a": "", "b": "candy", "c": "meh"}
 * @author lilith
 *
 */
public class M1_MapBully {
	
	public static Map<String, String> mapBully(Map<String, String> map) {
		  if(map.containsKey("a")){
		    map.put("b", map.get("a"));
		    map.put("a","");
		  }
		  return map;
		}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "candy");
		map.put("b", "dirt");
		Map<String, String> result =mapBully(map);
		System.out.println(result.toString());

		
			
		
	}

}
