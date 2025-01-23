package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String testStr = "I am a software tester";
		String [] splittedStr  = testStr.split(""); // The String is splitted & allocated to an array
		
		char [] chArray ;
		
		for (int i = 0; i<splittedStr.length;i++)
		{
			if(i%2==1)
			{
				chArray = testStr.toCharArray();
			   // System.out.println(chArray[i]);
			    
			   StringBuilder reverseStr = new StringBuilder();
			   
			   for (int j = chArray.length-1; j>=0;j--) //Reverse the char array
			   {
				   reverseStr.append(chArray[j]);
			   }
			   
			   splittedStr[i] = reverseStr.toString(); /// Update the word with the reversed version
			}
		}
		// Print the modified string
			System.out.println(String.join(" ", splittedStr)); 
		}
		
	}


