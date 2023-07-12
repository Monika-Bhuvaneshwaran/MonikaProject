/*Steps: 1. navigate to homepage
         2. search for watches for women
         3.Select a watch and click 
*/
package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class OrderAmazonPage {
	WebDriver driver;

	public OrderAmazonPage(WebDriver driver) {
		this.driver = driver;
	}

//Webelements declaration
	By searchBar = By.id("twotabsearchtextbox");
	By sortCommand = By.id("a-autoid-0-announce");
	By sortcommandoption = By.id("s-result-sort-select_4");
	By firstWatch = By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[2]");
	By addToCart = By.id("add-to-cart-button");
	By QtyField = By.name("a-button-input");
	By Checkout = By.name("proceedToRetailCheckout");

//Searching for a watch 
	public void FirstOrderSearch() throws InterruptedException {
		driver.findElement(searchBar).click();
		driver.findElement(searchBar).sendKeys("watches for women");
		driver.findElement(searchBar).sendKeys(Keys.ENTER);
		System.out.println("Title of the page is : " + driver.getTitle());
	}
//Selecting a watch and ordering it
	
	public void OrderProduct() throws InterruptedException,IOException {
		driver.findElement(sortCommand).click();
		Thread.sleep(2000);
		driver.findElement(sortcommandoption).click();
		Thread.sleep(2000);
        driver.findElement(firstWatch).click();
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f, new File("D:\\Screenshots\\firstwatch.jpg"));
        JavascriptExecutor j = (JavascriptExecutor)driver;
	    j.executeScript("window.scrollBy(0,600)", "");
	   // driver.findElement(By.linkText(" See All Buying Options ")).click();
	    driver.findElement(addToCart).click();
	    Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(400)).takeScreenshot(driver);
	    ImageIO.write(s.getImage(), "jpg", new File("D:\\Screenshots\\adddedcart.jpg"));
	    driver.findElement(Checkout).click();
	    System.out.println("Item added to cart and checked out successfully");
	   

	}
}