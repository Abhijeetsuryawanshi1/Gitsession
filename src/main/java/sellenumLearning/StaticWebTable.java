package sellenumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		/*
		List<WebElement> elements = driver.findElements(By.xpath("//table[@id='countries']//tr"));
		int numberOfElements = elements.size();
		System.out.println(numberOfElements);
		*/
		
		/*
		List<WebElement> countries = driver.findElements(By.xpath("//table[@id='countries']//tr//td[2]"));
		for(int i=2;i<countries.size();i++) {
			System.out.println(countries.get(i).getText());
		}
		*/
		
		/*
		List<WebElement> countries = driver.findElements(By.xpath("//table[@id='countries']//tr//td[2]"));
		for(int i=2;i<countries.size();i++) {
			if(countries.get(i).getText().equalsIgnoreCase("India")) {
				
				driver.findElement(By.xpath("//strong[text()='India']//ancestor::tr//input")).click();
			}
		}
		*/
	}

}
