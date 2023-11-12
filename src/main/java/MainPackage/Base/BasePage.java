package MainPackage.Base;

import com.shaft.driver.SHAFT;

public class BasePage {
    protected static SHAFT.GUI.WebDriver driver;
    public BasePage(SHAFT.GUI.WebDriver driver){
        this.driver = driver;
    }


}
