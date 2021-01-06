import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(25);
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = r.nextInt(n);
		}
		System.out.println(Arrays.toString(a));
		mergeSort(a, 0, a.length-1);
		
		System.out.println(Arrays.toString(a));
		
		
	}
	public static int[] insertionSort(int[] a) {
		for(int j = 1; j<a.length; j++) {
			//comment
			
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
	public static void mergeSort(int[] a, int left, int right) {
		if(left>=right) {
			return;
		}
		int mid = (left+right)/2;
		mergeSort(a,left,mid);
		mergeSort(a,mid+1,right);
		merge(a, left, right, mid);
		
		
	}
	public static void merge(int[] a, int left, int right,int mid) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int i = left;
		int j = mid+1;
		while(i<mid+1 && j<right+1) {
			if(a[i]<=a[j]) {
				temp.add(a[i]);
				i++;
			}
			else if(a[j]<a[i]) {
				temp.add(a[j]);
				j++;
			}
			//System.out.println(temp);
		}
		while(i<mid+1) {
			temp.add(a[i]);
			i++;
		}
		while(j<right+1) {
			temp.add(a[j]);
			j++;
		}
		int e = 0;
		for(int k = left; k<=right; k++) {
			a[k] = temp.get(e);
			e++;
		}
		
	}
	
	public static int[] bubbleSort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			//System.out.println(" ");
			for(int j = a.length-1; j>i; j--) {
				//System.out.println(Arrays.toString(a));
				if(a[i]>a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		return a;
		
	}
}
