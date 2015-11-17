import java.util.*;

public class AreSame {
	public static void main(String[] args) {
		//System.out.print(comp(new int[]{2,4,7,1,8,5,9}, new int[]{81,4,16,25,49,1,64}));
		//System.out.print(comp(new int[]{}, new int[]{}));
		//comp(new int[]{0, -14, 191, 161, 19, 144, 195, 1}, new int[]{1, 0, 14*14, 191*191, 161*161, 19*19, 144*144, 195*195});
		System.out.print(comp(new int[]{0, -14, 191, 161, 19, 144, 195, 1}, new int[]{1, 0, 14*14, 191*191, 161*161, 19*19, 144*144, 195*195}));
	}

	public static boolean comp(int[] a, int[]b) {
		//if(((a == null) || (b == null)) && ((a.length==0) || (b.length==0))) return false;
		if((a == null) || (b == null)) return false;

		//Arrays.sort(a1);
		Arrays.sort(a);
		for(int x=0; x<a.length; ++x) {
			if(a[x]<0) a[x] *= -1; 
		}
		Arrays.sort(a);
		Arrays.sort(b);

		//This works for non-negative int arrays
		//Arrays.sort(a);
		//Arrays.sort(b);

		if(a.length == b.length) {
			for(int i=0; i<a.length; ++i) {
				if((a[i]*a[i]) != b[i]) return false;
			}	
		}
		return true;
		
		//System.out.println(a[0] + " " + b[0]);
		//return null;
	}
}