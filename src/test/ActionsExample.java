package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromediver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru.com/test/drag_drop.html");
		
		driver.manage().window(). maximize();
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/11"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(From, To).build().perform();
		
		actions.sendKeys(Keys.PAGE_DOWN);
		
		

	}

}
