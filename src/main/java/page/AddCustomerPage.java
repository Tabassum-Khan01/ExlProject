package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) { // create constructor
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[1]/nav/div/a")
	WebElement NAV_MENU;
	@FindBy(how = How.XPATH, using = "//div[@ class='col-lg-12']/h2")
	WebElement CONTACTS_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//div[@ class='ibox-title']/h5")
	WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id ='email']")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='currency']")
	WebElement currencyElement;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")
	WebElement groupDropDownElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"rform\"]/div[1]/div[2]/div[5]/div/div")
	WebElement welcomeEmailElement;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_BUTTON;

	public void clickNavMenu() {
		NAV_MENU.click();
	}

	public void validateContactsHeader(String expectedText) {
		Assert.assertEquals(CONTACTS_HEADER_ELEMENT.getText(), "Contacts", "Contacts Header does not match.");
	}

	public void validateAddContactHeader(String expectedText) {
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), "Add Contact", "Add Contact Header does not match.");
	}

	String insertedName;

	public void insertFullName(String fullName) {
		insertedName = fullName + generateRandomNum(999);
		FULL_NAME_ELEMENT.sendKeys(insertedName);
		System.out.println("New customer inserted is: " + insertedName);
	}

	public void selectCompany(String company) {
		selectFromDropDown(COMPANY_DROPDOWN_ELEMENT, company);

	}

	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNum(99) + email);
	}

	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone + generateRandomNum(9999));
	}

	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}

	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
	}

	public void insertState(String state) {
		STATE_ELEMENT.sendKeys(state);
	}

	public void insertZip(String zip) {
		ZIP_ELEMENT.sendKeys(zip);
	}

	public void selectCountry(String country) {
		selectFromDropDown(COUNTRY_DROPDOWN_ELEMENT, country);
	}

	public void selectCurrency(String currency) {
		selectFromDropDown(currencyElement, currency);
	}

	public void selectGroup(String group) {
		selectFromDropDown(groupDropDownElement, group);
	}

	public void toggleWelcomeEmail() {
		welcomeEmailElement.click();
	}

	public void clickSaveButton() {
		SAVE_BUTTON.click();

	}

}
