package Global;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class InitDriver {
    public static WebDriver driver;
    public static String DIR = System.getProperty("user.dir");
    public static String getProperties() {
        Properties properties = new Properties();
        try (FileInputStream fileStream = new FileInputStream("src/test/resources/application.properties")) {
            properties.load(fileStream);
//            Constants.USERNAME = properties.getProperty("username");
//            Constants.PASSWORD = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("server-url"); //server-url link
    }
    public static ChromeOptions GenerateDriverChrome() {
//        System.out.println(DIR+"/driver/chromedriver");
//        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", DIR+"/driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox",
                "--single-process",
                "--ignore-ssl-errors=yes",
                "--ignore-certificate-errors",
                "--window-size=1280,800",
                "--remote-allow-origins=*"
//                            , "headless"
        );
        return options;
    }
    public static FirefoxOptions GenerateDriverFirefox(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--no-sandbox",
                "--single-process",
                "--ignore-ssl-errors=yes",
                "--ignore-certificate-errors"
//                            , "headless"
        );
        return options;
    }
    public static void initBrowser() {
        driver = new ChromeDriver(GenerateDriverChrome());
        driver.manage().window().maximize();
        driver.get(getProperties());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static void quit(){
        driver.close();
        driver.quit();
    }
}
