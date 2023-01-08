//Program No4
public class MergeSort {
		public static void MSort(int[] ar,int low,int high) {
			if(low<high) {
				int mid=(low+high)/2;
				MSort(ar,low,mid);
				MSort(ar,mid+1,high);
				Merge(ar,low,mid,high);
			}
		}
		public static void Merge(int[] ar,int low,int mid,int high) {
			int[] temp=new int[high-low+1];
			int i=low;
			int j=mid+1;
			int k=0;
			
			while(i<=mid && j<=high) {
				if(ar[i]<ar[j]) {
					temp[k++]=ar[i++];
				}else {
					temp[k++]=ar[j++];
				}
			}
			while(i<=mid) {
				temp[k++]=ar[i++];
			}
			while(j<=high) {
				temp[k++]=ar[j++];
			}
			for(int a=0,b=low;a<temp.length;a++,b++) {
				ar[b]=temp[a];
			}
			
		}
	public static void main(String[] args) {
		int[] ar=new int[]{6,8,10,2,4,1,9};
		int len=ar.length;
		MSort(ar,0,len-1);
		for(int a:ar) {
			System.out.print(a+" ");
		}
	}

}
