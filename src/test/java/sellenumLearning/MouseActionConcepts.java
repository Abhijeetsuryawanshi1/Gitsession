package sellenumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionConcepts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com");
		WebElement text1 = driver.findElement(By.xpath("//textarea[@name='text1']"));
		text1.sendKeys("Vijay Dhage");

		Actions action = new Actions(driver);

		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		action.keyDown(Keys.TAB).perform();
		action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		// action.keyDown(Keys.DELETE).perform();

		action.keyDown(Keys.ENTER).keyDown(Keys.ENTER).perform();

	}

}
