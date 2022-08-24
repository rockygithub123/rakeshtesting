package test_scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Genric_Excel;
import pom_scripts.Login;

public class Logintest extends Base_Test {
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		//String username = Genric_Excel.getData("sheet1", 0, 0);
		//String password = Genric_Excel.getData("sheet1", 1, 0);
		/*Login l=new Login(driver);
		l.setname("admin");
		l.setpassword("manager"
				);
		l.setlogin();*/
		driver.quit();
		
		
		
	}

}
