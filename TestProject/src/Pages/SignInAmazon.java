package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInAmazon {
	WebDriver driver;
	
	public SignInAmazon(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElements declaration
		By mobile = By.id("ap_email");
		By continuebtn = By.className("a-button-input");
		By pass = By.id("ap_password");
		By submit = By.id("signInSubmit");
		
	// Function to sign in giving phone number and password
	public void SignIn() throws InterruptedException {
		System.out.println("The title of the signIn page is : " + driver.getTitle());
		driver.findElement(mobile).sendKeys("7305305945");
		Thread.sleep(2000);
		driver.findElement(continuebtn).click();
		driver.findElement(pass).sendKeys("Bulletlover.77b");
		driver.findElement(submit).click();
		System.out.println("Sign in was succesfull");
		System.out.println("The title of homepage is "+ driver.getTitle());
	}

}
