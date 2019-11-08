package cap2;

public class F2_IterateString {

	public static void main(String[] args) {
		String name= "d0mani1nc0ntriamoc1";
		
		name.chars()
//		.filter(c->Character.isDigit(c))
//		.forEach(c -> System.out.println(c));
		.filter(Character::isDigit)
		.forEach(System.out::println);

	}

}
