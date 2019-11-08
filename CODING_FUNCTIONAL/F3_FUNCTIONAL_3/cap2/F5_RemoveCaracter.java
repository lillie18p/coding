package cap2;

public class F5_RemoveCaracter {

	public static void main(String[] args) {

		String str="xxax";
	
		StringBuffer stringBuffer = new StringBuffer(str);
		for (int index = 0; index < stringBuffer.length(); index++) {
			while(index<stringBuffer.length()&& stringBuffer.charAt(index)=='x') {
				stringBuffer.deleteCharAt(index);
			}
		}
		
		System.out.println(stringBuffer.toString());
	}

}
