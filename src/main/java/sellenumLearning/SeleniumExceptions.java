package sellenumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExceptions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.cssSelector("#row1.row input[type='text']")).clear();
		driver.findElement(By.cssSelector("#row1.row input[type='text']")).sendKeys("Test");
		Boolean bl = driver.findElement(By.cssSelector("#row1.row input.input-field")).getText() == "Test";

		driver.findElement(By.cssSelector("#add_btn")).click();
		//NoSuchElementException due to non-synchronization, to resolve it need to apply wait in script
		System.out.println(driver.findElement(By.cssSelector("#row2.row")).isDisplayed());
/*ElementNotInteractableException as two elements with same attribute and value & 1st element is invisible,
 to resolve it need to use wait here
*/	
		driver.findElement(By.cssSelector("#row2.row")).sendKeys("Burger");
		driver.findElement(By.name("Save")).click();

	}
	
}
