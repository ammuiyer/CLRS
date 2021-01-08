import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(25);
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = r.nextInt(n);
		}
	
		System.out.println(Arrays.toString(a));
		int k = r.nextInt(25);
		System.out.println("Number to find:  " + k);
		System.out.println("Index (-1 if it doesn't exist): " + binarySearch(a, k));
		

	}
	public static int binarySearch(int[]a, int c) {
		int low = 0;
		int high = a.length-1;
		int i = -1;
		while(low<high) {
			int mid = (low+high)/2;
			//System.out.println(mid);
			if(a[mid]==c) {
				i = mid;
				break;
			}
			else if(a[mid]>c) {
				high = mid-1;
			}
			else if(a[mid]<c) {
				low = mid+1;
			}
		}
		return i;
	}

}
