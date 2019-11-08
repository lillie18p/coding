#### Collections

+ Predicate - class Annonymous

	names.stream()
		.filter(new Predicate<String>() {
			public boolean test(String name) {
				return !name.equals("Sam");
			}
		})

#### Filter pass method

	private static boolean isNotSam(String name) {
		return !name.equals("Sam");
	}
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");
		
		names.stream()
		.filter( name ->	isNotSam(name))
		.forEach(System.out::println);
	}
	
#### Class Collections
Method: sort(List<T> list, Comparator<? super T> c)
+ Sorts the specified list according to the order induced by the specified comparator.

	static <T> void	sort(List<T> list, Comparator<? super T> c)
	
Example

	Collections.sort(list, (p1, p2)->p1.getSurname().compareTo(p2.getSurname()));
		list.forEach(n -> System.out.println(n.getSurname()));
		
#### Optional
	
	Optional<String> optional =players
		.stream()
		.filter(player -> player.equals("Sachin"))
		.findFirst();
		
		if(optional.isPresent()) {
			System.out.println("User "+ optional.get() + " is present in the list");
		}
		
#### Thread

	Thread t = new Thread(() ->System.out.println("I am a thread in Lambda"));
		t.start();