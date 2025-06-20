package lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternetPaymentSecurityPage {
    private final By internetCardPaymentInfoHeader = By.xpath("//div[@class = 'container-fluid']/h3[1]");
    private final WebDriver driver;

    public InternetPaymentSecurityPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isCardPaymentInfoHeaderDisplayed() {
        return driver.findElement(internetCardPaymentInfoHeader).isDisplayed();
    }
}
