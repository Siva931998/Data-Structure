
public class MergeSort {
	void mergesort(int arr[],int l,int m,int r) {
		int n1= l-m+1;
		int n2= r-m;
		int s[] = new int[n1];
		int k[] = new int[n2];
		
		for(int i=0;i<n1;i++)
			s[i]= arr[l+i];
		for(int j=0;j<n2;j++)
			k[j]= arr[m+1+j];
		
		int i=0 ,j=0;
		int n=l;
		while(i<n1 && j<n2) {
			if(s[i]<=k[j]) {
				arr[n]=s[i];
				i++;
			}else
			{
				arr[n]=k[j];
				j++;
			}
			n++;
		}
		while(i<n1) {
			arr[n]=s[i];
			i++;
			n++;
		}
		while(j<n2) {
			arr[n]=k[j];
			j++;
			n++;
		}

	}
	void sort(int arr[],int l,int r) {
		if(l<r) {
			int m =(l+r)/2;
			sort(arr,l,m);
			sort(arr,m,r);
			mergesort(arr,l,m,r);
			
			
		}
	}
public static void main(String[] args) {
	int[] arr= {3,5,8,2,9,1,4};
    MergeSort ms= new MergeSort();
    System.out.println("unsorted of element"+ arr);
   
    
}
}
