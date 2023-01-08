//Program No5
public class SelectionSort {

	public static void main(String[] args) {
		int[] ar=new int[]{6,8,10,2,4,1,9};
		
		for(int i=0;i<ar.length-1;i++) {
			int min=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[min]) {
					min=j;
				}
			}
			int temp=ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
		}
	for(int a:ar) {
		System.out.print(a+" ");
	}	
	}

}
