
public class DRoot {
	public static void main(String[] args) {
		System.out.println(digital_root(1)); //must print 7
		//digital_root(94);
	}

	public static int digital_root(int n) {
		int s1=0, s2=0, size;
		size = Integer.toString(n).length();

		if(size==1) {
			return Integer.valueOf(n);	
		}

		while(n>0) {
			s1+=n%10;
			n /= 10;
		}
		if(size>1) {
			while(s1 > 0) {
				s2+= s1%10;
				s1 /= 10;
			}
		}

		return s2;
	}
}