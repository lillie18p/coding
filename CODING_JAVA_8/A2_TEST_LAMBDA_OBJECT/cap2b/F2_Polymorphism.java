package cap2b;

@FunctionalInterface
interface Cab{
	double bookCab(String source, String destination);
}

public class F2_Polymorphism{

	public static void main(String[] args) {
		
		
		Cab cabUberx = (source, destination) -> {	
			System.out.println("Uber Booked!! from "+source + " to "+destination+" + Arriving Soon");
			return 13.5;
		};
		double fare= cabUberx.bookCab("SloaneSquare", "Picadilly");
		System.out.println("Fare shall be: "+fare);
		
		
		
	}

}
