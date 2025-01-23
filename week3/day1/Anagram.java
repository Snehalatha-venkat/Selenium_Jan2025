package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
		String str1 = "stops";
		String str2 = "potss";
		
		int strLen1,strLen2;
		       
		        strLen1 = str1.length(); //Gets the length of the String
		        strLen2 = str2.length();
		       
		        if(strLen1==strLen2) //The lengths of the 2 strings are compared
		        {
		             char[] chA1 = str1.toCharArray(); //Converts to char array
		             char[] chA2 = str2.toCharArray();
		             
		          /*  System.out.println (chA1);
		             System.out.println (chA2);	*/	             
		             
		              Arrays.sort(chA1); 
		              Arrays.sort(chA2);
		              
		            System.out.println("Character Array1 "+Arrays.toString(chA1));
		  			System.out.println("Character Array2 "+Arrays.toString(chA2));
		          
		  		  if (Arrays.equals(chA1, chA2))
		  		  {
		  			System.out.println("The given strings are Anagram.");
		  		  }
		  		
		  		else
		        {
		          System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		        }
		             
		      }
	}

}
