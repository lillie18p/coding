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

public class F8_IteratorItem {

	public static void main(String[] args) throws IOException {

//E8		
		String[] arrNames= {"A1", "Ankit", "Kushal", "Brent", "Serika", "amanda", "Hans", "Shivika"};
		Stream.of(arrNames)
		.filter(x -> x.startsWith("A"))
		.sorted()
		.forEach(System.out::println);


		
	}

}
