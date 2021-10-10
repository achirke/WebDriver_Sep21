package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromediver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window(). maximize();
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement CreatAccount = driver.findElement(By.xpath("//a[text()='Creat New Account']"));
		CreatAccount.click();
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		Select ddDay = new Select(Day);
		
		ddDay.selectByVisibleText("14");
		//ddDay.selectByValue("12");
		//ddDay.selectByIndex(3);
		
		WebElement Female  = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		Female.click();
		
		if(Female.isSelected()) {
			System.out.println("RAdio button selected");
		}else {
			System.out.println("RAdio button is not selected");
		}
		
		List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		for(int i=1; i<Months.size(); i++) {
			
			WebElement data  = driver.findElement(By.xpath("//selet[@id='month']/option[" +i + ""));
			
			System.out.println(data.getText());
			
			System.out.println(Months.get(i).getText());
			
		}
		
		
		
		
		

	}

}
