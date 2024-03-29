import java.util.Arrays;

public class BinarySearch {

	public int Search(int[] sortedarray, int key) {
		int finalvalue = Integer.MAX_VALUE;
		int low = 0;
		int high = sortedarray.length - 1;
		

		while (low < high) {
			int mid = (high + low) / 2;
			if (sortedarray[mid] < key) {
				low = mid + 1;
			} else if (sortedarray[mid] > key) {
				high = mid - 1;
			} else if (sortedarray[mid] == key) {
				finalvalue = mid;
				break;
			}
		}
		return finalvalue;
	}
	public static void main(String[] args) {
		int[] sortedarray = {1,2,3,4,5,6,7,8,9};
		int key = 7;
		BinarySearch bs = new BinarySearch();
		int G= bs.Search(sortedarray, key);
		System.out.println("find the element of"+ Arrays.toString(sortedarray) );
		System.out.println("find the element of :  " + key +" index is :  "+ G);
	}
}
