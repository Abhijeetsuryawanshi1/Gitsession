package seleniumLearning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettingHeaders {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String[] header = {"Automation Tool", "Licensing", "Market response"};
		List<String> list = Arrays.asList(header);
		
		List<WebElement> headerElement = driver.findElements(By.xpath("//table//strong"));
		System.out.println(headerElement.size());
		
		for(WebElement element : headerElement) {
			String actualHeader = element.getText();
			if(list.contains(actualHeader)) {
				System.out.println(actualHeader);
			}
		}

	}

}
