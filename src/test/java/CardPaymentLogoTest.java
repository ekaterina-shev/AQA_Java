import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import lesson_10.MainPage;

import java.util.List;

public class CardPaymentLogoTest extends AbstractBaseTest {

    @Test
    public void testPaymentLogo() {
        var expectedPaymentTextList = List.of("Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт");
        var expectedPaymentLogosCount = 5;

        var mainMage = new MainPage(driver);
        mainMage.scrollToOnlineFulfillmentForm();

        var actualLogosCount = mainMage.getLogosCount();
        var actualLogosTextList = mainMage.getLogosTextList();

        Assertions.assertEquals(expectedPaymentLogosCount, actualLogosCount, "Ожидается минимум 5 логотипов");
        Assertions.assertEquals(expectedPaymentTextList, actualLogosTextList, "Логотипы платёжных систем");
    }
}
