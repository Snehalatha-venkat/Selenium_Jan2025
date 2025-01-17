package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class CreateLead{

	public static void main(String[] args) {
	
		String title;
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// For clicking the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//partial link text 
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//For Creating new account
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SnehaTest1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lead1");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LTIM");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Director-QES");
		//driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
	/*	title = driver.getTitle();
		System.out.println(title);*/
		driver.close();
	}
}
