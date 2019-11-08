package cap2a;

@FunctionalInterface
interface Cab{
	void bookCab();
}


//no  ce bisogno piu delle class concrete
public class F1_Polymorphism {


	public static void main(String[] args) {
	
		// the call the metodo of interface
		Cab cabUberx = () -> {	System.out.println("Uber Booked!! Arriving Soon");	};
		cabUberx.bookCab();
		
		Cab cabClassicTaxi = () -> {	System.out.println("ClassicTaxi Booked!! Arriving Soon");	};
		cabClassicTaxi.bookCab();
		
		
		
	}

}
