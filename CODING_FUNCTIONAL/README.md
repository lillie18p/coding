## Java Functional API

#### STREAM
+ bring functional programming to java, and are supported starting in java 8
+ advantage of stream:

	- will make you a more efficient java programmer
	- Make heavy use of lambda expressions
	- ParallelStreams make it very to multi-thread operations
+ stream can be created from collections, Lists, Sets, ints,longs,doubles, arrays, lines of a line.
+ Stream operation are either intermediate or terminal

	- Intermedial operation:
	 such as filter, map or sort return a stream so we can chain multiple intermediate operations
	- Terminal operations:
	 such as forEach, collect or reduce are either voi or return a non-stream result.
- A stream pipeline consists of a source, followed by zero or more intermediate operations;
and a terminal operation
+ The stream() call sets up the list for mapping. That call is followed by any number of map(lambda) calls to map (or filter) the item values as we have done. 
+ Finally the collect() call collapses the stream down to a list or set or whatever, which is returned. The stream system returns a new collection rather than changing the original. 
+ The stream calls do not modify the original list, returning a new data structure of the results. Note that the boolean logic of filter() is the opposite of removeIf().

#### Lambda Function
	
	names.stream()
		.filter( name ->	!name.equals("Sam"))
		.forEach(name -> System.out.println(name));
		
#### Method Reference
+ static Method Reference
+ Parameter Method Reference
+ Instance Method Reference
+ Constructor Method Reference

	names.stream()
		.filter( FilterTextExample::isNotSam)
		.forEach(System.out::println);

#### Filter - pass custom method 

	private static boolean isNotSam(String name) {
		return !name.equals("Sam");
	}
	
	names.stream()
		.filter( name ->	isNotSam(name))
		.forEach(System.out::println);
		
#### PROGRAMAR AS FUNCTIONAL PROGRAMMING
+ For functional programming you should not modfy state 
+ Java supports closures over values, no closures over variables
+ But state is really useful..

#### Functional Interface

	@FunctionalInterface
	public interface Funcion<T,R>{
		R apply(T t);
	}
	
	
#### Map 
When you want to convert one type to another.

		List<Integer> listRightMost = nums
			.stream()
			.map(n -> n%10)//resto
			.collect(Collectors.toList());
	return listRightMost;

#### ForEach
	
	public static void rightDigit(List<Integer> nums) {
			nums
				.stream()
				.map(n -> n % 10)
				.collect(Collectors.toList())
				.forEach(System.out::print);				
	}
	
#### IntStream 
+ Method range(indexInclusive, indexExclusive)	

	IntStream.range(0,10).forEach(System.out::println);

+ Method rangeClosed(indexInclusive, indexInclusive)	

	IntStream.rangeClosed(0,10).forEach(System.out::println);
		
### Loop vs. Lambda Comparison

Here's a non-lambda solution to the doubling problem, it's a lot longer!

	public List<Integer> doubling(List<Integer> nums) {
	  List<Integer> result = new ArrayList<>();
	  for (Integer n:nums) {
	    result.add(n * 2);
	  }
	  return result;
	}
	
Lambdas don't work for all cases, but for the pattern of transforming each element in a collection, lambdas work great.

### Java Functional Stream
The Java "stream" classes provide another, more flexible way to do mapping. Here is the solution to the doubling problem written with the stream system:

	public List<Integer> doubling(List<Integer> nums) {
	  return nums.stream()
	    .map(n - n * 2)
	    .collect(Collectors.toList());
	}

			
### Interface List<E> extends Collection<E>
+ Method: replaceAll(UnaryOperator<E> operator)
+ Replaces each element of this list with the result of applying the operator to that element.

	default void	replaceAll(UnaryOperator<E> operator)

#### Method: replaceAll(...)
list.replaceAll(lambda) -- calls the lambda once for each item in the list, storing the result back into the list (or other type of collection).

	e.g. nums.replaceAll(n -> n * 2);
		public static List<Integer> doubling_v2(List<Integer> nums) {
		  nums.replaceAll(n -> n * 2);
		  return nums;
		}
### Interface Collection<E> extends Iterable<E>
+ Method: removeIf(Predicate<? super E> filter)
+ Removes all of the elements of this collection that satisfy the given predicate.

	default boolean	removeIf(Predicate<? super E> filter)
	
+ list.removeIf(lambda) -- calls the lambda once for each item in the collection, removing each item where the lambda returns true.

	e.g. nums.removeIf(n -> n < 0);

	

#### Reference site codingbat - coding

	https://codingbat.com/