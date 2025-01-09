package seleniumCodes;

import java.time.Duration;

import org.apache.logging.log4j.core.util.Log4jThread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaitsconcept {

	public static void main(String[] args) {
		
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	  driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_myh38910a_e&adgrpid=155259813513&hvpone=&hvptwo=&hvadid=717602294855&hvpos=&hvnetw=g&hvrand=3118146747659921473&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9218956&hvtargid=kwd-362216169274&hydadcr=5620_2444508&gad_source=1");
	  driver.findElement(By.xpath("//a[@href=\"/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics\"]")).click();

		
		
	}

}
