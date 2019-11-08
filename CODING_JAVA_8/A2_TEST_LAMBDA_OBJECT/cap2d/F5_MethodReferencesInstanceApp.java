package cap2d;

interface Calculator2{
	void add(int num1, int num2);
}
class Cal2{
	
	public void letsAdd(int num1, int num2) {
		System.out.println(num1+ " and "+num2+ " addition is: "+(num1+num2));
	}
}
public class F5_MethodReferencesInstanceApp {

	public static void main(String[] args) {
		
		Cal2 cal2 = new Cal2();
		Calculator cRef = cal2::letsAdd;
		cRef.add(11, 14);
	}

}
