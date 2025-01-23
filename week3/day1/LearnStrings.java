package week3.day1;

public class LearnStrings {

	public static void main(String[] args) {
		/*
		 * String - collection of chars
		 * Declaration - String literal and String instantiation
		 * String name = new String ("values"); - String instantiation 
		 * String name = "values"; String literal
		 */
			String str = "Testleaf";
			String str1 = "TestLeaf";
			
			//String instantiation
			String val = new String ("SeleNium");
			String val1 = new String ("Selenium");			
			
			//To count the no. of chars
			int length = str1.length();
			System.out.println (length);
			
			//When comparing 2 strings -- content,case of the 2 strings will be compared 
			
			boolean comp = str.equals(str1);
			System.out.println (comp); //will print True
			
			if(str.equals(str1))
			{
				System.out.println ("Strings are Same");
			}
			else
			{
				System.out.println ("Strings are Not Same");
			}
			// Ignoring Case sensitive
			boolean b1 = str.equalsIgnoreCase(val);
			System.out.println (b1);
		
			//Contains --- Check character or a word exist in the given variable
			if (str.contains("leaf"))
			{ 
				System.out.println("The String is same");
			}	
			 
			//toChar array
			char [] charArray = str.toCharArray();
			System.out.println (charArray); // String is converted as character
			 
			for(int i=0; i<charArray.length;i++)
			{
				System.out.println(charArray[i]);
			}
		  //charAt method
			 char charAt = str.charAt(5); //based on index the value will be returned
			 System.out.println(charAt);
		  //replace
			 String s = "Testleaf123";
			 String replace = s.replace ("1","@");
			 System.out.println (replace);
		//retrieve any values
			 String replaceAll = s.replaceAll("[^0-9]","");
			 System.out.println (replaceAll);
			 String replaceAll1 = s.replaceAll("[^a-z]","");
			 System.out.println (replaceAll1);
		//String to Int
			 String ss = "123";
			 int stringToInt = Integer.parseInt(ss);
			 System.out.println (stringToInt+10);
		//split a string into multiple strings
			 String newStr = "TestLeaf and Software"; //0,1,2 index 
			 String[] split = newStr.split(" ");
			 System.out.println (split[2]);
			 
			 for (int i=0; i<split.length;i++)
			 {
				 System.out.println (split[i]);
			 }
		// Substring crop a string and convert into small strings
			 
			 String mainString = "January";
			 String subString1 = mainString.substring(2);
			 System.out.println (subString1);
			 String subString2 = mainString.substring(1,6); // Ending index will not be considered if we need to get string in between
			 System.out.println (subString2);
		 
	}

}
