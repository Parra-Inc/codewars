
public class ReverseLonger {
	public static void main(String[] args) {
		System.out.println(shorterReverseLonger("hola","papa"));
	}

	public static String shorterReverseLonger(String a, String b) {
		StringBuilder sb;
		String str="";

		if(a != null && b != null) {
			if((a.length() > b.length()) || (a.length() == b.length())) {
				sb = new StringBuilder(a);
				str = b+sb.reverse()+b;
			}else {
				sb = new StringBuilder(b);
				str = a+sb.reverse()+a;
			}
		}

		return str;
	}
}