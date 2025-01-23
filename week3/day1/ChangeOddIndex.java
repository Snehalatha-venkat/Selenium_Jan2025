package week3.day1;

public class ChangeOddIndex {

	public static void main(String[] args) {
	 	String str1 = "changeme";
	 	int i;
	 	
	 	//convert to char array
	 	
	 	char [] chArray = str1.toCharArray();
	 		  	 	
	 	for(i = 0;i< chArray.length;i++) //looping to 
	 	{
	 		if(i%2==1)  //returns reminder as 1
	 		{
	 		//	System.out.println (i);
	 			chArray [i] = Character.toUpperCase(chArray[i]);
	 		}
	 	}
	 		String newStr = new String(chArray); //Instanstiating new String with converted value
	  		System.out.println ("The Converted Odd String:"+ newStr);
	}

}
