package cap2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

enum Gender{
	FEMALE,
	MALE
}
class Person{
	private String name;
	private int age;
	private Gender gender;
	
	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public int ageDifference(final Person other) {
		return age - other.age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
public class F3_FunctionalWithObject {

	public static void main(String[] args) {
		Person p1= new Person("Isa",20, Gender.FEMALE);
		Person p2= new Person("Jorge",16, Gender.MALE);
		Person p3= new Person("Lili",10, Gender.FEMALE);
		List<Person> list = Arrays.asList(p1, p2,p3);
		
		List<Person> newListPersonOrder=list.stream()
			.sorted((a, b)-> a.ageDifference(b))
			.collect(Collectors.toList());
		
		
		
		newListPersonOrder.forEach(System.out::println);
	}

}
