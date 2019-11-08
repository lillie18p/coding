package cap1;

import java.util.stream.IntStream;

class Person{
	 Integer id;
	 String firstName;
	 String lastName;
	 String email;
	 String gender;
	 Integer age;
	 	 
	public Person(Integer id, String firstName, String lastName, String email, String gender, Integer age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


}
class PersonDTO{
	private Integer id;
	private String name;
	private Integer age;
	
	
	public PersonDTO(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	


	public static PersonDTO map(Person person) {
		return new PersonDTO(person.getId(), person.getFirstName(),person.getAge());
	}
}
public class F9_IntStream_Range {

	public static void main(String[] args) {
		//exclusive
		IntStream.range(0,10).forEach(System.out::println);
		
		//Inclusive
		IntStream.rangeClosed(0,10).forEach(System.out::println);
		
//		List<Person> people = Mockadta.getPeople();
//		IntStream.range(startInclusive,  people.size())
//		.forEach(index -> 
//			Person person = people.get(index);
//		sysout.out.println(prson)

	}

}
