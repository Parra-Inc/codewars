public class IdentifierChecker {
	public static boolean isValid(String idn) {
		if(idn == null || idn.length() ==0) 
			return false;
		
		char[] c = idn.toCharArray();
		
		if(!Character.isJavaIdentifierStart(c[0])) {
			return false;
		}
		
		for(int i=1; i < c.length; i++) {
			if(!Character.isJavaIdentifierPart(c[i])) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		
		System.out.println(isValid(args[0])); // should be true
		System.out.println(isValid(args[1])); // should be true
		System.out.println(isValid(args[2])); // should be true
		System.out.println(isValid(args[3])); // should be false
	} 
}