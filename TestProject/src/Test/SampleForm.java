package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

import static org.junit.Assert.*;
import org.junit.Test;


import dev.failsafe.internal.util.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class SampleForm {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Monika\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.navigate().to("https://form.jotform.com/231712408665456");
	      driver.manage().window().maximize();
	      System.out.println("Title is " +driver.getTitle());
	      Thread.sleep(2000);
	      WebElement Firstname = driver.findElement(By.xpath("//input[@name= 'q8_name8[first]']"));
	      Firstname.sendKeys("Monika");
	      highlightElement(driver,Firstname);
	 	      
	      WebElement Lastname = driver.findElement(By.xpath("//input[@name= 'q8_name8[last]']"));
	      Lastname.sendKeys("Bhuwanesh");
	      highlightElement(driver,Lastname);
	      
	      WebElement email = driver.findElement(By.xpath("//*[@id= 'input_9']"));
	      email.sendKeys("mona@gmail.com");
	      highlightElement(driver,email);
	      
	      WebElement address1 = driver.findElement(By.xpath("//input[@name= 'q10_address[addr_line1]']"));
	      address1.sendKeys("Twin paradise");
	      highlightElement(driver,address1);
	      
	      WebElement address2 = driver.findElement(By.xpath("//input[@name= 'q10_address[addr_line2]']"));
	      address2.sendKeys("korattur");
	      highlightElement(driver,address2);
	      
	      WebElement City = driver.findElement(By.xpath("//input[@name= 'q10_address[city]']"));
	      City.sendKeys("Chennai");
	      highlightElement(driver,City);
	      
	      WebElement state = driver.findElement(By.xpath("//*[@id= 'input_10_state']"));
	      state.sendKeys("TN");
	      highlightElement(driver,state);	      
	      
	      WebElement pincode = driver.findElement(By.xpath("//*[@id= 'input_10_postal']"));
	      pincode.sendKeys("600080");
	      highlightElement(driver,pincode);
	      
	      WebElement phonenum = driver.findElement(By.xpath("//*[@id= 'input_11_phone']"));
	      phonenum.sendKeys("1234567890");
	      highlightElement(driver,phonenum);
	      
	    //to perform Scroll on application using Selenium
	      JavascriptExecutor j = (JavascriptExecutor)driver;
	      j.executeScript("window.scrollBy(0,350)", "");
	      Thread.sleep(2000);
	      
	      WebElement option = driver.findElement(By.xpath("//*[@value= 'Type option 1']"));
	      option.click();
	      highlightElement(driver,option);
	      
	      WebElement date = driver.findElement(By.id("input_14_pick"));
	      date.click();
	      WebElement todaydate = driver.findElement(By.xpath("//div[@class='calendar popup']/table/tbody/tr[4]/td[4]"));
	      todaydate.click();
	      Thread.sleep(2000);
	      WebElement getDate = driver.findElement(By.xpath("//*[@id='lite_mode_14']"));
	      getDate.getText();
	      //System.out.println("Selected date is "+getDate.getText());*/
	      File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      Files.copy(f, new File("D:\\Screenshots\\ss.jpg"));
	      WebElement submit = driver.findElement(By.xpath("//button[@type= 'submit']"));
	      submit.click();
	      System.out.println("form is completed");
	}
	/*public static void assertEquals(String s, WebElement element) {
		s = "Thank You!";
	    element = driver.findElement(By.id("//*[@class= 'thankyou-main-text ty-text']\")");
		Assert.assertEquals(s,element);
	}*/
	public static void highlightElement(WebDriver driver, WebElement element) {

        try
        {
            for (int i = 0; i < 3; i++) 
            {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: red; border: 2px solid red;");
            } 

        }
        catch(Throwable t)
        {
            System.err.println("Error came : " +t.getMessage());
        }
    }
		
		
	}


