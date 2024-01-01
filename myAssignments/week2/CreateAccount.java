package homeassigment.week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
	//	driver.findElement(By.xpath("//span[text()='Account Name']/following::span"));
		
		driver.findElement(By.id("accountName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Hello");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select computersoftwaredd=new Select(industry);
		computersoftwaredd.selectByIndex(2);
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select scoporationdd=new Select(ownership);
		scoporationdd.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select employeeedd=new Select(source);
		employeeedd.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select ecommerce=new Select(marketing);
		ecommerce.selectByIndex(5);
		
		
		WebElement stateprovince = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select texasdd=new Select(stateprovince);
		texasdd.selectByValue("TX");
		
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
	}

}
