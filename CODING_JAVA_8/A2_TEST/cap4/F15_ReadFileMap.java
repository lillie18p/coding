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

public class F15_ReadFileMap {

	public static void main(String[] args) throws IOException {
		
//E15		
		Stream<String> rows = Files.lines(Paths.get("data.txt"));
		Map<String, Integer> map =new HashMap<>();
		map = rows
			.map(x -> x.split(","))
			.filter(x -> x.length == 3 )
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.collect(Collectors.toMap(
					x -> x[0],
					x -> Integer.parseInt(x[1])));
		rows.close();
		for(String key:map.keySet()) {
			System.out.println(key+ " "+ map.get(key));
		}
			

	}

}
