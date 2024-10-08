package sellenumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selleniumprogramme {

	public static void main(String[] args) {
		
         WebDriver driver=new ChromeDriver();
         driver.get("Https://www.google.com");
         System.out.println(driver.getCurrentUrl());
         System.out.println(driver.getTitle());
         System.out.println(driver.getPageSource());
	}

}
