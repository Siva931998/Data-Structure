
public class LinearSearch {
	
	public static int linearsearch(int key,int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int value= arr[i];
			if(key==value) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
	}
	public static void main(String[] args) {
		int[] integer= {1,2,2,3,44,4,4,5,6,7,7,7,8,9};
		int goal= 6;
		
		int result = LinearSearch.linearsearch(goal,integer);
		System.out.println(String.format(" Goal : %d Found %d at index %d integer length %d" , goal, integer[result],result, integer.length));
	}

}
