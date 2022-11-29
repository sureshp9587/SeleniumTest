package seleniumtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ScrollUpDown {
	@Test
	public void method1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium webdriver\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://www.yatra.com/");
		WebElement facebook = driver.findElement(By.xpath("//a[@title='Facebook']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(3000);

		j.executeScript("window.scrollBy(0,-1500);");
		Thread.sleep(3000);

		j.executeScript("window.scrollBy(0, document.body.scrollHeight);");
		Thread.sleep(3000);

		j.executeScript("arguments[0].scrollIntoView()", facebook);
		Thread.sleep(3000);

		driver.quit();
	}
}
