package cap2c;

@FunctionalInterface
interface Cab{
	double bookCab(String source, String destination);
}

public class F3_VarInLambda {

	int instanceVar =10;
	static int sVar = 100;
	
	
		Cab cabUberx = (source, destination) -> {
			int localVar=1000;
			System.out.println("Uber Booked!! from "+source + " to "+destination+" + Arriving Soon");
			System.out.println("local variable is "+localVar);
			System.out.println("instance Variable is "+instanceVar);
			System.out.println("static variable is "+F3_VarInLambda.sVar);
			return 13.5;
		};
	
	
	public static void main(String[] args) {
		
		/**
		 * VARIABLE + LAMBDA
		 */
		double fare= new F3_VarInLambda().cabUberx.bookCab("SloaneSquare", "Picadilly");
	
		System.out.println("Fare shall be: "+fare);
		
	}

}
