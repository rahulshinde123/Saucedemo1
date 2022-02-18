
package testClass;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

importorg.testng.Assert;
importorg.testng.annotations.Test;
importorg.testng.asserts.SoftAssert;

public class TestNgSoftHardAssert 
{
	SoftAssert soft = new SoftAssert();
	
	@Test
	public void method Login()
	{
		String actualTitle = "Swag Labs";
		String expectedTitle = " Labs";

		soft.assertEquals(actualTitle, expectedTitle, "title not matched");
	
		
		String actualURL = "UR";
		String expectedURL = "URL1";
		soft.assertEquals(actualURL, expectedURL, "URL not matched");
	
		soft.assertAll();
	}


	@Test
	public void method LogOut()
	{
		soft.assertTrue(false);
		soft.assertAll();
	
	}

}
