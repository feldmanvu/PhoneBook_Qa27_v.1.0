import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() {
        wd.findElement(By.linkText("LOGIN")).click();
        List<WebElement> inputs = wd.findElements(By.tagName("input"));
        fillByElement(inputs.get(0), "Mona447233@mail.com");
        fillByElement(inputs.get(1), "Mona12$447233");

        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        buttons.get(0).click();

        String text = wd.findElement(By.tagName("button")).getText();
        Assert.assertEquals(text, "Sign Out");


    }

    @Test
    public void loginTest2() {

        wd.findElement(By.cssSelector("[href='/login']")).click();

        fillByLocator(By.cssSelector("input[placeholder='Email']"), "Mona447233@mail.com");
        fillByLocator(By.cssSelector("[placeholder='Password']"), "Mona12$447233");

        /*wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.cssSelector("[id='root']"));
        wd.findElement(By.cssSelector("[id='root']"));
        wd.findElement(By.cssSelector("div[id='root'][class='conteiner']"));*/

wd.findElement(By.cssSelector("button:first-of-type")).click();

        String text = wd.findElement(By.tagName("button")).getText();
        Assert.assertEquals(text, "Sign Out");


    }
    @Test
    public void LoginWithModel(){

        openLogRegForm();
        pause(1000);
        fillLogRegForm(new User()
                .withEmail("Mona447233@mail.com")
        .withPassword("Mona12$447233"));
        clickLoginButton();
        Assert.assertEquals(takeText(By.xpath("//button[.='Sign Out']")), "Sign Out");
        Assert.assertTrue(isloggin());


    }


}
