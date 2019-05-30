import org.openqa.selenium.WebDriver;

public class ChromeDriver {
    public static WebDriver createWebDriverInstance(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
        return new org.openqa.selenium.chrome.ChromeDriver();
    }
}
