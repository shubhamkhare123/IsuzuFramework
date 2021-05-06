package ISUZU.WebProject;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ISUZU.WebProject.pages.HomePage;
import ISUZU.WebProject.pages.HomePage2;

public class HeroTest extends TestNgTestBase {

  private HomePage homepage;
  private HomePage2 homepage2;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
    homepage2 = PageFactory.initElements(driver, HomePage2.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    homepage.login();
  }
}
