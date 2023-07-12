/*Steps to reproduce are:
	1. Login to homepage
    2. SignIn to amazon account
    3. SignOut of account
*/
package Test;

import org.openqa.selenium.WebDriver;
import Pages.HomePageAmazon;
import Pages.SignInAmazon;
import Pages.SignoutAmazon;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest1{
	WebDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Monika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		HomePageAmazon home = new HomePageAmazon(driver);
		SignInAmazon signIn = new SignInAmazon(driver);
		SignoutAmazon signout = new SignoutAmazon(driver);
		
		//calling functions from both pages
		home.ClickSignIn();
		signIn.SignIn();
		signout.SignOut();
		
	}

}
