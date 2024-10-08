package sellenumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionConcepts2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebElement lang = driver.findElement(By.xpath("//span//div[text()='EN']"));
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		//action.moveToElement(lang).perform();
		//action.dragAndDrop(lang, searchbox).perform();
		//action.doubleClick(lang).perform();
		
		//action.contextClick();           //to right click
		
		//action.click(searchbox).perform();
		action.scrollByAmount(20, 3000).perform();
		action.scrollByAmount(20, 0).perform();
		
		action.scrollToElement(driver.findElement(By.xpath("//div[text()='See personalized recommendations']"))).perform();
		
		
		
		
		
		
		
	}

}
