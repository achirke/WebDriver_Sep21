package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromediver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window(). maximize();
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement Header = driver.findElement(By.xpath("//h2"));
		
		if(Header.isDisplayed()) {
			System.out.println("HEader is Displayed");
		}else {
			System.out.println("Test FAile, header is not displayed");
		}
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		
		System.out.println(UserName.getAttribute("placeholder"));
		
		UserName.sendKeys("abc@xyz");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("abc@xyz");
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
		LoginButton.click();
		

	}

}
