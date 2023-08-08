package practice;

import java.util.Arrays;

public class DuplicateElements {


	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 2,2, 5, 6, 3, 7, 8, 8};
		System.out.println("Duplicate elements in the array:");
		Arrays.sort(array);
		int i,j,frequency;
		for ( i = 0; i <array.length; i++) {
			frequency = 1;
			for ( j = i + 1; j < array.length; j++) {
				if(array[i] == array[j]) 
				{ 
					frequency++;
				}else {
					break;
				}
			}
			i=j-1;
			if(frequency>1) {
				System.out.println(array[i]);
			}
			
		}
	}


	/*
	 * public static void main(String[] args) { int[] array = {1, 2, 3, 4, 2, 5, 8,
	 * 2, 6, 3, 7, 8, 8}; HashSet<Integer> uniqueElements = new HashSet<>();
	 * HashSet<Integer> duplicateElements = new HashSet<>();
	 * 
	 * for (int num : array) { if (!uniqueElements.add(num)) {
	 * duplicateElements.add(num); } }
	 * 
	 * System.out.println("Duplicate elements: " + duplicateElements); }
	 */

}
