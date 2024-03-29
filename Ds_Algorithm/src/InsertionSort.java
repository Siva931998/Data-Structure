import java.util.Arrays;

public class InsertionSort {

	private void insertionsort(int arr[]) {
		int n= arr.length;
		 for (int i=1;i<n;++i) {
			 int key = arr[i];
			 int j=i-1;
			 while(j>=0 && arr[j]>key)
			 {
				 arr[j+1]=arr[j];
				 j=j-1;
			 }
			 arr[j+1]=key;
		 }
	}
	public static void main(String[] args) {
		int[] arr= {3,8,6,9,4,2,5,1};
		InsertionSort is = new InsertionSort();
		
		System.out.println("unsort of element"+ Arrays.toString(arr));
		is.insertionsort(arr);
		System.out.println("sort of element"+ Arrays.toString(arr));
	}
	
}
