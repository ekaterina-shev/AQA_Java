package lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

public class MainPage {

    private final By onlineFulfillmentTitleText = By.xpath("//div[@class = 'pay__wrapper']/h2");
    private final By onlineFulfillmentBlock = By.xpath("//div[@class = 'pay__wrapper']");
    private final By onlinePaymentLogos = By.xpath("//div[@class='pay__partners']//img");
    private final By onlineFulfillmentTypeDropdown = By.xpath("//button[@class = 'select__header']");
    private final By onlineFulfillmentTypeFields = By.xpath("//form[@class = 'pay-form opened']//input");
    private final By phoneInput = By.id("connection-phone");
    private final By amountInput = By.id("connection-sum");
    private final By submitButton = By.xpath("//button[contains(text(),'Продолжить')]");
    private final By moreAboutTheServiceButton = By.xpath("//div[@class = 'pay__wrapper']/a");
    private final WebDriver driver;
    private final WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 5);
    }

    public MainPage scrollToOnlineFulfillmentForm() {
        var onlineFulfillmentTextElement = driver.findElement(onlineFulfillmentTitleText);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", onlineFulfillmentTextElement);
        return this;
    }

    public String getOnlineFulfillmentBlockTitleText() {
        return driver.findElement(onlineFulfillmentTitleText).getText();
    }

    public boolean isOnlineFulfillmentBlockDisplayed() {
        return driver.findElement(onlineFulfillmentBlock).isDisplayed();
    }

    public int getLogosCount() {
        return driver.findElements(onlinePaymentLogos).size();
    }

    public List<String> getLogosTextList() {
        return driver.findElements(onlinePaymentLogos).stream()
                .map(el -> el.getAttribute("alt"))
                .collect(Collectors.toList());
    }

    public List<String> getOnlineFulfillmentTypeFieldPlaceholderList() {
        return driver.findElements(onlineFulfillmentTypeFields).stream()
                .map(el -> el.getAttribute("placeholder"))
                .collect(Collectors.toList());
    }

    public MainPage inputPhoneNumber(String phoneNumber) {
        var phoneInput = wait.until(ExpectedConditions.elementToBeClickable(this.phoneInput));
        phoneInput.sendKeys(phoneNumber);
        return this;
    }

    public MainPage inputAmount(String amount) {
        driver.findElement(amountInput).sendKeys(amount);
        return this;
    }

    public MainPage selectPaymentTypeDropdownOptionByIndex(int index) {
        driver.findElement(onlineFulfillmentTypeDropdown).click();
        var elementByIndexLocator = String.format("//ul[@class = 'select__list']//li[%s]", index);
        driver.findElement(By.xpath(elementByIndexLocator)).click();
        return this;
    }

    public MainPage clickSubmitButton() {
        driver.findElement(submitButton).click();
        return this;
    }

    public MainPage clickMoreAboutTheServiceButton() {
        driver.findElement(moreAboutTheServiceButton).click();
        return this;
    }
}
