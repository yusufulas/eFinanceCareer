package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testes.TestBase;

public class HomePage extends TestBase {

    public HomePage() {

       PageFactory.initElements(driver, HomePage.class);
    }
    //Elements
    @FindBy(className = "//button[contains(text(),'Sign in')]")
    private WebElement singInBtn;

    @FindBy(xpath = "//ul[@class='navbar-nav']/li")
    private WebElement searchJobsBtn;



    //Actions

public HomePage clickSingInButton() {
    singInBtn.click();
    return clickSingInButton();
}
   public HomePage clickSearchJobsBtn() {
       searchJobsBtn.click();
       return clickSearchJobsBtn();
}

}