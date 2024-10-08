package sellenumLearning;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/prompt/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Thread.sleep(5000);
		WebElement cross = driver.findElement(By.xpath("//button[@aria-label]"));
		wait.until(ExpectedConditions.elementToBeClickable(cross));
		cross.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick]")).click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.sendKeys("Test candidate");
		al.accept();
		System.out.println(al.getText());
		al.sendKeys("25");
		al.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id]")).getText());

	}

}
