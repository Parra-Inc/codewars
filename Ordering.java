import java.util.*;

public class Ordering {
	public static void main(String[] args) {
		System.out.println(orderWord("i\"d][@z!#$r(^a&world%"));
	}

	public static String orderWord(String s) {
		if((s == null )|| (s.isEmpty())) {
			return "Not a valid string or it's empty";
		}

		char c[] = s.toCharArray();
		
		Arrays.sort(c);

		/*int i=0;
		while(i<c.length) {
			System.out.print(c[i]);
			i++;
		}*/
		/*for(int i=0; i<c.length; i++) {
			for(int j=0; j<c.length-1; ++j) {
				temp = c[j];
				c[j] = c[j+1];
				c[j+1] = temp;
			}
		}*/

		return String.valueOf(c);
	}
}