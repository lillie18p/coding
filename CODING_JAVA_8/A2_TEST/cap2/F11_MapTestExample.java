package cap2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class User1{
	
	private String name;
	private Integer age=30;
	
	public User1(String name) {
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
public class F11_MapTestExample {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");
		
		System.out.println("Imperative Style...");
		for (String name: names) {
			if( !name.equals("Greg")) {
				User1 user = new User1(name);
				System.out.println(user);
			}
		}
	
	}

}
