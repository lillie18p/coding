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

public class F7_IteratorItem {

	public static void main(String[] args) throws IOException {

//E7		
		String[] names= {"A1", "Ankit", "Kushal", "Brent", "Serika", "amanda", "Hans", "Shivika"};
		Arrays.stream(names) //same of Stream.of(name)
		.filter(x -> x.startsWith("S"))
		.sorted()
		.forEach(System.out::println);


	}

}
