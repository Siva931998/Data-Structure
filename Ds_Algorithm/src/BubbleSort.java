import java.util.Arrays;

public class BubbleSort {

	private void bubbleSort(int arr[]) {
		int i, n = arr.length;
		for (i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String arg[]) {
		int[] arr = {4,3,5,9,3,2,8,1};
		BubbleSort bs = new BubbleSort();
		System.out.println("unsort array element" + Arrays.toString(arr));
		bs.bubbleSort(arr);
		System.out.println("sort array element" + Arrays.toString(arr));
	}

}
