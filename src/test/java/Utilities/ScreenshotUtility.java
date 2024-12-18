package Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testBase.BaseClass;

public class ScreenshotUtility extends BaseClass{
	public static String Destination;
	
	public void captureScreenshot(String fileName) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		String scName = timeStamp+"_"+fileName;
		Destination = System.getProperty("user.dir")+"/ScreenShots/"+scName+".png";
		File src = ts.getScreenshotAs(OutputType.FILE);
		Files.createDirectories(Paths.get(System.getProperty("user.dir")+"/ScreenShots/"));
		Files.copy(src.toPath(), new File(Destination).toPath());
	}
	

}
