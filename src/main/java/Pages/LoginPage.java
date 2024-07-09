package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     WebDriver driver;
    @FindBy(xpath = "//*[@id=\"user-name\"]")
    WebElement text_username;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement text_password;
    @FindBy(how= How.ID, using="login-button")
    WebElement btn_loginbtn;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);}
    public void loginValidCredential(String username, String password) {
        text_username.sendKeys(username);
        text_password.sendKeys(password);
        btn_loginbtn.click();}
    public void enterUsername(String username) {
        text_username.sendKeys(username);
    }
    public void enterpassword(String password) {
        text_password.sendKeys(password);
    }
    public void clickLogin() {
        btn_loginbtn.click();
    }
}

