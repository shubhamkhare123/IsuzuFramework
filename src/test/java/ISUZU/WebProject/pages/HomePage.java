package ISUZU.WebProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class HomePage extends Page {

  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement header;
  
  @FindBy(how = How.ID, using = "email")
  @CacheLookup
  public WebElement userid;
  
  @FindBy(how = How.ID, using = "pass")
  @CacheLookup
  public WebElement userPassword;

  @FindBy(how = How.XPATH, using = "//*[@data-testid='royal_login_button']")
  @CacheLookup
  public WebElement btnLogin;
  
  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }
  
  public void login() {
	  this.userid.sendKeys("Raman");
	  this.userPassword.sendKeys("Shubham");
	  this.btnLogin.click();
  } 
}
