package cap1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Create iterator with 
 * IntStream.itreator(0, i -> i+1)
 * 
 * 
 */

public class F5_CreateIteratorEvenNumber {
	
	public static void display() {
		IntStream.iterate(0, index -> index+1)
		 .filter(num ->num%2==0)
		.limit(6)
		 .forEach(System.out::println);
	}

	public static void main(String[] args) {
	 display();
	 	 
	}

}
