package practice;


public class MergeArrays {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4};
		int[] array2 = {5,6,7,8};
		int size1,size2;
		size1 = array1.length;
		size2 = array2.length;
		int size3 = size1+size2;
		int array[] = new int[size3];
		
		for(int i =0;i<array.length;i++) {
			if(size1<(size3/2)) {
				array[i] = array1[i]; 
			}
			
		}
		for(int j=size3/2;j<array2.length;j++) {
			array[j]=array2[j];
		}
		for(int num : array) {
			System.out.println(num);
		}
		
		

	}

}
