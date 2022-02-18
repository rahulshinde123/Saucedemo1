
package testClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMclass.LoginpagePOMclass;

public class Verifylogin
{
     public static void main(String[] args) 
    {
    	   System.setProperty("webdriver.chrome.driver","E:\\selenium projects\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.saucedemo.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       //creating object of POMclass 
	       LoginpagePOMclass login=new LoginpagePOMclass(driver);
	       
	        login.sendusername();
	        
			login.sendpassword();//calling its methods
			 
			login.clickloginbutton();
			
			
			
			String actalTitle = "Swag Labs";
			String expectedTitle = driver.getTitle();
			if(expectedTitle.equals(actalTitle))
			{
				System.out.println("Login test is passed");
			}
			else
			{
				System.out.println("Login test is failed");
			}
			System.out.println("Login functionality tested");
			
			
		}

	}
