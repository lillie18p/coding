package cap2d;


interface Messenger{
	Message getMessage(String msg);
}
class Message{
	Message(String msg){
		System.out.println(">> Message is: "+msg);
	}
}

public class F4_MethodReferencesConstructoreApp {

	public static void main(String[] args) {
		
		Messenger mReg = Message::new;
		mReg.getMessage("Search the candle rather than cursing the darkness!!");
	}

}
