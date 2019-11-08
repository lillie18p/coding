package cap2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class User2{
	
	private String name;
	private Integer age=30;
	
	public User2(String name) {
		this.name = name;
		
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
public class F13_ObjectTest {
	
	public static boolean isNotSam(String name) {
		return !name.equals("Sam");
	}
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");
		
		List<User2> newList=names.stream()
		.filter( F13_ObjectTest::isNotSam)
		.map(name ->{
				User2 user = new User2(name);
				return user;	
		})
		.collect(Collectors.toList());
		
		newList.forEach(System.out::println);

	}

}
