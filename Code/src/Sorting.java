import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] a = {6,2,8,2,6,1,5,9,3,0,1,8};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(insertionSort(a)));
		
	}
	public static int[] insertionSort(int[] a) {
		for(int j = 1; j<a.length; j++) {
			
			int key = a[j];
			int i = j-1;
			while(i>=0 && a[i]>key) {
				a[i+1] = a[i];
				a[i] = key;
				i--;	
				
				}
			//System.out.println(Arrays.toString(a));
			
		}
		return a;
		
	}
}
