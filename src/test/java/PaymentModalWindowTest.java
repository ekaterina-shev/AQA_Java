import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import lesson_10.MainPage;
import lesson_10.PaymentCardModalWindow;

import java.util.List;

public class PaymentModalWindowTest extends AbstractBaseTest {

    @Test
    public void testSubmitButton() {
        var expectedCardFieldLabels = List.of("Номер карты", "Срок действия", "CVC", "Имя и фамилия на карте");
        var expectedPaymentAmount = "5.00 BYN";
        var expectedCompletePaymentButtonText = String.format("Оплатить %s", expectedPaymentAmount);
        var phoneNumber = "297777777";
        var expectedPhoneNumberText = String.format("Оплата: Услуги связи Номер:375%s", phoneNumber);
        var amount = "5";
        var expectedCardCount = 5;

        var mainPage = new MainPage(driver);
        mainPage.scrollToOnlineFulfillmentForm()
                .inputPhoneNumber(phoneNumber)
                .inputAmount(amount)
                .clickSubmitButton();

        var paymentCardModalWindow = new PaymentCardModalWindow(driver);

        var actualPaymentAmount = paymentCardModalWindow.getPaymentAmount();
        var actualCompletePaymentButtonText = paymentCardModalWindow.getCompletePaymentButtonText();
        var actualPhoneNumberText = paymentCardModalWindow.getPhoneNumberText();
        var actualCardFieldLabels = paymentCardModalWindow.getCardInputFieldTextList();
        var cardImagesCount = paymentCardModalWindow.getCardImagesSize();

        Assertions.assertEquals(expectedPaymentAmount, actualPaymentAmount, "Payment amount isn't valid");
        Assertions.assertEquals(expectedCompletePaymentButtonText, actualCompletePaymentButtonText,
                "Button payment amount isn't valid");
        Assertions.assertEquals(expectedPhoneNumberText, actualPhoneNumberText, "Phone number text isn't valid");
        Assertions.assertEquals(expectedCardFieldLabels, actualCardFieldLabels, "Card field isn't valid");
        Assertions.assertEquals(expectedCardCount, cardImagesCount, "Card count isn't valid");

    }
}
