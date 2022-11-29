package seleniumtests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ExceptionTrycatchfinally{
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium webdriver\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
try {		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("Suresh yadav");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Palachuru");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Suresh");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Sureshp9587@gmail.com");
        WebElement country = driver.findElement(By.name("country_id"));
		selectOptionFromDropdown(country,"Australia");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Sureshp9587");
}catch(Exception e) {
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']")).click();
	throw(e);
}finally {
	driver.close();
  }  }
 //strong[normalize-space()='Computer']//strong[normalize-space()='Lock']
	private static void selectOptionFromDropdown(WebElement ele, String Value) {
		   	Select drp = new Select(ele);
			List<WebElement>alloptions=drp.getOptions();
			for(WebElement option:alloptions)
			{
			if (option.getText().equals(Value))
				{
					option.click();
					break;
	} }	} }
	
	

	


 
