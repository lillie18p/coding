package cap1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class F10_Min {

	public static void main(String[] args) {
//		final List<Integer> numbers =ImmutableList.of(1,2,3,100,23,93,99);
		
		final List<Integer> numbers =Arrays.asList(1,2,3,100,23,93,99);
		Integer min = numbers.stream()
				//.min(number1,number2) ->number1 > numb2 ? 1: -1)
				.min(Comparator.naturalOrder())
				.get();
		System.out.println(min);
	}

}
