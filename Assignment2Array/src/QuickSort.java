//Program No2
public class QuickSort {
	public static void QSort(int[] ar,int low,int high) {
		if(low<high) {
			int pivot=Partition(ar,low,high);
			QSort(ar,low,pivot-1);
			QSort(ar,pivot+1,high);
		}
	}
	public static int Partition(int[] ar,int low,int high) {
		int pivot=ar[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(pivot>ar[j]) {
				i++;
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		i++;
		int temp=ar[i];
		ar[i]=pivot;
		ar[high]=temp;
		
		return i;
	}
	
	
	public static void main(String[] args) {
		int[] ar=new int[]{6,8,10,2,4,1,9};
		int len=ar.length;
		
		QSort(ar,0,len-1);
		for(int a:ar) {
		System.out.print(a+" ");
		}
	}

}
