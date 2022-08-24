package generic;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Screen_shot {

	void takeScreen(WebDriver driver) throws IOException {
		
		String photo="./photos";
/*
		Date d=(Date) new java.util.Date();
		String d1 = d.toString();
		System.out.println(d1);
		d1.repla*/
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("photo.jpeg");
		FileUtils.copyFile(src,dst);
		
		
		
		
		
	}

	
}
