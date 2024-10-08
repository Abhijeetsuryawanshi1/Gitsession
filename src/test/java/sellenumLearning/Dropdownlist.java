package sellenumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/dropdown-list-assignment/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();

		 
		WebElement month=driver.findElement(By.xpath("//select[@class=\"single-select\"]"));
		 Select select=new Select(month);
		 select.selectByIndex(3);
				   List<WebElement> elements=select.getAllSelectedOptions();
		 for(WebElement element:elements) {
		 System.out.println(element.getText());

		// for multiselectinglist
		//WebElement skills = driver.findElement(By.xpath("//select[@class=\"multi-select\"]"));
		//Select select = new Select(skills);
		//select.selectByIndex(3);
		//select.selectByIndex(0);
		select.selectByIndex(2);
		//List<WebElement> elements = select.getAllSelectedOptions();
		//for (WebElement element : elements) {
			//System.out.println(element.getText());
		}
	}
}
