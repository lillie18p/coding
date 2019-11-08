package cap2;

import java.util.function.BiConsumer;

public class F1_TransformMethodIntoLamda {

//	private static void process(int[] nums, int key) {
//		for(int num: nums) {
//			System.out.println(num+key);
//		}
//	}
	
	private static void process(int[] nums, int key, BiConsumer<Integer, Integer> consumer) {
		for(int num: nums) {
			consumer.accept(num, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return consumer;
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		int key=2;
		
//		process(nums, key);
		
//		solution 1
//		process(nums, key, (a,k)->{
//			try {
//				System.out.println(a/k);
//			}catch(ArithmeticException e) {
//				System.out.println("An Arithmetic exception happened");
//			}
//		});

		process(nums, key, wrapperLambda((v,k) ->System.out.println(v/k)));
		
	}

}
