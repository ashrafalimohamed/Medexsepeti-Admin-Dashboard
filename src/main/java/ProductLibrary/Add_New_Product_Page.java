package ProductLibrary;

import MainPackage.Base.BasePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Add_New_Product_Page extends BasePage {
    public Add_New_Product_Page(SHAFT.GUI.WebDriver driver) {super(driver);}


    //************* Element Locator : *********************

    private static By Product_Library_Button_Locator = By.xpath("//h6[normalize-space()='Product Library']");  // Product_Library_Button
    private static By Add_New_Product_Button_Locator = By.xpath("//button[normalize-space()='Add New']");   // Add_New_Product_Button


    // General Information Locator  ******
    private static By Barcode_Input_Locator = By.id("sku_number");    // Barcode_Input
    private static By Model_Input_Locator = By.xpath("//input[@id='model']");  //  Model_Input
    private static By Product_Model_Code_Input_Locator = By.id("product_model_name");    // Product_Model_Code_Input

    private static By StatusDropDown = By.xpath("//div[@id='status']");   // StatusDropDown List


    // Main Information   **********
    private static By Product_Name_TR_Locator = By.id("name_tr");   // Product_Name_TR
    private static By English_Button_Locator = By.xpath("//button[normalize-space()='English']");   //Click English_  Button

    private static By Product_Name_En_Locator = By.id("name_en");   // Product_Name_En
    private static By Description_Locator = By.xpath("//*[@class=\"editorClassName rdw-editor-main\"]");   // Description_Locator
    private static By Tags_Locator = By.id(":r1a:");   // Tags_Locator .


    //Other  Information   **********

    private static By Selet_Brand_Locator = By.xpath("//h6[normalize-space()='Select brand']");   // Selet_Brand Locator .
    private static By Select_Category_Locator = By.xpath("//h6[normalize-space()='Select category']");   //  Select_Category Locator .

    private static By DSI_Locator = By.xpath("//input[@id='dsi']");   // DSI_Locator .
    private static By Select_VAT_Rate_Locator = By.xpath("//div[@id='vat_rate']");   // Select VAT_Rate Locator .
    private static By Next_Button_Locator = By.xpath("//button[@type='submit']");   // Next_Button Locator.
    private static By Select_Hase_No_Option_Locator = By.xpath("//input[@value='0']");   // Select_Hase_No_Option  Locator.


    //Upload Images  **********

    private static By Upload_product_main_image_Locator = By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div[2]/div/form/div/div[1]/div/div[1]/div/div[2]/div/input");   // Select_Hase_No_Option  Locator.

    private static By Submit_Button = By.xpath("//button[@type='submit']");
    public static void General_Information(
            String Barcode,
            String Model,
            String Product_Model_Code,
            String Status,
            String Product_Name_TR,
            String Product_Name_En,
            String Description ,
            String Tags ,
            String Brand,
            String Categories,
            String DSI,
            String VAT_Rate) {

        driver.element().click(Product_Library_Button_Locator);
        driver.element().click(Add_New_Product_Button_Locator);

        driver.element().type(Barcode_Input_Locator, Barcode);
        driver.element().type(Model_Input_Locator, Model);
        driver.element().type(Product_Model_Code_Input_Locator, Product_Model_Code);
        driver.element().select(StatusDropDown, Status);

        driver.element().type(Product_Name_TR_Locator, Product_Name_TR);
        driver.element().click(English_Button_Locator);
        driver.element().type(Product_Name_En_Locator, Product_Name_En);


        driver.element().type(Description_Locator , Description);

        driver.element().type(Tags_Locator , Tags);


        driver.element().select(Selet_Brand_Locator, Brand);
        driver.element().select(Select_Category_Locator, Categories);

        driver.element().type(DSI_Locator, DSI);
        driver.element().select(Select_VAT_Rate_Locator, VAT_Rate);

        driver.element().click(Select_Hase_No_Option_Locator);

        driver.element().click(Next_Button_Locator);

        driver.element().typeFileLocationForUpload(Upload_product_main_image_Locator, "src/test/resources/testDataFiles/ProductFiles/productMainImage.png");

        driver.element().click(Next_Button_Locator);
        driver.element().click(Next_Button_Locator);
        driver.element().click(Submit_Button);
    }


}
