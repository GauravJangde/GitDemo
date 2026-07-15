package example1;

public class StringBufferMethods {

	public static void main(String[] args) {
		String str = new String ("Hello World");
		StringBuffer sb = new StringBuffer("Hello World");
		
		//Length of string
		System.out.println(str.length());
		System.out.println(sb.length());
		
		//Concat or add to string
		System.out.println(str.concat("123"));
		System.out.println(sb.append(1234));
		
		
		

	}

}
