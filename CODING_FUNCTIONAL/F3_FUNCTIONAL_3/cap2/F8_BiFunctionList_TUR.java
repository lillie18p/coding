package cap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class F8_BiFunctionList_TUR {
	
	/**
	 * There are three type of parameters
	 * T for the type of item in the fir list
	 * U for the type of item in the second list
	 * R for whatever type combination function return
	 * @param list1
	 * @param list2
	 * @param combiner
	 * @return
	 */
	private static <T, U, R> List<R> listCombiner(List<T> list1, List<U> list2, BiFunction<T, U, R> combinerByFunction){
		List<R> result = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			result.add(combinerByFunction.apply(list1.get(i), list2.get(i)));
		}
		return result;
	}

	public static void main(String[] args) {
		List<String>  list1= Arrays.asList("a","b", "c");
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		
		List<String> lista =listCombiner(list1, list2, (a,b) -> a+b);
		System.out.println(lista);


	}

}
