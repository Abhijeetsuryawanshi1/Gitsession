package sellenumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/parent-window/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Thread.sleep(5000);
		WebElement cross = driver.findElement(By.xpath("//button[@aria-label]"));
		wait.until(ExpectedConditions.elementToBeClickable(cross));   
		cross.click();             
		Thread.sleep(5000);
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame_1']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Test1");
			
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame-2']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Test2");
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@name='ok-btn']")).click();

	}

}
