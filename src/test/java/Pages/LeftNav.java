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










    }
