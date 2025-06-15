import lesson_7.MTS;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;

public class BlockNameTest extends MTS {

    @Test
    public void testBlockName() {
        WebElement title = driver.findElement(By.xpath("//*[contains(text(),'Онлайн пополнение')]"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title);

        Assertions.assertTrue(title.isDisplayed(), "Блок с заголовком не отображается");
    }
}
