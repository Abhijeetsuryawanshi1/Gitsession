package sellenumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorLearning {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement userName = driver.findElement(By.xpath("//input[@id='name']"));
//		WebElement login = driver.findElement(By.cssSelector("input#FSsubmit"));
//		//WebElement passWord = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='password']"));
//		//WebElement login = driver.findElement(By.cssSelector(".orangehrm-login-button"));
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].setAttribute('value','Admin')",userName);
//		
//		//js.executeScript("arguments[0].setAttribute('value','admin123')",passWord);
//		driver.switchTo().frame(0);
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("arguments[0].click()",login);
		
		//js.executeScript("window.scrollBy(0,300)", "");
		driver.switchTo().frame(driver.findElement(By.cssSelector("#frame-one796456169")));
		WebElement login = driver.findElement(By.cssSelector("input#FSsubmit"));
		js.executeScript("arguments[0].scrollIntoView();", login);
		

	}

}
