package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ProfilePage extends BasePage {

	WebDriver driver;

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='summary']")
	WebElement SUMMARY_OF_PROFILE_ELEMENT;

	public void validateProfilePage() {

		waitForElement(driver, 5, SUMMARY_OF_PROFILE_ELEMENT);
		Assert.assertTrue(SUMMARY_OF_PROFILE_ELEMENT.isDisplayed(), "Profile page not found.");
	}

	// tbody/tr[1]/td[3]
	// tbody/tr[2]/td[3]
	// tbody/tr[3]/td[3]
	// tbody/tr[1]/td[7]/a[2]

	String before_xpath = "//tbody/tr[";
	String after_xpath_name = "]/td[3]";
	String after_xpath_delete = "]/td[7]/a[2]";

	public void validateInsertedNameAndDelete() {
		AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
		
		for (int i = 1; i <= 5; i++) {
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath_name)).getText();
			System.out.println(name);
			if (name.contains(addCustomerPage.insertedName)) {
				driver.findElement(By.xpath(before_xpath + i + after_xpath_delete)).click();
			}
		}
	}

}
