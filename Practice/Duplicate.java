package Practice;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {8,5,2,3,6,4,2,4,6,7};
		//Map<String, String> w = new HashMap<String, String>();
		for(int i=0;i<a.length;i++) {
			if(a[Math.abs(a[i])]<0) {
				System.out.println("Duplicate values are present");
				return;
			}
			else
				a[Math.abs(a[i])] = -a[Math.abs(a[i])];
		}
		System.out.println("No duplicates in the array");

	}

}
