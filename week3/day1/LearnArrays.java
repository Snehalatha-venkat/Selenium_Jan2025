package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// Array is collection of items of same datatype
		//ArrayLiteral Method = datatype variablename[] = {values}; based on data
		//Array Instantiation Method = datatype 
		
		int marks [] = {70,89,90,56,76};
		int arrLength = marks.length;
		System.out.println(arrLength);
		
		//iterate all values
		for (int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		// sort an array
		Arrays.sort (marks);
		System.out.println(marks[2]);
		
		for (int j=0; j<arrLength ; j++)
		{
			System.out.println("marks after sorting"+ marks[j]);
		}
		 System.out.println(marks[arrLength-1]);
		 
		//Array Instantiation
			
		 int [] marks1 = new int [5];
			
		   System.out.println(marks1[2]);	
			marks[1] = 67;
			marks[2] = 78;
			
		}

	
}
