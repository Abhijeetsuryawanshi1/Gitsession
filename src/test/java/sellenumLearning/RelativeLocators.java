package sellenumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		
       FirefoxDriver driver=new FirefoxDriver();
       driver.get("https://www.myntra.com/");
      
       By inputtext=RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//a[@data-color='#ff3f6c']"));
        driver.findElement(inputtext).sendKeys("levis");
           
      //  By element= RelativeLocator.with(By.tagName("a")).above(By.xpath("//a[@data-color='#ff3f6c']"));
	}

}
