
package testClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGCheck
{
   @BeforeClass
   public void browsermethod()
   {
	   System.out.println("browser open");
   }
   @BeforeMethod()
   public void method1()
   {
	   System.out.println("URl open");
   }
   @Test
   public void loginmethod()
   {
	   System.out.println("login method");
   }
   
   @Test
   public void AddToCart()
   {
	   System.out.println("product added to cart successfully");
   }
   @AfterMethod
   public void method2()
   {
	   System.out.println("log0ut method");
   }
   @AfterClass
   public void method3()
   {
	System.out.println("browser close");   
   }
}