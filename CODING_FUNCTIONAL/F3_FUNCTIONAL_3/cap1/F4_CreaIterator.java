package cap1;

import java.util.stream.IntStream;

public class F4_CreaIterator {
	
	public static void display() {
		IntStream.iterate(0, index -> index+1)
		 .limit(6)
		 .forEach(System.out::println);
	}

	public static void main(String[] args) {
	 display();

	}

}
