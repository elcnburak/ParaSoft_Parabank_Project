package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{
    public LeftNav(){
        PageFactory.initElements(GWD.getDriver(),this);}
    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@id='customer.firstName']")
    public WebElement registerFirstName;

    @FindBy(xpath = "//*[@id='customer.lastName']")
    public WebElement registerLastName;
    @FindBy(xpath = "//*[@id='customer.address.street']")
    public WebElement registerAddress;
    @FindBy(xpath = "//*[@id='customer.address.city']")
    public WebElement registerCity;

    @FindBy(id = "customer.address.state")
    public WebElement registerState;
    @FindBy(xpath = "//*[@id='customer.address.zipCode']")
    public WebElement registerZipCode;
    @FindBy(id = "customer.phoneNumber")
    public WebElement registerPhoneNumber;
    @FindBy(id = "customer.ssn")
    public WebElement registerSSN;
    @FindBy(id = "customer.username")
    public WebElement registerUsername;
    @FindBy(id = "customer.password")
    public WebElement registerPassword;

    @FindBy(id = "repeatedPassword")
    public WebElement registerPasswordConfirm;

    @FindBy(xpath = "//*[@value='Register']")
    public WebElement registerButtonConfirmation;

    @FindBy(xpath = "//*[@class='title']")
    public WebElement welcomeMessage;

    @FindBy(xpath = "//h2[contains(text(),'Customer Login')]")
    public WebElement customerLogin;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement customerLoginUsername;

    @FindBy(xpath = "//input[@type='password' and @name='password']")
    public WebElement customerLoginPassword;

    @FindBy(xpath = "//input[@type='submit' and @value='Log In']")
    public WebElement customerLoginButton;

    @FindBy(xpath = "//*[text()='Request Loan']")
    public WebElement requestLoanButton;

    @FindBy(id = "amount")
    public WebElement loanAmountField;

    @FindBy(id = "downPayment")
    public WebElement downPaymentField;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement applyNowButton;

    @FindBy(id = "loanProviderName")
    public WebElement confirmLoanProvider;

    @FindBy(id = "loanStatus")
    public WebElement confirmLoanStatus;

    @FindBy(xpath = "(//*[@ng-if='loanResponse.approved'])[2]/p")
    public WebElement confirmLoanMessage;

    @FindBy(id = "newAccountId")
    public WebElement newAccountNumber;

    @FindBy(xpath = "//*[@ng-if='showActivity']/p/b")
    public WebElement confirmNoTransaction;

    @FindBy(id = "accountType")
    public WebElement confirmAccountType;

    @FindBy(id = "balance")
    public WebElement confirmBalance;

    @FindBy(id = "availableBalance")
    public WebElement confirmAvailableBalance;


    @FindBy(xpath="//a[contains(text(), 'Transfer Funds')]")
    public WebElement transferFunds;

    @FindBy(xpath="//option[@label=\"22002\" and @value=\"22002\"]")
    public WebElement transferToAccount;

    @FindBy(id ="amount")
    public WebElement transferAmount;


    @FindBy(xpath="//input[@type='submit' and @class='button' and @value='Transfer']")
    public WebElement transferButton;














































}

