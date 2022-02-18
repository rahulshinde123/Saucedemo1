
package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePOMclass
{
   private WebDriver driver;
  //Actions act;                     //class for performing mouse actions.
   
   @FindBy(xpath="//input[@id='user-name']")     //Annotations
   private WebElement username;
   
   @FindBy(xpath="//input[@id='password']")
   private WebElement password;
   
   @FindBy(xpath="//input[@id='login-button']")
   private WebElement login;
   
   
   
    public LoginpagePOMclass(WebDriver driver)//constructor
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    	//act=new Actions(driver);                  //initializing Action class
    }
    public void sendusername() //Non static method
    {
    	username.sendKeys("standard_user");
    }
    public void sendpassword()
    {
    	password.sendKeys("secret_sauce");
    }
    public void clickloginbutton()
    {
    	login.click();
    	//act.click(login).perform();      //actions class methods
    }
    
}
