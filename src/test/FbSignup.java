package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement SignUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		SignUp.click();
		
		WebElement FName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement LName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement Mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		FName.sendKeys("Tom");
		LName.sendKeys("Jerry");
		Mobile.sendKeys("123456789");
		Password.sendKeys("abc@123");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("20");
		
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Jan");
		
		System.out.println("Selected Month is " + ddMonth.getFirstSelectedOption().getText());
		
//		List<WebElement> Months = ddMonth.getOptions();
//		
//		for(WebElement elm: Months) {
//			System.out.println(elm.getText());	
//		}
		
		
		List<WebElement> AllMonths = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		for(WebElement elm: AllMonths) {
			System.out.println(elm.getText());	
		}
		
		String Gender = "Male";
		
		
//String Xpath = "//label[text()='" + Gender + "']/following-sibling::input";
		
		//WebElement GendgerRadioBtn = driver.findElement(By.xpath(Xpath));
		//GendgerRadioBtn.click();
	//WebElement Female=driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
	//WebElement Male=driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
	//WebElement Other=driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
	

	//If(Gender.equals("Female")){
		//Female.click();
	//}else if(Gender.equals("Male")){
		//Male.click();
	//}else {
		//Other.click();
	///}
	
	WebElement GenderRadioBtn = driver.findElement(By.xpath("//label[text()='" + Gender +"']/following-sibling::input"));
	
	GenderRadioBtn.click();
	}

}

		
	
			
		
		
	


