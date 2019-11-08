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

public class F13_ReadFileDoSplit {

	public static void main(String[] args) throws IOException {

//E13		
		Stream<String> rows=Files.lines(Paths.get("data.txt"));
		int rowCount=(int)rows
		.map(x-> x.split(","))//each row became in array [A 12 3.7]
		.filter(x -> x.length == 3)
		.count();
		System.out.println(rowCount + " rows.");
		rows.close();
		

		
	}

}
