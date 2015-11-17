
public class Stairs {
	public static void main(String[] args) {
		System.out.println(NumberOfSteps(6,4));	
	}

	public static int NumberOfSteps(int n, int m) {
		int steps;

		steps = (int) (n+1)/2;

		for(int i=steps; i<n+1; i++) {
			if(i%m==0)
				return i;
		}
		return -1;

	}
}