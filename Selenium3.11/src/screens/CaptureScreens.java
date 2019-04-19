package screens;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//http://www.java2s.com/Code/Jar/o/Downloadorgapachecommonsiojar.htm


public class CaptureScreens
{
	public static void main(String[] args) throws IOException 
	{
        WebDriver d = new ChromeDriver();
		
		d.get("https://apsrtconline.in/oprs-web/");
		
		d.manage().window().maximize();
		
		TakesScreenshot ss = ((TakesScreenshot)d);
		
		File s = ss.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(s, new File("D:\\raj\\images\\Login.png"));
		
		//FileUtils.copyFile(s, new File("D:\\raj\\images\\Login"+i+".png"));
	
	}

}