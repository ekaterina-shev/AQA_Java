import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import lesson_10.MainPage;
import lesson_10.PaymentCardModalWindow;

public class SubmitButtonTest extends AbstractBaseTest {

    @Test
    public void testSubmitButton() {
        var phoneNumber = "297777777";
        var amount = "5";

        var mainPage = new MainPage(driver);
        mainPage.scrollToOnlineFulfillmentForm()
                .inputPhoneNumber(phoneNumber)
                .inputAmount(amount)
                .clickSubmitButton();

        var paymentCardModalWindow = new PaymentCardModalWindow(driver);

        boolean isModalWindowPaymentAmountDisplayed = paymentCardModalWindow.isPaymentAmountDisplayed();

        Assertions.assertTrue(isModalWindowPaymentAmountDisplayed, "Не удалось перейти к оплате");
    }
}
