package homeassigment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("selenium");
		WebElement employee = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select employeedd=new Select(employee);
		employeedd.selectByIndex(3);
		WebElement marketingcamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select automobiledd=new Select(marketingcamp);
		automobiledd.selectByVisibleText("Automobile");
		WebElement ownershipdd = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select corporationdd=new Select(ownershipdd);
				corporationdd.selectByValue("OWN_CCORP");
				driver.findElement(By.name("submitButton")).click();
		String createleadtitle = driver.getTitle();
		
		if(createleadtitle.contains("View Lead"))
		{
			System.out.println("Title is printed successfully");
		}
		
		else
		{
			System.out.println("Title is not printed successfully");
		}
		
	}

}
