package sellenumLearning;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewWindowsConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.testingshastra.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.testingshastra.com");
		
	}

}
