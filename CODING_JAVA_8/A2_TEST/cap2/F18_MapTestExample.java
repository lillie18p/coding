package cap2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class User4{
	
	private String name;
	private Integer age=30;
	
	public User4(String name) {
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
public class F18_MapTestExample {
	
	private static boolean isNotSam(String name) {
		return !name.equals("Sam");
	}
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");
						
//		if you wan to accumulate
		System.out.println();
		System.out.println("Functional Style...");
		List<User4> userList =names.stream()
							.filter( F18_MapTestExample::isNotSam)
							.map(User4::new)
							.collect(Collectors.toList());

	}

}
