package Element_Repository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Hooks.Hooks;

public class WebTables 
{
	WebDriver driver;
	Hooks hook;
	
	public WebTables(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='btn btn-link pull-right']")
	private WebElement addUser;
	
	@FindBy(xpath = "//input[@name='FirstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='LastName']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@name='UserName']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@name='Password']")
	private WebElement password;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement compAAA_RadioButton;
	
	@FindBy(xpath = "//select[@name='RoleId']")
	private WebElement dropdown;
	
	@FindBy(xpath = "//input[@name='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='Mobilephone']")
	private WebElement mobilePhone;
	
	@FindBy(xpath = "//button[@ng-click='save(user)']")
	private WebElement save;
	
	@FindBy(xpath = "(//table[@table-title='Smart Table example']/tbody/tr/td)[1]")
	private WebElement addedUser;
	
	@FindBy(xpath = "(//button[@ng-click='delUser()'])[4]")
	private WebElement deleteNovak;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement okDelete;
	
	@FindBy(xpath = "//td[contains(text(),'novak')]")
	private WebElement userNovak;

	public void createUser() throws IOException 
	{
		hook = new Hooks();
		driver = hook.setup();
		addUser.click();
	}
	
	public void addUserDetails() 
	{
		firstName.sendKeys("Charlie");
		lastName.sendKeys("Brown");
		userName.sendKeys("Charlie_Brown");
		password.sendKeys("CharlieBrown");
		compAAA_RadioButton.click();
		Select select = new Select(dropdown);
        select.selectByVisibleText("Customer");
		email.sendKeys("charliebrown@gmail.com");
		mobilePhone.sendKeys("9876543210");
		save.click();
	}
	
	public boolean verifyUser()
	{
		return addedUser.isDisplayed();
	}
	
	public void deleteUser()
	{
		deleteNovak.click();
	}
	
	public void confirmDelete()
	{
		okDelete.click();
	}
	
	public boolean verifyUserDeleted()
	{
		return userNovak.isDisplayed();
	}
}
