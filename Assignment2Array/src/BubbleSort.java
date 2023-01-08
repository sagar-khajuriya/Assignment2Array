//Program No3
public class BubbleSort {
//Bubble Sort
	public static void main(String[] args) {
		int[] ar=new int[]{6,8,10,2,4,1,9};
		
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int a:ar) {
			System.out.print(a+" ");
		}
		
	}

}
