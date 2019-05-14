import org.openqa.selenium.WebDriver;

public class ChromeDriver {
    public static WebDriver createWebDriverInstance(){
        System.setProperty("webdriver.chrome.driver", "/home/naren/Documents/chromedriver");
        return new org.openqa.selenium.chrome.ChromeDriver();
    }
}
