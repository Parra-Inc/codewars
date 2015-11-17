
public class CompleteThePattern {
	public static void main(String[] args) {
		System.out.println(pattern(Integer.parseInt(args[0])));
		//pattern(Integer.parseInt(args[0]));
	}

	public static String pattern(int n) {
		
		//String m = Integer.toString(n);
		if(n < 1) {
			return "";
		}
		
		String sa[] = new String[n];
		String s = "";

		int x = 0;
		sa[0] = Integer.toString(n);
		while(x < sa.length-1) {
			sa[x+1] = sa[x]+Integer.toString(n-1);
			x++; n--;
		}
		

		int i = sa.length;
		//int i =0;
		while(i > 0) {
			//if(s.substring(0, i-1).length() >= m.length()) 
				//s += "\n"+s.substring(0, i-1);
			//s += "\n"+s.substring(0,i-1);
			s += sa[i-1]+"\n";
			i--;
		}	
		
		
		return s.trim();
	}
}