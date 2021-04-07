import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContact extends TestBase{

    @BeforeMethod
    public void preconditions(){
        if(isElement(By.cssSelector("[href='/login']"))){
            login("Mona447233@mail.com","Mona12$447233");
        }
    }
    @Test
    public void removeOneContact(){
        wd.findElement(By.cssSelector("[href='/contacts']")).click();
        WebElement contact= wd.findElement(By.cssSelector(".contact-item_card__2SOIM"));
        contact.click();
        WebElement removeBtn= wd.findElement(By.cssSelector(".contact-item-detailed_card__50dTS button:last-of-type"));
        removeBtn.click();

    }
    @Test
    public void removeAllContact(){

    }
    @AfterMethod
    public void postConditions(){

    }
}
