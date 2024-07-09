package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class StepsLogin {
    WebDriver driver;
    HomePage home;
    LoginPage login;
    @Given("Browser is open")
    public void browserIsOpen() {
        System.out.println("Opened the browser");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();}
    @And("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("User is on Login page");
        driver.get("https://www.saucedemo.com/v1/");
        System.out.println("Done");}
    @When("User enters {} and {}")
    public void userEntersAnd(String username, String password) {
        System.out.println("Finding driver");
        login = new LoginPage(driver);
        login.enterUsername(username);
        login.enterpassword(password);}
    @And("User click on login button")
    public void userClickOnLoginButton() {
        login.clickLogin();
        System.out.println("Login successful");}
    @Then("User is navigate to the homepage")
    public void userIsNavigateToTheHomepage() {
        home = new HomePage(driver);
        Assert.assertTrue(home.checktextisDisplayed());
        driver.close();
    }


}
