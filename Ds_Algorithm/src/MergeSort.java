
public class MergeSort {
	void mergesort(int arr[], int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int left[] = new int[n1];
		int right[] = new int[n2];
		// copy the array to temp
		for (int i = 0; i < n1; i++)
			left[i] = arr[start + i];
		for (int j = 0; j < n2; j++)
			right[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = start;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	void Msort(int arr[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			Msort(arr, start, mid);
			Msort(arr, mid + 1, end);
			mergesort(arr, start, mid, end);
		}
	}

	void printarray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String args[]) {
		int[] arr = { 3, 5, 8, 2, 9, 1, 4 };
		int n = arr.length;
		MergeSort ms = new MergeSort();
		System.out.println("\nBefore sorting array elements are - ");
		ms.printarray(arr, n - 1);
		ms.Msort(arr, 0, n - 1);
		System.out.println("\nAfter sorting array elements are - ");
		ms.printarray(arr, n - 1);

	}
}
