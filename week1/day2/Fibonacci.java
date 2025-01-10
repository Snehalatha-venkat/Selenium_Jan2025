package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int maxRange = 8;
			int firstVal = 0, secondVal = 1;
			
			System.out.println ("Fibonacci Series--");
			
			for (int i=1; i<=maxRange;i++)
			{
				if (i==1)
				{
					System.out.println(firstVal+"");
										
				}
				else if (i==2)
				{
					System.out.println(secondVal+"");
				}
				else
				{
					int nextVal = firstVal + secondVal;
					System.out.println("The next value is:"+ nextVal);
					firstVal = secondVal;
					secondVal = nextVal;
				}
			}
		
	}

}
