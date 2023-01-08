//Program No6
public class SubsetArray {

	public static void main(String[] args) {
		int[] ar1= {1,2,3,4,5};
		int[] ar2={10,9,8,7,6,1,2,3,4,5};
		int len=ar1.length;
		boolean flag=false;
		int count=0;
			for(int i=0;i<ar2.length;i++) {
				
				for(int j=0;j<ar1.length;j++) {
					if(ar2[i]==ar1[j]) {
						count++;
						if(count==len) {
							flag=true;
							break;
					}
				}
			}
		}
		if(flag==false) {
			System.out.println("Not Subset");
		}else {
			System.out.println("SubSet");
		}
	}

}
