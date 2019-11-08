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

public class F14_ReadFileDoSthg {

	public static void main(String[] args) throws IOException {
	
//E14		
		Stream<String> rows = Files.lines(Paths.get("data.txt"));
		rows
			.map(x -> x.split(","))
			.filter(x -> x.length == 3 )
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.forEach(x -> System.out.println(x[0]+ " "+x[1]+ " "+x[2]));
		rows.close();
	
	}

}
