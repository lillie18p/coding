package cap4;

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

public class F12_ReadFileSearchSthg {

	public static void main(String[] args) throws IOException {
//E12		
		List<String> bands = Files.lines(Paths.get("bands.txt"))
		.filter(x -> x.contains("jit"))
		.collect(Collectors.toList());	
		bands.forEach(System.out::println);//chiude stream
		

	}

}
