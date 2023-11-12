package MainPackage.Base;

import Authantication.Login_Main;
import MainPackage.DataGenerator.AuthanticationDataGenerator;
import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;

public class TestPage {

    protected static SHAFT.GUI.WebDriver driver;
    protected static Login_Main login_main;

    @BeforeClass
    public void BeforeClass(){
        driver = new SHAFT.GUI.WebDriver();
        login_main = new Login_Main(driver);

        login_main.Login(
                AuthanticationDataGenerator.Email_Address,
                AuthanticationDataGenerator.Password);
    }

}
