package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utilities.GWD.getDriver;

public class DialogContent extends ParentPage{

    public DialogContent() {
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(xpath="")
    public WebElement firstName;

    @FindBy(xpath="")
    public WebElement lastName;

    @FindBy(xpath="")
    public WebElement address;

    @FindBy(xpath="")
    public WebElement city;

    @FindBy(xpath="")
    public WebElement state;

    @FindBy(xpath="")
    public WebElement zipCode;


    @FindBy(xpath="")
    public WebElement phone;

    @FindBy(xpath="")
    public WebElement SSN;

    @FindBy(xpath="")
    public WebElement userName;

    @FindBy(xpath="")
    public WebElement password;

    @FindBy(xpath="")
    public WebElement confirm;

    @FindBy(xpath="")
    public WebElement registerButton;




}
