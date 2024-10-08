package sellenumLearning;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwait {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(org.openqa.selenium.NoSuchElementException.class);

		
		driver.get("https://www.testingshastra.com/implicit-wait-demo-assignment/");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label=\"Close\"]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("name"))).sendKeys("vijay");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-1"))).click();
		String s = driver.findElement(By.id("demo")).getText();
		System.out.println(s);
		

	}

}
