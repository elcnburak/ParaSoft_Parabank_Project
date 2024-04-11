package Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utilities.GWD.getDriver;

public class DialogContent extends ParentPage {


    public DialogContent() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement OpenNewAccount;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement LoginButton;

    @FindBy(xpath = "//*[@id='leftPanel']/p")
    public WebElement LoginSuccessText;

    @FindBy(xpath = "(//*[@id='type']/option)[2]")
    public WebElement AccountType;

    @FindBy(xpath = "//*[@id='type']")
    public WebElement accountTypes;

    @FindBy(xpath = "//*[@id='fromAccountId']")
    public WebElement accountNumbers;
    @FindBy(xpath = "//*[@class='smallText']/b")
    public WebElement welcomeMessage;
    @FindBy(xpath = "//*[@class='title']")
    public WebElement successMessage;

    @FindBy(xpath = "(//*[@id='fromAccountId']/option)[1]")
    public WebElement existingAccountNumber;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement confirmOpenNewAccount;

    @FindBy(xpath = "//option[@value='13455']")
    public WebElement option13;
    @FindBy(xpath = "//*[@value='Open New Account']")
    public WebElement OpenNewAccountButton;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/h1")
    public WebElement AccountOpenTest;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "OpenNewAccount":
                return this.OpenNewAccount;
            case "LoginButton":
                return this.LoginButton;
            case "LoginSuccessText":
                return this.LoginSuccessText;
            case "successMessage":
                return this.successMessage;
            case "AccountType":
                return this.AccountType;
            case "CheckingOption":
                return this.accountNumbers;
            case "Existingaccount":
                return this.existingAccountNumber;
            case " OpenAccountButton":
                return this.OpenNewAccountButton;
            case "AccountOpenTest":
                return this.AccountOpenTest;
            case "option13":
                return this.option13;
            case " welcomeMessage":
                return this. welcomeMessage;
            default:
        }
        return null;

    }
}


























