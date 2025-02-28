
public class Array04_순차검색 {
	
	public static void main(String[] args) {
		int[] arr = {4, 9 , 11, 23, 2, 19, 7};
		int n = arr.length;
		int key = 2;
		
		System.out.println(searchWhileNoSort(arr, key, n));
		
	}
	
	static int searchWhileNoSort (int[] arr, int key, int n) {
		int i = 0;
		while (i < n && arr[i] != key)
			i++;
				
		if (i < n) return i;
		return -1;
		
	}
}
