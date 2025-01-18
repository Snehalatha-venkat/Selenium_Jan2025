package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountSelect {

	public static void main(String[] args) {
	
		String title;
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	//	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// For clicking the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//partial link text 
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//For Creating new account
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Sneha_Test234");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
	// Element for the select class to be selected
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select selct1 = new Select(industry);
	// Select "ComputerSoftware" as Industry
		selct1.selectByValue("IND_SOFTWARE");
	// Select Ownership 
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select selct2 = new Select (owner);
		selct2.selectByVisibleText("S-Corporation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// Select "Employee" 
		WebElement src = driver.findElement(By.name("dataSourceId"));
		Select selct3 = new Select (src);
		selct3.selectByValue("LEAD_EMPLOYEE");
	// Select Marketing Campaign - eCommerce Site Internal Campaign
		WebElement mc = driver.findElement(By.name("marketingCampaignId"));
		Select selct4 = new Select (mc);
		selct4.selectByIndex(6);
	// Select Country
		WebElement geoid = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select selct5 = new Select (geoid);
		selct5.selectByValue("TX");
		
	/*	driver.findElement(By.id("numberEmployees")).sendKeys("200");
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");*/
		driver.findElement(By.className("smallSubmit")).click();
		title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	

}
