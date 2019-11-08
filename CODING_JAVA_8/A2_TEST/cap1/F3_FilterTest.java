package cap1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class F3_FilterTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");
				
		//3
		names.stream()
		.filter( name ->	!name.equals("Sam"))
		.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});
//		
	}

}
