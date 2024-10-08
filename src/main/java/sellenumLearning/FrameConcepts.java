package sellenumLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameConcepts {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless=new");
		//options.addArguments("--incognito");
		//options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Text");
		Thread.sleep(3000);
		WebElement frame4 = driver.findElement(By.xpath("//iframe[@src]"));
		driver.switchTo().frame(frame4);
		
		driver.findElement(By.cssSelector(".AB7Lab")).click();
		driver.findElement(By.linkText("Sign in to Google")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> Windows = new ArrayList<String>(windows);
		String parent = Windows.get(0);
		String child = Windows.get(1);
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent);		
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Text");

	}

}
