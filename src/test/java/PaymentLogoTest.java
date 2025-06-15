import lesson_7.MTS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class PaymentLogoTest extends MTS {
    @Test
    public void testPaymentLogo() {
        List<String> expectedPayments = List.of("Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт");
        List<WebElement> logos = driver.findElements(By.xpath("//div[@class='pay__partners']//img"));
        List<String> altTexts = logos.stream()
                .map(el -> el.getAttribute("alt"))
                .collect(Collectors.toList());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logos.get(0));
        Assertions.assertTrue(logos.size() >= 5, "Ожидается минимум 5 логотипов");
        Assertions.assertFalse(logos.isEmpty(), "Логотипы платёжных систем не найдены");
        Assertions.assertEquals(expectedPayments, altTexts,  "Логотипы платёжных систем");
    }
}
