package sellenumLearning;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class AshotfullpageSC {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

		AShot ashot = new AShot();
		Screenshot sc = ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		BufferedImage img = sc.getImage();
		ImageIO.write(img, "png", new File("usingashot.png"));

	}

}
