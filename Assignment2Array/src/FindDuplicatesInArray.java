//Program No1
public class FindDuplicatesInArray {

	public static void main(String[] args) {
		int[] ar= {23,45,66,88,23,25,44,88,66};
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j] && ar[i]!=-1) {
					System.out.println(ar[j]+" ");
					ar[j]=-1;
				}
			}
		}
	}
}
		// Output 23,66,88