package practice;

public class DuplicateElements {

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8};

		System.out.println("Duplicate elements in the array:");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[i]);
					break; // Print each duplicate only once
				}
			}
		}
	}

}
