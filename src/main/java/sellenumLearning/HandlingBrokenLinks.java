package sellenumLearning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links = driver.findElements(By.tagName("//a"));
		
		for(WebElement link : links) {
			String attributeValue = link.getAttribute("href");
			
			if(attributeValue==null || attributeValue.isEmpty()) {
				System.out.println("Can not verify");
				continue;
			}
			
			URL url = new URL(attributeValue);
			HttpURLConnection connect = (HttpURLConnection) url.openConnection();
			connect.connect();
			if(connect.getResponseCode() >= 400) {
				System.out.println("Broken");
			}else
				System.out.println("Not broken");
			
		}
		driver.quit();

	}

}
