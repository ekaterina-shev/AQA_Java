import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;


public abstract class AbstractBaseTest {

    public WebDriver driver;

    @BeforeEach
    public void setUp() {
        var driverPath = Paths.get("src/main/resources/chromedriver.exe").toAbsolutePath().toString();
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mts.by/");

        try {
            Thread.sleep(500);
            var cookieAccept = driver.findElement(By.xpath("//button[@class = 'btn btn_black cookie__ok']"));
            if (cookieAccept.isDisplayed()) {
                cookieAccept.click();
            }
        } catch (NoSuchElementException | InterruptedException ignored) {
            System.out.println();
        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
