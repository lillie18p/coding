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
class Person2{
	private String name;
	
	private String surname;
	
	private int age;
	
	public Person2(int age, String name, String surname) {
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
public class F10_CollectionComparatorAfter {

	
	
	public static void main(String[] args) {

		List<Person2> list = Arrays.asList(new Person2(1, "John", "White"),new Person2(2, "Adam", "Leedell"), new Person2(4, "Lillie", "Poveda"), new Person2(3, "Anna", "Anton"));
			
		Collections.sort(list, (p1, p2)->p1.getSurname().compareTo(p2.getSurname()));
		list.forEach(n -> System.out.println(n.getSurname()));
	}

}
