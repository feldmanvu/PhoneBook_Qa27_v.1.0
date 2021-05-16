import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLogined()) {
            app.getUser().login(new User().withEmail("Mon447233@mail.com").withPassword("Mon12$447233"));
        }

    }

    @Test
    public void logOutTest() throws InterruptedException {
        app.getUser().pause(2000);
        app.getUser().clickOnSingOutButton();
        app.getUser().pause(3000);
        app.getUser().takeScreenshot("");
        Assert.assertTrue(app.getUser().isLoginButtonPresent());


    }
}
