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

public class F3_IteratorItem {

	public static void main(String[] args) throws IOException {
	
		IntStream.of(1,23,4,5,6,7)
		.skip(2)
		.filter(i -> i > 5)
		.forEach(i -> System.out.println(i));

	}
}