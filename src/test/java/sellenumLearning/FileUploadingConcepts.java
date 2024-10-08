package sellenumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadingConcepts {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.testingshastra.com/file-upload-assignment/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@type='File']"));
		chooseFile.sendKeys("C:\\Users\\abhij\\OneDrive\\Desktop\\token.txt");

	}

}
