package cap2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


class Utente{
	
	private String name;
	private Integer age=30;
	private List<String> phoneNumbers;
	
	public Utente(String name, Integer age, List<String> phoneNumbers) {
		this.name = name;
		this.age = age;
		this.phoneNumbers = phoneNumbers;
		
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "name: "+name+" age: "+age;
	}
}
public class F12_FlapMapTestExample {
	

	public static void main(String[] args) {
		List<Utente> utentes = Arrays.asList(
				new Utente("Peter", 20, Arrays.asList("1", "2")),
				new Utente("Sam", 40, Arrays.asList("3", "4", "5")),
				new Utente("Ryan", 60, Arrays.asList("6")),
				new Utente("Adam", 70, Arrays.asList("7", "8"))
		);
		
		System.out.println("Functional Style: ");
		Optional<String> stringOptional = utentes.stream()
				.map(utente -> utente.getPhoneNumbers().stream())
				.flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("5")))
				.findAny();
		
		stringOptional.ifPresent(System.out::println);
		

	}

}
