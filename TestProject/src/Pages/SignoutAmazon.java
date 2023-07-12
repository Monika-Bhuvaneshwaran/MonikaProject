package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignoutAmazon {
WebDriver driver;
 public SignoutAmazon (WebDriver driver) {
	 this.driver= driver;
 }
 //WebElements declaration
		By option = By.name("nav-icon nav-arrow");
		By signout = By.id("nav-item-signout");

	public void SignOut()throws InterruptedException{
		driver.findElement(option).click();
		driver.findElement(signout).click();
		System.out.println("User is signed out succesfullyy");
	}

}
