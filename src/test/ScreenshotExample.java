package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ScreenshotExample {

	private static Object FileUtils;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromediver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window(). maximize();
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(LoginLink));
		
		
		LoginLink.click();
		
		WebElement LoginLink1 = driver.findElement(By.linkText("Log in"));
		LoginLink1.click();
		
		WebElement UserName = driver.findElement(By.name("user Login"));
		UserName.sendKeys("abc@xyz.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abc@12345");
		
		WebElement Remember = driver.findElement(By.className("remeberMe"));
		
		
		WebElement LoginButton = driver.findElement(By.linkText("btn_login"));
		LoginButton.click();
		
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActualMsg = Error.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		TakesScreenshot tsObj = (TakesScreenshot) driver;
		File image = tsObj.getScreenshotAs(OutputType.FILE);
		
		  FileUtils.copyFile(image, new File("screenshot.png"));
		

		
		if(ActualMsg.equals(ExpMsg))  {
			System.out.println("Test Passed");
			
		}else {
			System.out.println("Test Failed");
		}

	}

}
