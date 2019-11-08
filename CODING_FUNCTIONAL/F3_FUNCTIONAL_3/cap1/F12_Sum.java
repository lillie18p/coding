package cap1;

import java.util.function.BiFunction;

class Calculator{
	public String cal(BiFunction<Integer, Integer, String> bf, Integer num1, Integer num2 ) {
		return bf.apply(num1, num2);
	}
}
public class F12_Sum {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		String result = calculator.cal( (a,b) -> ":"+(a * b), 3, 5);
		System.out.println(result);

	}

}
