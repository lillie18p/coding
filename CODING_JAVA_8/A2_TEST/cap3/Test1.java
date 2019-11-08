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

public class Test1 {

	public static void main(String[] args) throws IOException {
//E1
//		IntStream
//		.range(1,10)
//		.forEach(System.out::println);

//E2
//		IntStream
//		.range(1,10)
//		.skip(5) //salta i primi 5 numeri 5 compresso
//		.forEach(System.out::println);
		
		IntStream.of(1,23,4,5,6,7)
		.skip(2)
		.filter(i -> i > 5)
		.forEach(i -> System.out.println(i));

//E3		
//		System.out.println(
//		IntStream
//		.range(1,5)
//		.sum());

//E5
//		Stream.of("Ava", "Aneri", "Alberto")
//		.sorted()
//		.findFirst()
//		.ifPresent(System.out::println);
		
//E6		TODO GET LAST
//		Stream.of("Ava", "Aneri", "Alberto")
//		.sorted()
//		.findAny()
//		.ifPresent(System.out::println);

//E7		
//		String[] names= {"A1", "Ankit", "Kushal", "Brent", "Serika", "amanda", "Hans", "Shivika"};
//		Arrays.stream(names) //same of Stream.of(name)
//		.filter(x -> x.startsWith("S"))
//		.sorted()
//		.forEach(System.out::println);

//E8		
//		String[] arrNames= {"A1", "Ankit", "Kushal", "Brent", "Serika", "amanda", "Hans", "Shivika"};
//		Stream.of(arrNames)
//		.filter(x -> x.startsWith("A"))
//		.sorted()
//		.forEach(System.out::println);

//E9		
//		Arrays.stream(new int[] {2,4,6,8,10})
//		.map(a -> a * a)
//		.average()
//		.ifPresent(System.out::println);
		
//E10		
//		List<String> people= Arrays.asList("A1", "Ankit", "Kushal", "Brent", "Serika", "amanda", "Hans", "Shivika");
//		people.stream() 
//		.map(String::toLowerCase)
//		.filter(x -> x.startsWith("s"))
//		.forEach(System.out::println);
	
//E11		
//		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
//		bands
//		.sorted()
//		.filter(x -> x.length() > 13)
//		.forEach(System.out::println);	
//		bands.close();//chiude stream
		
//E12		
//		List<String> bands = Files.lines(Paths.get("bands.txt"))
//		.filter(x -> x.contains("jit"))
//		.collect(Collectors.toList());	
//		bands.forEach(System.out::println);//chiude stream
		
//E13		
//		Stream<String> rows=Files.lines(Paths.get("data.txt"));
//		int rowCount=(int)rows
//		.map(x-> x.split(","))//each row became in array [A 12 3.7]
//		.filter(x -> x.length == 3)
//		.count();
//		System.out.println(rowCount + " rows.");
//		rows.close();
		
//E14		
//		Stream<String> rows = Files.lines(Paths.get("data.txt"));
//		rows
//			.map(x -> x.split(","))
//			.filter(x -> x.length == 3 )
//			.filter(x -> Integer.parseInt(x[1]) > 15)
//			.forEach(x -> System.out.println(x[0]+ " "+x[1]+ " "+x[2]));
//		rows.close();
//		
//E15		
//		Stream<String> rows = Files.lines(Paths.get("data.txt"));
//		Map<String, Integer> map =new HashMap<>();
//		map = rows
//			.map(x -> x.split(","))
//			.filter(x -> x.length == 3 )
//			.filter(x -> Integer.parseInt(x[1]) > 15)
//			.collect(Collectors.toMap(
//					x -> x[0],
//					x -> Integer.parseInt(x[1])));
//		rows.close();
//		for(String key:map.keySet()) {
//			System.out.println(key+ " "+ map.get(key));
//		}
			
//E16		
//		double total =Stream.of(7.3, 1.5, 4.8)
//				.reduce(0.0, (Double a, Double b) ->  a+b);  //a is the total and b is the new data
//		System.out.println("Total = "+total);
		
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
				.summaryStatistics();
		System.out.println(summary);
		
		
		
	}

}
