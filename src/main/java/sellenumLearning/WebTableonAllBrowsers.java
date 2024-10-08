package sellenumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableonAllBrowsers {
	
	//static String browser = "Internet Explorer";
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://practice.expandtesting.com/dynamic-table");
		findingbrowserMemorydata("System");
		
	}
	
	public static void findingbrowserMemorydata(String browser) {
		
		List<WebElement> headings = driver.findElements(By.xpath("//thead//th"));
		
		for (WebElement heading : headings) {
			if (heading.getText().equals("Memory")) {
				List<WebElement> Chrome_Datas = driver.findElements(By.xpath("//tbody//td[text()='"+browser+"']//following-sibling::td"));
					for (WebElement Chrome_Data : Chrome_Datas) {
						if (Chrome_Data.getText().endsWith("MB")) {
								System.out.println(Chrome_Data.getText());
						}
					}
			}
		}
	}
	}