package cap1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class F8_DistinctWithCollector {

	public static void main(String[] args) {
//		final List<Integer> numbers =ImmutableList.of(1,2,2,3,100, 100,23,93,99);
		final List<Integer> numbers =Arrays.asList(1,2,2,3,100, 100,23,93,99);
	Set<Integer>  min =numbers
					.stream()
					.collect(Collectors.toSet());
		System.out.println(min);
	}

}
