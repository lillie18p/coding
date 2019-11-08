package cap3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class F9_IteratorItem {

	public static void main(String[] args) throws IOException {
//E9		
		Arrays.stream(new int[] {2,4,6,8,10})
		.map(a -> a * a)
		.average()
		.ifPresent(System.out::println);
		
	}

}
