package example1;

public class StringMethodExamples {

	public static void main(String[] args) {
		String data = "  Apple123   ";
		String data2 = "apple";
//		System.out.println(data.hashCode());
//		System.out.println(data2.hashCode());
// Method 1
//		//System.out.println(data==data2);
//		System.out.println(data.equals(data2));
//		System.out.println(data.equalsIgnoreCase(data2));
		
// Method 2 - length() check
		System.out.println(data.length());

// Method 3 - trim() - remove the white spaces from the start and end
		System.out.println(data);
		data = data.trim();
		System.out.println(data);
		System.out.println(data.length());
		
// Method 4 & 5 - toLowerCase/ toUpperCase
		System.out.println(data.toLowerCase());
		System.out.println(data.toUpperCase());
		
// Method 6 - String Concat - Joining of multiple Strings
		System.out.println(data.concat("abcd"));
		
// Method 7 - charAt()
		System.out.println(data.charAt(2));
		
// Method 8 - contains()
		System.out.println(data.contains("123"));
		
// Method 9 - isEmpty()
		System.out.println(data.isEmpty());
		String data3="";
		System.out.println(data3.isEmpty());
		
	}

}
