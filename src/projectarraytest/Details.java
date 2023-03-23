package projectarraytest;

import java.util.Arrays;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {1, 3, 5, 2, 4};

	        boolean isEqual = Arrays.equals(array1, array2);
	        if (isEqual) {
	            System.out.println("The arrays contain the same elements.");
	        } else {
	            System.out.println("The arrays do not contain the same elements.");
	        }
	}

}
