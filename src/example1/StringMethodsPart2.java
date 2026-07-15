package example1;

import java.util.Arrays;

public class StringMethodsPart2 {

	public static void main(String[] args) {
		String data = "Hello World";
		
		String result = data.substring(1, 5);
		System.out.println(result);
		
		String result1 = data.replace('l', 'L');
		System.out.println(result1);
		
		System.out.println(data.indexOf('o'));
		
		System.out.println(data.lastIndexOf('o'));
		
		String arr[]=data.split(" ");
		for (String string : arr) {
			System.out.println(string);
		}

		System.out.println(Arrays.toString(arr));
	}

}
