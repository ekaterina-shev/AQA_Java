package lesson_7;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MTS {

    public WebDriver driver;

    @BeforeEach
    public void setUp() {
        String driverPath = Paths.get("src/main/resources/chromedriver.exe").toAbsolutePath().toString();
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mts.by/");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
