package cap1;

/**
 * The parameter weekday is true if it is a weekday,
 * and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation.
 * Return true if we sleep in.
 * 
 * @author lilith
 *
 */
public class F11_Thread {

	
	public static void main(String[] args) {

		Thread t = new Thread(() ->System.out.println("I am a thread in Lambda"));
		t.start();
	}

}
