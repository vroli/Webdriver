package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			WebElement DatePicker = driver.findElement(By.id("dob"));
			DatePicker.click();
			
			WebElement Month =driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select ddMonth = new Select(Month);
			ddMonth.selectByVisibleText("Jan");
			
			WebElement Year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select ddYear = new Select(Year);
			ddYear.selectByVisibleText("1985");
			
			WebElement Date = driver.findElement(By.xpath("//a[@data-date='1']"));	
			Date.click();

			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
