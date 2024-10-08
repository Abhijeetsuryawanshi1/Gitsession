package sellenumLearning;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Fullpagescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		
       //  TakesScreenshot sc=(TakesScreenshot)driver;
         File srcfile=driver.getFullPageScreenshotAs(OutputType.FILE);
         File destfile=new File("C:\\Users\\abhij\\eclipse-workspace\\sellenumLearning\\Test Data\\testing.png");
         FileUtils.copyFile(srcfile, destfile);
         
	}

}
