package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromediver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/alerts");
		
		driver.manage().window(). maximize();
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id='alertButton']/"));
		button1.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement button2 = driver.findElement(By.xpath("//button[@id='promtButton']/"));
		button2.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("clicked ok");
		alert2.accept();
		
		
		
		
		
		
		
		
		
		

	}

}
