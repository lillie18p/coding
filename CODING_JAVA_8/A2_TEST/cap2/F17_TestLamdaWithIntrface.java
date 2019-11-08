package cap2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class F17_TestLamdaWithIntrface {

	public static void main(String[] args) {

		List<String> players = Arrays.asList("Kholi", "Sachin", "Ganguly","Dhoni","dravid", "Sehwag", "Bhuvaneshwar");
		
		boolean sachinFlag = false;
		for(String player: players) {
			if(player.equals("Sachin")) {
				System.out.println("yes. Sachin is in the squad");
				sachinFlag = true;
			}
		}
		
		if(sachinFlag) {
			System.out.println("yes");
		}
		
//PREDICATE		
		players
		.stream()
		.filter(new Predicate<String>() {
			@Override
			public boolean test(String player) {return player.equals("Sachin");}
		})
		.forEach(player -> System.out.println("yes. Sachin is in the squad"));
		
		players
			.stream()
			.filter(player -> player.equals("Sachin"))
			.forEach(player -> System.out.println("yes. Sachin is in the squad"));
		
		
		Optional<String> optional =players
		.stream()
		.filter(player -> player.equals("Sachin"))
		.findFirst();
		
		if(optional.isPresent()) {
			System.out.println("User "+ optional.get() + " is present in the list");
		}

	}

}
