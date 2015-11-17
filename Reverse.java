
public class Reverse {
	public static void main(String[] args) {
		System.out.println(reverse(args[0]));
	}

	public static String reverse(String str) {
		
		if (str.length() <= 1) {
			return str;
		}

		return reverse(str.substring(1))+str.charAt(0);
	}
}