package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_class;

public class Login extends Base_class {
	@FindBy (id="username")
	private WebElement un;
	@FindBy (xpath="//input[@type='password']")
	private WebElement pwd;
	@FindBy (xpath = "//div[.='Login ']")
	private WebElement lgn;
	public Login(WebDriver driver) {
		super(driver);
	}
	public void setname(String unn) {
		un.sendKeys(unn);
	}
	public void setpassword(String pwdd) {
		pwd.sendKeys(pwdd);
	}
	public void setlogin() {
		lgn.click();
	}

}
