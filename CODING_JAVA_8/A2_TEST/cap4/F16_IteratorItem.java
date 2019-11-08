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

public class F16_IteratorItem {

	public static void main(String[] args) throws IOException {

//E16		
		double total =Stream.of(7.3, 1.5, 4.8)
				.reduce(0.0, (Double a, Double b) ->  a+b);  //a is the total and b is the new data
		System.out.println("Total = "+total);
		
	
	}

}
