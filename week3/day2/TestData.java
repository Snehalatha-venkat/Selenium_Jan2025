package week3.day2;

public class TestData {

	    public void enterCredentials(String username,String pwd)
		{
			System.out.println("Credentials Entered");
		}

	    public void navigateToHomePage(String url)
	    {
	    	System.out.println("URL entered:"+ url);
	    	System.out.println("Navigated to Home Page");
	    }
	
		
		public static void main(String[] args) {
			
			TestData tData = new TestData();
			tData.enterCredentials("svenk123", "Password1");
			tData.navigateToHomePage("https://www.google.com");
		}
	}


