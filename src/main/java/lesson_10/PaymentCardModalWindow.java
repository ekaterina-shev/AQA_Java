package lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

public class PaymentCardModalWindow {

    private final By paymentAmountText = By.xpath("//div[@class = 'pay-description__cost']/span");
    private final By phoneNumberText = By.xpath("//div[@class = 'pay-description__text']//span");
    private final By completePaymentButton = By.xpath("//div[@class = 'card-page__card']//button");
    private final By cardInputFieldLabels = By.xpath("//app-card-input//div//app-input//label");
    private final By cardImages = By.xpath("//div[contains(@class, 'cards-brands cards-brands__container')]//img");
    private final By paymentWindowFrame = By.xpath("//*[@class = 'bepaid-iframe']");

    private final WebDriver driver;
    private final WebDriverWait wait;

    public PaymentCardModalWindow(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 5);
        driver.switchTo().frame(driver.findElement(paymentWindowFrame));
        wait.until(ExpectedConditions.elementToBeClickable(this.paymentAmountText));
    }

    public boolean isPaymentAmountDisplayed() {
        return driver.findElement(paymentAmountText).isDisplayed();
    }

    public String getPaymentAmount() {
        return driver.findElement(paymentAmountText).getText();
    }

    public String getCompletePaymentButtonText() {
        return driver.findElement(completePaymentButton).getText();
    }

    public String getPhoneNumberText() {
        return driver.findElement(phoneNumberText).getText();
    }

    public List<String> getCardInputFieldTextList() {
        return driver.findElements(cardInputFieldLabels)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public int getCardImagesSize() {
        return driver.findElements(cardImages).size();
    }
}
