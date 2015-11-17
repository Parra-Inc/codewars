
public class Rotator {
	public static void main(String[] args) {
		//System.out.println(rotate(new Object[] {1,2,3,4,5},3));
		//Object r[] = rotate(new Object[]{1,2,3,4,5}, -1);
		Object r[] = rotate(new Object[]{'a','b','c','d','e'}, -1);
		
		for(int x=0; x<r.length; x++) {
			System.out.println(r[x].toString());
		}

	}

	public static Object[] rotate(Object[] data, int n) {
		//Object[] rotated = new Object[data.length];
		Object temp;
		
		if(n>0) {
			for (int i=0; i<n; ++i) {
				for(int j=data.length-1; j>0; j--) {
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}
			}	
		}else if(n<0) {
			n *= -1;
			for(int i=0; i<n; ++i) {
				for(int j=0; j<data.length-1; j++) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}else {
			return null;
		}
		//n *= -1;
		/*for (int i=0; i<n; ++i) {
			if(n<0) {
				for(int j=data.length-1; j>0; j--) {
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}	
			}else if(n>0) {
				for(int j=0; j<data.length-1; j++) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}else {
				//return rotated;
				return null;
			}
		}*/

		return data;
	}
}