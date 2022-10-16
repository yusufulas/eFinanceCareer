package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingInModalPage {

    //Elements

    @FindBy(xpath = "//input[@id='fu9b0']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//div[@class='Button']")
    public WebElement continueButton;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='Title']/span")
    private WebElement modalTitle;

    @FindBy(xpath = "//div[contains(text(),'Please enter a valid email address')]")
    private WebElement ErrorMesEmail;

    @FindBy(xpath = "//div[contains(text(),'Please enter your password')]")
    private WebElement ErrorMesPassword;

    //Actions
    public SingInModalPage EnterEmail(String E_MAIL) {
        emailInput.sendKeys(E_MAIL);
        return this;

    }

    public SingInModalPage clickContinueButton() {
        continueButton.click();
        return this;

    }

    public SingInModalPage enterPassword(String PASSWORD) {
        passwordInput.sendKeys(PASSWORD);
        return this;

    }

    public SingInModalPage clickSubmitButton() {
        submitButton.click();
        return this;

    }

    public SingInModalPage clickContinueWithError() {
        continueButton.click();
        return this;
    }

    public SingInModalPage clickSubmitButtonWithError() {
        submitButton.click();
        return this;

    }
}