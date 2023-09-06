package PageObjects;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GenerarUtilidades {

    public static WebDriver driver;

    @BeforeEach
    public void setupHook (){
        System.setProperty("webdriver.chrome.driver","./src/Driver/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
// chromeOptions.addArguments("--remote-allow-origins");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

//driver = new ChromeDriver();



//driver = new ChromeDriver(chromeOptions);

    }


}
