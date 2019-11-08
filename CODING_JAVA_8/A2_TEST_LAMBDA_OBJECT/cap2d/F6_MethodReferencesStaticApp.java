package cap2d;

interface Calculator{
	void add(int num1, int num2);
}
class Cal{
	public static void addSth(int num1, int num2) {
		System.out.println(num1+ " and "+num2+ " addition is: "+(num1+num2));
	}
	
}
public class F6_MethodReferencesStaticApp {

	public static void main(String[] args) {
		Calculator cRef = Cal::addSth;
		cRef.add(11, 14);
	}

}
