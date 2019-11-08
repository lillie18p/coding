package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * Given a list of strings, return a list where each string
 * has all its "x" removed.
 * 
 * noX(["ax", "bb", "cx"]) - ["a", "bb", "c"]
 * noX(["xxax", "xbxbx", "xxcx"]) - ["a", "bb", "c"]
 * noX(["x"]) - [""]
 * 
 * @author lilith
 *
 */


public class F9_NoX_1A {//TODO
	
	public List<String> noX(List<String> lista) {
        lista.replaceAll(str -> func.apply(str));
        return lista;
    }

    Function<String, String> func = s -> {
        if (s.equals("")) return s;
        if (s.charAt(0) == 'x') return this.func.apply(s.substring(1));
        else return s.charAt(0) + this.func.apply(s.substring(1));
    };
	
    public static void main(String[] args) {
    	F9_NoX_1A aa = new F9_NoX_1A();
		List<String> list1=aa.noX(Arrays.asList("xxax", "xbxbx", "xxcx")); 
		System.out.println(list1);
		List<String> list2=aa.noX(Arrays.asList("the", "taxi")); 
		System.out.println(list2);
	}

}
