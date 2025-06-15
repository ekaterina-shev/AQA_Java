import lesson_7.MTS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class СontinueButtonTest extends MTS {
    @Test
    public void testСontinueButton() {
        try {
            WebElement cookieAccept = driver.findElement(By.cssSelector(".cookie.show .cookie__button"));
            if (cookieAccept.isDisplayed()) {
                cookieAccept.click();
                Thread.sleep(500);
            }
        } catch (NoSuchElementException | InterruptedException ignored) {
        }

        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement phoneInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("connection-phone")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", phoneInput);
        phoneInput.sendKeys("297777777");

        WebElement amountInput = driver.findElement(By.id("connection-sum"));
        amountInput.clear();
        amountInput.sendKeys("5");

        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        continueButton.click();

        boolean isPaymentStepShown = driver.getPageSource().toLowerCase().contains("оплатить") || driver.getCurrentUrl().toLowerCase().contains("pay");

        Assertions.assertTrue(isPaymentStepShown, "Не удалось перейти к оплате");
    }
}
