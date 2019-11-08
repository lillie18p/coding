package cap1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The parameter weekday is true if it is a weekday,
 * and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation.
 * Return true if we sleep in.
 * 
 * @author lilith
 *
 */
class Person{
	private String name;
	
	private String surname;
	
	private int age;
	
	public Person(int age, String name, String surname) {
		this.age = age;
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
public class F9_CollectionComparatorFirst {

	
	
	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person(4, "Lili", "Poveda"), new Person(2, "Anna", "Anton"));
		
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getSurname().compareTo(p2.getSurname());
			}
		});
		for(Person p:list)
		System.out.println(p.getName());
		
		//Collections.sort(list, (p1, p2)->p1.getSurname().compareTo(p2.getSurname()));
	}

}
