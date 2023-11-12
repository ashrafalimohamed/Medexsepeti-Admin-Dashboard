package Authantication;

import MainPackage.Base.BasePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Login_Main extends BasePage {

    public Login_Main(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    public static final String BaseURl = System.getProperty("BaseURl");

    //************* Element Locator : *********************

    private By EmailLocator = By.id("email");      // Email Locator
    private By PasswordLocator = By.id("password");  // Paasword Locator
    private By SubmitButtonLocator = By.xpath("//*[@type='submit']");  // Submit Button Locator


    public void Login(String Email , String Password){
        driver.browser().navigateToURL(BaseURl);
        driver.element().type(EmailLocator , Email);
        driver.element().type(PasswordLocator , Password);
        driver.element().click(SubmitButtonLocator);
    }









}
