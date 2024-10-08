package sellenumLearning;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotConept {

	public static void main(String[] args) throws IOException {
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

	    TakesScreenshot sc=(TakesScreenshot) driver;
	    File img=sc.getScreenshotAs(OutputType.FILE);
	    BufferedImage imagefile=ImageIO.read(img);
	    ImageIO.write(imagefile, "png",new File("usingselenium.png"));


	//	WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/autoit.html");

    //		TakesScreenshot sc = (TakesScreenshot) driver;
	//	File src = sc.getScreenshotAs(OutputType.FILE);
	//	File DestFile = new File("C:\\Users\\abhij\\eclipse-workspace\\sellenumLearning\\Test Data\\test2.png");
//		File destination=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\screenshots\\test4.png");   to store in a screenshot folder on desktop
		//FileUtils.copyFile(src, DestFile);

	}

}
