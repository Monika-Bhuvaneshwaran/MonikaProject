package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import Pages.OrderAmazonPage;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class AmazonFirstOrder {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Monika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		//File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(f, new File("D:\\Screenshots\\Homepage.jpg"));
		//
	     Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(400)).takeScreenshot(driver);
	     ImageIO.write(s.getImage(),"JPG",new File("D:\\Screenshots\\homepage.jpg"));
		
		OrderAmazonPage order1 = new OrderAmazonPage(driver);
		order1.FirstOrderSearch();
		order1.OrderProduct();
		driver.close();
	}

}
