package week3.day1;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
			int dupArr[]= {2, 5, 7, 7, 5, 9, 2, 3};
			//length of the array
			int length = dupArr.length;
			System.out.println("length of array is:"+length);
			//sorting
			Arrays.sort(dupArr);//{2, 5, 7, 7, 5, 9, 2, 3};
		//	System.out.println("arrays after sorting:"+dupArr); // This returns the memory reference 
			//print the values
			for (int i = 0; i < dupArr.length-1; i++) {
				if (dupArr[i]==dupArr[i+1]) {
					System.out.println("Duplicate Numbers in the Array"+ "  " + dupArr[i+1]);
				}
			}

	}

}
