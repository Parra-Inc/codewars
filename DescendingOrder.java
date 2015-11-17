import java.util.*;

public class DescendingOrder {
	public static void main(String[] args) {
		System.out.println(sortDesc(5841659));
	}	

	public static int sortDesc(final int num) {
		StringBuilder sb = new StringBuilder();
		char c[] = Integer.toString(num).toCharArray();
		Arrays.sort(c);
		
		sb.append(c).reverse();
		
		return Integer.parseInt(sb.toString());
	}
}