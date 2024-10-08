package sellenumLearning;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.qsy7.browser.modules.ashot.renderer.Screenshot;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class FullpageusingSelenium {

	public static void main(String[] args) throws IOException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		// TakesScreenshot sc=(TakesScreenshot) driver;
		File imgfile = driver.getFullPageScreenshotAs(OutputType.FILE);

		BufferedImage imageFile = ImageIO.read(imgfile);
		ImageIO.write(imageFile, "png", new File("fullpage.png"));

	}

}
