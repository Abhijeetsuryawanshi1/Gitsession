package sellenumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		WebElement table = driver.findElement(By.cssSelector(".orangehrm-container"));
		List<WebElement> table_Rows = table.findElements(By.cssSelector(".oxd-table-row--clickable"));
		int total = 0;
		driver.findElement(By.cssSelector("i.bi-plus.oxd-button-icon")).click();
		driver.findElement(By.name("firstName")).sendKeys("Automation");
		driver.findElement(By.name("middleName")).sendKeys("Test");
		driver.findElement(By.name("lastName")).sendKeys("Practise");
		String Id = "1223";
		driver.findElement(By.xpath("//label[text()='Employee Id']/..//following-sibling::div//child::input")).clear();
		driver.findElement(By.xpath("//label[text()='Employee Id']/..//following-sibling::div//child::input")).sendKeys(Id);
		driver.findElement(By.cssSelector(".orangehrm-left-space")).click();
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		List<WebElement> pages = driver.findElements(By.cssSelector(".oxd-pagination-page-item--page"));
		
		for(WebElement pageNo : pages) {
			String str = pageNo.getText();
		    if(driver.findElement(By.cssSelector(".bi-chevron-right")).isDisplayed()) {
		        driver.findElement(By.xpath("//button[text()="+str+"]")).click();
		        List<WebElement> Cells = driver.findElements(By.cssSelector(".orangehrm-container .oxd-padding-cell"));
		        for(WebElement cell: Cells) {
		        	String str1 = cell.getText().trim();
		        	if(cell.getText().trim()!=null && cell.getText().trim().contains(Id)) {
		        		System.out.println("Hello");
		        	}
		        }
		        
		        /*
		        total = total + table_Rows.size();
				System.out.println(table_Rows.size());
				*/
		        
		    }   
		}
		//System.out.println("Total : "+total);
	}

}
