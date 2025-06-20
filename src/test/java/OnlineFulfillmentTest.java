import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import lesson_10.MainPage;

import java.util.List;
import java.util.stream.Stream;

public class OnlineFulfillmentTest extends AbstractBaseTest {

    @Test
    void testOnlineFulfillmentBlock() {
        var expectedOnlineFulfilmentTitleText = "Онлайн пополнение\nбез комиссии";
        var mainPage = new MainPage(driver);
        mainPage.scrollToOnlineFulfillmentForm();
        var actualOnlineFulfilmentTitleText = mainPage.getOnlineFulfillmentBlockTitleText();
        var isOnlineFulfillmentBlockDisplayed = mainPage.isOnlineFulfillmentBlockDisplayed();

        Assertions.assertTrue(isOnlineFulfillmentBlockDisplayed, "Online fulfillment block isn't visible");
        Assertions.assertEquals(expectedOnlineFulfilmentTitleText, actualOnlineFulfilmentTitleText,
                "Online fulfillment text has invalid value");
    }

    @ParameterizedTest
    @MethodSource("formFieldsDataProvider")
    void testOnlineFulfillmentEmptyFields(int index, List<String> expectedPlaceholders) {
        var mainPage = new MainPage(driver);
        mainPage.scrollToOnlineFulfillmentForm()
                .selectPaymentTypeDropdownOptionByIndex(index);
        var onlineFulfilmentFieldPlaceholders = mainPage.getOnlineFulfillmentTypeFieldPlaceholderList();

        Assertions.assertEquals(expectedPlaceholders, onlineFulfilmentFieldPlaceholders,
                "Online fulfillment form placeholders has invalid value");
    }

    static Stream<Arguments> formFieldsDataProvider() {
        return Stream.of(
                Arguments.of(1, List.of("Номер телефона", "Сумма", "E-mail для отправки чека")),
                Arguments.of(2, List.of("Номер абонента", "Сумма", "E-mail для отправки чека")),
                Arguments.of(3, List.of("Номер счета на 44", "Сумма", "E-mail для отправки чека")),
                Arguments.of(4, List.of("Номер счета на 2073", "Сумма", "E-mail для отправки чека"))
        );
    }

}
