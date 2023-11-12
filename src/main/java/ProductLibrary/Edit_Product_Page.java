package ProductLibrary;

import MainPackage.Base.BasePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Edit_Product_Page extends BasePage {
    public Edit_Product_Page(SHAFT.GUI.WebDriver driver) {super(driver);}

    //************* Element Locator : *********************

    private static By edit_button_Locator = By.xpath("//span[@aria-label='edit']//*[name()='svg']");  // edit_button_Locator


    // General Information Locator  ******
    private static By Barcode_Input_Locator = By.id("sku_number");    // Barcode_Input
    private static By Model_Input_Locator = By.xpath("//input[@id='model']");  //  Model_Input
    private static By Product_Model_Code_Input_Locator = By.id("product_model_name");    // Product_Model_Code_Input

    private static By StatusDropDown = By.xpath("//div[@id='status']");   // StatusDropDown List



    public static void Edit_Product(String Barcode,
                                    String Model,
                                    String Product_Model_Code,
                                    String Status){


        driver.element().click(edit_button_Locator);

        driver.element().type(Barcode_Input_Locator, Barcode);
        driver.element().type(Model_Input_Locator, Model);
        driver.element().type(Product_Model_Code_Input_Locator, Product_Model_Code);
        driver.element().select(StatusDropDown, Status);


    }


}
