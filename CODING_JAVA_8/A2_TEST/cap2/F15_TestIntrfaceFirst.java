package cap2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

interface Game{
	void play();
}
interface Series{
	void play(String type);
}
public class F15_TestIntrfaceFirst {

	public static void main(String[] args) {
		Game football = new Game() {
			public void play() {
				System.out.println("I'm playing Football");
			}
		};
		
		Game cricket = new Game() {
			public void play() {
				System.out.println("I'm playing Cricket");
			}
		};
		
		football.play();
		cricket.play();
		


	}

}
