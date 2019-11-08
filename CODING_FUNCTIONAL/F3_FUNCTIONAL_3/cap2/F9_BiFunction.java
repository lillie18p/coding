package cap2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class F9_BiFunction {

	public static void main(String[] args) {
		BiFunction<String, Integer, Character> car = String::charAt;
		System.out.println(car.apply("ABCDEF", 2));
		
		BiFunction<String, Character, Integer> car2 = String::indexOf;
		System.out.println(car2.apply("ABxDEF", 'x'));
		
		Function<String, Integer> p= Integer::parseInt;
		System.out.println(p.apply("123"));

		
	}

}
