package cap1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class F6_Distinct {

	public static void main(String[] args) {
//		final List<Integer> numbers =ImmutableList.of(1,2,2,3,100, 100,23,93,99);
		final List<Integer> numbers =Arrays.asList(1,2,2,3,100, 100,23,93,99);
		 
	List<Integer>  min =numbers
					.stream()
					.distinct()
					.collect(Collectors.toList());
		System.out.println(min);
	}

}
