package week1.day2;

public class IsPrime {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		// Declare the number to check if it is prime
        int number = 18;

        // Variable to track if the number is prime
       boolean isPrime = true;

        // Prime number logic
        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Check divisors from 2 to number/2
        	  for (int i = 2; i <= number/2 ; i++)
              {
                if (number % i == 0)
                {
                    isPrime = false; // Found a divisor
                 //   break;
                }
             
           // Print if the number is prime or not
                if (isPrime == true) {
                    System.out.println(number + " is a prime number."); 
              }
                else {
                    System.out.println(number + " is not a prime number.");
                    }
         } 
        }
	}
}		
			
