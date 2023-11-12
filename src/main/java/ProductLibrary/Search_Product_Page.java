package ProductLibrary;

import MainPackage.Base.BasePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Search_Product_Page  extends BasePage {
    public Search_Product_Page(SHAFT.GUI.WebDriver driver) {super(driver);}

    //************* Element Locator : *********************
    private static By Search_Input_Locator = By.id("start-adornment-email");  // Search_Input_Locator


    public static void Search_For_Any_Product(String Product_Name){
        driver.element().type(Search_Input_Locator , Product_Name);
    }










}
