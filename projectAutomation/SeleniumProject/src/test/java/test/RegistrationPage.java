package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;
	By email=By.id("email");
	By password=By.id("password");
	
	
	RegistrationPage(WebDriver d) {
		driver = d;
		

	}
	
	
	
	public void setemail(String ename ) {
		driver.findElement(email).sendKeys(ename);
	}
	public void setpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
}
