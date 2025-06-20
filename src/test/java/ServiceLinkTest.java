import lesson_10.MTS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import lesson_10.InternetPaymentSecurityPage;
import lesson_10.MainPage;

public class ServiceLinkTest extends MTS {
    @Test
    public void testMoreAboutServiceLink() {
        new MainPage(driver)
                .scrollToOnlineFulfillmentForm()
                .clickMoreAboutTheServiceButton();
        var internetPaymentSecurityPage = new InternetPaymentSecurityPage(driver);
        var isCardPaymentSecurityInfoDisplayed = internetPaymentSecurityPage.isCardPaymentInfoHeaderDisplayed();

        Assertions.assertTrue(isCardPaymentSecurityInfoDisplayed,
                "Ссылка 'Подробнее о сервисе' не ведёт на ожидаемую страницу");
    }
}