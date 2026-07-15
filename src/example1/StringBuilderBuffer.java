package example1;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello World");
		System.out.println(sb);
		sb.append(" to Java");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
