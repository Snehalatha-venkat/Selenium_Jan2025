package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
	String dupString = new String ("We learn Java basics as part of java sessions in java week1");
		//length of the String
		//		int length = dupString.length(); //59
			//	System.out.println("length of String is:"+length);
		//Split the String using space as delimiter
				 String[] newStr = dupString.split(" ");
				
				 int count = 0;
				 
			   for (int i = 0; i < newStr.length; i++)
  			     {
				   for (int j = i+1; j < newStr.length; j++)
				   {
					   if (newStr[i].equalsIgnoreCase(newStr[j]))
					   {
						   newStr[j]= "";
						   count++;
						}
					}

			    }
		   //Print the new string
			   if(count >0)
			   {
				   System.out.println("Modified string: " + String.join(" ", newStr));
		        } 
			   else
			   {
		            System.out.println("No duplicate words found.");
		        } 
		}

	}

