package cap2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;



public class F7_SeveralWaysNumbers {

	public static boolean isMoreThanFifty(int n1, int n2) {
	    return (n1 + n2) > 50;
	  }
	
	  public static List<Integer> findNumbers(
	    List<Integer> list, BiPredicate<Integer, Integer> p) {
	      List<Integer> newList = new ArrayList<>();
	      for(Integer num : list) {
	        if(p.test(num, num + 10)) {
	          newList.add(num);
	        }
	      }
	      return newList;
	  }



	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);

		// Using an anonymous class
		List<Integer> list1 = findNumbers(list, new BiPredicate<Integer, Integer>() {
		  public boolean test(Integer num1, Integer num2) {
		    return F7_SeveralWaysNumbers.isMoreThanFifty(num1, num2);
		  }
		});
		System.out.println(list1);
		System.out.println();
		
		// Using a lambda expression
		List<Integer> list2 =findNumbers(list, (i1, i2) -> F7_SeveralWaysNumbers.isMoreThanFifty(i1, i2));
		System.out.println(list2);
		System.out.println();
		
		// Using a method reference
		List<Integer> list3 =findNumbers(list, F7_SeveralWaysNumbers::isMoreThanFifty);
		System.out.println(list3);
		System.out.println();
	}

}
