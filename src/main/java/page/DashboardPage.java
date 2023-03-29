//check dashboard header with assertion

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	// Web Elements
	
	WebDriver driver;

	public DashboardPage(WebDriver driver) { // created constructor
		this.driver = driver;
	}

	// WebElement
	@FindBy(how = How.XPATH, using = "//div[@class='col-lg-12']/h2")
	WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//ul[@id = 'side-menu']/li[3]/a/span[1]")
	WebElement CUSTOMERS_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//ul[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADD_CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement LIST_CUSTOMER_ELEMENT;

	// Intractable methods
	public void validateDashboardPage() {
		Assert.assertTrue(DASHBOARD_HEADER_ELEMENT.isDisplayed(), "Dashboard page is not available");
		// Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), " Dashboard ",
		// "Dashboard header does not match.");
	}

	public void clickCustomersMenuElement() {
		CUSTOMERS_MENU_ELEMENT.click();
	}

	public void clickAddCustomerMenuElement() {
		ADD_CUSTOMER_MENU_ELEMENT.click();
	}
	
	public void clickListCustomerMenuElement() {
		LIST_CUSTOMER_ELEMENT.click();
	}
}
