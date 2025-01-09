package seleniumCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iinterviewq {

	public static void main(String[] args) {
	/*	 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		 driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		 driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		 driver.findElement(By.xpath("//button[@onclick=\"swapCheckbox()\"]")).click();
		 driver.findElement(By.xpath("//p[@id=\"message\"]")).getText();
		 driver.findElement(By.xpath("//button[@onclick=\"swapInput()\"]")).isDisplayed();
     */
		int num = 11;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;

			}

		}
		if (count == 2) {
			System.out.println("number is prime");
		} else {
			System.out.println("num is not prime");
		}
      
	}

}
