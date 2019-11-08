package cap1;

import java.util.Arrays;
import java.util.List;

public class F1_Boolean {

	public static boolean getCity(List<String>cities) {
		boolean found = false;
		for(String city:cities) {
			if(city.equals("Chicago")) {
				found = true;
				break;
			}
		}
		return found;
	}
	
	public static void getCity_v2(List<String> cities) {
		System.out.println("Found Chicago?"+ cities.contains("Chicago"));
	}
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("New York", "California", "Chicago", "Los Angeles");
		System.out.println("Found Chicago?"+ getCity(cities));

	}

}
