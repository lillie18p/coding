package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class F5_MethodReference {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");
		
		names.stream()
		.filter( name ->	!name.equals("Ryan"))
		.forEach(System.out::println);
		
	}

}
