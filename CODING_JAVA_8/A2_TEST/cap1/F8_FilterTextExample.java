package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class F8_FilterTextExample {

	
	private static boolean isNotSam(String name) {
		return !name.equals("Sam");
	}
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");
			
		
		names.stream()
		.filter( F8_FilterTextExample::isNotSam)
		.forEach(System.out::println);
		

	}

}
