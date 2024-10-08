package sellenumLearning;

import java.time.Duration;

import org.apache.logging.log4j.core.util.Log4jThread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaitsconcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
		driver.get("https://www.testingshastra.com/implicit-wait-demo-assignment/");
		driver.findElement(By.id("name")).sendKeys("abhijeet");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-1"))).click();
		driver.findElement(By.xpath("//button[text()='Button2']")).click();
		String s=driver.findElement(By.id("demo2")).getText();
		System.out.println(s);
	}

}
