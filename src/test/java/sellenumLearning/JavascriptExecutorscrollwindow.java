package sellenumLearning;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorscrollwindow {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500);");

		// driver.executeScript("window.scrollBy(0,500)");in selenium4 we call
		// executescript
		// method directly by driver instance no need to typecast driver instance into
		// javascriptExecutor interface
	}
}
