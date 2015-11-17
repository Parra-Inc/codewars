
public class EANValidator {
	public static void main(String[] args) {
		System.out.println(validate("4003301018398"));
		//validate("4256");
	}

	public static boolean validate(final String eanCode) {
		char code[] = eanCode.toCharArray();
		int intCode[] = new int[code.length-1];
		int sum = 0, checksum;
		int last = Integer.parseInt(Character.toString(code[eanCode.length()-1]));

		for(int i=1; i<code.length; i++) {
			if(i%2==0) {
				intCode[i-1] = Integer.parseInt(Character.toString(code[i-1]));
				intCode[i-1] *= 3;
			}else {
				intCode[i-1] = Integer.parseInt(Character.toString(code[i-1]));
				intCode[i-1] *= 1;
			}

			sum += intCode[i-1];
		}

		if(sum%10==0) 
			checksum = 0;
		else
			checksum = (10 - (sum%10));


		if(last == checksum)
			return true;
		else
			return false;		
	}
}