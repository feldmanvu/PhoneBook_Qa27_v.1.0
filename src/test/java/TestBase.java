import application.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {


    ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        app.start();
    }

    @AfterMethod (alwaysRun = true)
    public void tearDown() {
        app.stop();
    }


}
