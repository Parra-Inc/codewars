/*import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;*/
import java.util.*;
public class Xbonacci {
	public static void main(String[] args) {
		Xbonacci x = new Xbonacci();
		//x.fibo(new int[]{1,1,1}, 5);
		double rs[] = x.tribonacci(new double[] {0,9,1}, 1);
		//x.tribonacci(new double[] {2,0,18}, 2);
		
		for(int a=0; a<rs.length; a++) {
			System.out.print(rs[a]+" ");
		}
	}

	public double[] tribonacci(double[] s, int n) {
		List<Double> tribo = new ArrayList<Double>();
		double trib[] = new double[n];
		double trib2[] = new double[tribo.size()];
		int x = 3;
		Double value = new Double(0);

		for (double ss : s) {
			tribo.add(ss);
		}
		while(x < n) {
			value = (tribo.get(x-1) + tribo.get(x-2) + tribo.get(x-3));
			tribo.add(x, value);
			++x;
		}
		trib2 = convert(tribo);
		for(int i=0; i<n; i++) {
			trib[i] = trib2[i];
		}
		return trib;
	}

	public static double[] convert(List<Double> d) {
		double prim[] = new double[d.size()];
		
		for(int i=0; i<prim.length; i++)
			prim[i] = d.get(i).doubleValue();

		return prim;
	}
}