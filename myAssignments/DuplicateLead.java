package myAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Grace");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Freeda");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nancy");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("MCA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello this is test leaf");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		
		WebElement statedropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(statedropdown);
		dd.selectByIndex(1);
		
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title =driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyname=driver.findElement(By.id("createLeadForm_companyName"));
		companyname.clear();
		companyname.sendKeys("newtestleaf");
		
		WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
		firstname.clear();
		firstname.sendKeys("newgrace");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title2=driver.getTitle();
		System.out.println(title2);
		
		
		
		
	}

}
