package cap2;

interface Gamee{
	void play();
}
interface Seriess{
	void play(String type);
}


public class F16_TestLamdaWithIntrface {

	public static void main(String[] args) {
		
//LAMDA		
		Gamee football =() -> System.out.println("I'm playing Football");
		football.play();
		
		Seriess series = (type) -> System.out.println("It's a "+type+ " series");
		series.play("OD1");
	}

}
