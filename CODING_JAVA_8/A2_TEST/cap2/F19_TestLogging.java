package cap2;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class F19_TestLogging {

	public static void main(String[] args) {
		
		List<String> strings = Stream.of("One", "Two", "Three")
				.filter(obj -> {
					System.out.println("Printing "+obj);
					return !obj.equals("One");
				})
				.collect(Collectors.toList());
		
		System.out.println();
		List<String> strings2 = Stream.of("One", "Two", "Three")
				.filter(obj -> !obj.equals("One"))
				.peek(obj -> System.out.println("Peeked "+obj))
				.collect(Collectors.toList());

	}

}
