package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class F2_FilterTest {

	
	private static boolean isNotSam(String name) {
		return !name.equals("Sam");
	}
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");

		names.stream()
		.filter(new Predicate<String>() {
			public boolean test(String name) {
				return !name.equals("Sam");
			}
		})
		.forEach(name -> System.out.println(name));
		System.out.println();
		
		}

}
