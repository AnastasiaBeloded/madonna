package tests;

import manager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class HelperBase {
    static ApplicationManager app = new ApplicationManager();


    @BeforeMethod
    public void setUp() {
        app.init();
    }
    @AfterMethod
    public void tearDown(){
          app.stop();
    }

}
