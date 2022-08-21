package test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
        // Step1. Click  on the Login Link
        
        WebElement LoginLink = driver.findElement(By.linkText("Log in"));
        LoginLink.click();
        
        WebElement UserName = driver.findElement(By.name("user_login"));
        UserName.sendKeys("vr@xyz.com");
        
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Test@123");
        
        WebElement LoginBtn = driver.findElement(By.name("btn_login"));
        LoginBtn.click();
        //validate error message
        WebElement Error = driver.findElement(By.id("msg_box"));
        
        String ActError = Error.getText();
        String ExpError = "The email or password you have entered is invalid.";
        
        if(ActError.equals(ExpError)){
        	System.out.println("TC Passed");
        
        	}else{
        		System.out.println("TC Fail");
        	}
        
        List<WebElement> Links = driver.findElements(By.tagName("a"));
        System.out.println("Total num of links are" + Links.size());
             
              for (int index=0;index<Links.size();index++) {
            System.out.println(Links.get(index).getAttribute("href"));
    }
        			
        	driver.close();
        }
        
        
    
}