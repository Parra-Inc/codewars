//Translated
import java.util.Random;

public class ThisOddNum {
	public static void main(String[] args) {
		/*for(int i=0; i<500; i+=2)
			System.out.println(Math.random());*/
		System.out.print(isOdd(-9.00)+"7.77");
		//isOdd(-15.2626);
		//System.out.println(randInt(-1000, 1000));
	}

	public int randInt(int min, int max) {
		Random r = new Random();

		int ranNum = r.nextInt((max - min)+1)+min;
		return ranNum;
	}

	public static boolean isOdd(Number n) {
		return (Math.abs(n.doubleValue()%2) == 1);
		//System.out.print(Math.abs(n.doubleValue()));
	}
}