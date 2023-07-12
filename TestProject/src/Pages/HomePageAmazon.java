package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageAmazon {
	WebDriver driver;

//Constructor that will be automatically called as soon as the object of the class is created
	public HomePageAmazon(WebDriver driver) {
		this.driver = driver;
	}
	//WebElements declaration
	By SignInbtn = By.id("nav-link-accountList-nav-line-1");
	
	// Function to click signIn icon in homepage
	public void ClickSignIn() throws InterruptedException {
		System.out.println("The title of the homepage is : " + driver.getTitle());
		driver.findElement(SignInbtn).click();
		System.out.println("The sign in icon is clicked");
		
	}

}
