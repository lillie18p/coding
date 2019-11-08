package cap1;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

/**
 * 
 *Given a list of strings, return a list where each string has all its "x" removed.
 *
 *noX(["ax", "bb", "cx"]) - ["a", "bb", "c"]
 *noX(["xxax", "xbxbx", "xxcx"]) - ["a", "bb", "c"]
 *noX(["x"]) - [""]
 * 
 * @author lilith
 *
 */
public class F9_NoXD {
	
	public static void main(String[] args) {
		
		BiFunction<String,String,String> deleteChars = (stringa, caracter)->{
			StringBuffer stringBuffer = new StringBuffer(stringa);
			IntStream.range(0, stringBuffer.length())
				.forEach( index -> {
					while(index<stringBuffer.length() && caracter.indexOf(stringBuffer.charAt(index)) >= 0) {
						stringBuffer.deleteCharAt(index);
					}
				});
			return stringBuffer.toString();
		};
		System.out.println(deleteChars.apply("xxax", "x")); 
		
	}
	
	

}
