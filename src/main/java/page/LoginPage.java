package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Elements 
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']") WebElement SIGNIN_BUTTON_ELEMENT;
	
	//Intractable methods
	public void enterUserName(String username) {
		USER_NAME_ELEMENT.sendKeys(username);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}

}
