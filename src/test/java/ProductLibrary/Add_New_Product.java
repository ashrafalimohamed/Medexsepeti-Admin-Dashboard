package ProductLibrary;

import MainPackage.Base.TestPage;
import MainPackage.DataGenerator.ProductDataGenerator;
import org.testng.annotations.Test;

public class Add_New_Product extends TestPage {
    @Test
    public void TC_01_Add_New_Product_Successfully() {

        Add_New_Product_Page.General_Information(
                ProductDataGenerator.Barcode,
                ProductDataGenerator.Model_Name,
                ProductDataGenerator.Product_Model_Code,
                "Active",
                ProductDataGenerator.Product_Name_Generator,
                ProductDataGenerator.Product_Name_Generator_2,

                "Description",
                "",
                "Integra",
                "1 | Home & Family",
                ProductDataGenerator.DSI_number,
                "10%");

        Search_Product_Page.Search_For_Any_Product(ProductDataGenerator.Product_Name_Generator_2);

        Edit_Product_Page.Edit_Product(ProductDataGenerator.Barcode,
                ProductDataGenerator.Model_Name,
                ProductDataGenerator.Product_Model_Code,
                "Active");
    }
}
