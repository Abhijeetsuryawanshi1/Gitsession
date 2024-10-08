package sellenumLearning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class InterviewQues {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		String amazonTitle = driver.getTitle();
		String handle = driver.getWindowHandle();
		
		WebDriver driver1 = new ChromeDriver(options);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver1.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver1.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys(amazonTitle);
		Thread.sleep(5000);
		driver1.close();
		//driver.switchTo().window(handle);
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys(amazonTitle);
		driver.close();
		

	}

}
