package cap2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

enum Gender1{
	FEMALE,
	MALE
}
class Person1{
	private String name;
	private int age;
	private Gender gender;
	
	public Person1(String name, int age, Gender gender) {
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
public class F4_ListWithIntStreamAndForEach {

	public static void main(String[] args) {
		Person1 p1= new Person1("Isa",20, Gender.FEMALE);
		Person1 p2= new Person1("Jorge",16, Gender.MALE);
		Person1 p3= new Person1("Lili",10, Gender.FEMALE);
		List<Person1> list = Arrays.asList(p1, p2,p3);
		
		//iterate
		IntStream.range(0, list.size())
		.forEach(index -> {
			Person1 p = list.get(index);
			System.out.println(p.getName()+ " "+ p.getAge()+ " "+p.getGender());
		});

	}

}
