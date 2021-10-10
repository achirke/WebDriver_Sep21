package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromediver1.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		driver.manage().window(). maximize();
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		
		
		//file.sendKeys("C:\\Users\\TiaaUser\\OneDrive\\Desktop\\Locators.txt");
		
		
		WebElement file = driver.findElement(By.xpath("//*[@class='upload-file']"));
		file.click();
		
		//creating object of Robot class
		
		Robot rb = new Robot();
		
		
		//copying file path to clipboard
		 StringSelection str = new StringSelection("C:\\\\Users\\\\TiaaUser\\\\OneDrive\\\\Desktop\\\\Locators.txt");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		//press control+v for posting
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		//release control+v for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    
	  //for pressing and releasing enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
