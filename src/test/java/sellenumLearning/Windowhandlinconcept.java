package sellenumLearning;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandlinconcept {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.testingshastra.com/multiple-window-handling-assignment/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		
		String parentwindow=driver.getWindowHandle();
          Set<String> childwindows=driver.getWindowHandles();
          System.out.println(parentwindow);
          System.out.println(childwindows);
          childwindows.remove(parentwindow);
          System.out.println(childwindows);
          childwindows.remove(parentwindow);
          
          for(String s:childwindows) {
        	  driver.switchTo().window(s);
        	  driver.findElement(By.xpath("//button[@onclick=\"clickMe()\"]")).click();
        	  String text=driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
        	    System.out.println(text);
          }
          driver.switchTo().window(parentwindow);
          driver.quit();
	}
}
