import lesson_7.MTS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class LinkTest extends MTS {
    @Test
    public void testMoreAboutServiceLink() {
        try {
            WebElement cookieAccept = driver.findElement(By.cssSelector(".cookie.show .cookie__button"));
            if (cookieAccept.isDisplayed()) {
                cookieAccept.click();
                Thread.sleep(500);
            }
        } catch (NoSuchElementException | InterruptedException ignored) {
        }


        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);
        String originalWindow = driver.getWindowHandle();
        link.click();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Assertions.assertTrue(driver.getCurrentUrl().contains("oplaty"),
                "Ссылка 'Подробнее о сервисе' не ведёт на ожидаемую страницу");
    }
}