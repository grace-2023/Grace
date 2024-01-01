package homeassigment.week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("facebook");
		driver.findElement(By.name("reg_email__")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("test123");
		WebElement selectdate = driver.findElement(By.id("day"));
		Select datedd=new Select(selectdate);
		datedd.selectByIndex(0);
		WebElement selectmonth = driver.findElement(By.id("month"));
		Select monthdd=new Select(selectmonth);
		monthdd.selectByValue("1");
		WebElement selectyear = driver.findElement(By.id("year"));
		Select yeardd=new Select(selectyear);
		yeardd.selectByVisibleText("2024");
		driver.findElement(By.xpath("//input[@type='radio']/preceding-sibling::label[1]")).click();
		
	}

}
