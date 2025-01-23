package week3.day1;

import java.util.Arrays;

public class CompareArrays {
	public static void main (String[] args) {
	
		int array1 [] = {3,2,11,4,6,7};
		int array2 [] = {1,2,8,4,9,7};
		int arrLength1 = array1.length;
		int arrLength2 = array2.length;
		if(arrLength1!=arrLength2) {
			System.out.println("not equal");
		}
		for(int i=0;i<arrLength1;i++) 
		{
			for(int j=0;j<arrLength2;j++)
			{
				if(array1[i]==array2[j]) {
					System.out.println("The Matching Elements After Comparison of 2 Arrays:"+ array1[i]);
					//break;
		  	}
						
		}
	}
}
}
