import java.util.Arrays;

public class MinMax {
	public static void main(String[] args) {
		int result[] = minMax(new int[]{5,6,8,25659,98754,3,7});
		
		for(int i=0; i<result.length; ++i) {
			System.out.println(result[i]);
		}
	}

	public static int[] minMax(int[] arr) {
		
		Arrays.sort(arr);
		int result[] = new int[] {arr[0], arr[arr.length-1]};
		
		return result;
	}
}