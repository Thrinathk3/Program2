package practice;

//import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] array1 = {5, 2, 9, 1, 5};
		
		//normal(array);
		//Arrays.sort(array);
		
		//int [] array = bubbleSort(array1);
		int [] array = selectionSort(array1);
		//int [] array = insertionSort(array1);
		
		for(int i : array) {
			System.out.println(i);
		}
		//for(int i=0;i<array.length;i++) { System.out.println(array[i]); }
	}

	public static int[] bubbleSort(int[] array) {
		int n = array.length;
		for (int i=0; i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(array[j]>array[j+1]) {
					int	temp = array[j];
					array[j] = array[j+1];
					array[j+1]=temp;

				}
			}
		}
		return array;
	}
	
	public static int[] selectionSort(int[] array) {
	    int n = array.length;
	    for (int i = 0; i < n - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < n; j++) {
	            if (array[j] < array[minIndex]) {
	                minIndex = j;
	            }
	        }
	        int temp = array[minIndex];
	        array[minIndex] = array[i];
	        array[i] = temp;
	    }
	    return array;
	}
	
	public static int[] insertionSort(int[] array) {
	    int n = array.length;
	    for (int i = 1; i < n; i++) {
	        int key = array[i];
	        int j = i - 1;
	        while (j >= 0 && array[j] > key) {
	            array[j + 1] = array[j];
	            j--;
	        }
	        array[j + 1] = key;
	    }
	    return array;
	}
	
	void mergeSort(int[] array, int left, int right) {
	    if (left < right) {
	        int middle = left + (right - left) / 2;
	        mergeSort(array, left, middle);
	        mergeSort(array, middle + 1, right);
	        merge(array, left, middle, right);
	    }
	}

	void merge(int[] array, int left, int middle, int right) {
	    // Merge two sorted subarrays
	}




}
