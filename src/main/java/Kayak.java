import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kayak {
    public static WebDriver createWebDriverInstance(){
        System.setProperty("webdriver.chrome.driver", "/home/naren/Documents/chromedriver");
        return new ChromeDriver();
    }

    public static void goToKayak(WebDriver driver) { driver.get("http://www.kayak.com");}

    public static void setDestination (WebDriver driver){
        driver.findElement(By.xpath("//*[ends-with(-origin-airport-display-inner\"]")).sendKeys("Chicago (ORD)");
    }

    public static void setCurrentCity(WebDriver driver){
        driver.findElement(By.id("HvJl-destination-airport")).sendKeys("New Delhi (DEL)");
    }

    public static void setFromDate(WebDriver driver){
    driver.findElement(By.id("HvJl-depart")).sendKeys("05/15/2019");
    }

    public static void setToDate(WebDriver driver){
    driver.findElement(By.id("HvJl-return-input")).sendKeys("05/15/2019");
    }

    public static void searchMethod(WebDriver driver){
    driver.findElement(By.xpath("//*[@id=\"HvJl-submit\"]/span/svg")).click();
    }

    public static void dropDown(WebDriver driver){
        driver.findElement(By.cssSelector("searchDropdownBox")).
                findElement(By.cssSelector("select.fare-finder__calendar__month-selector__dropdown"));
    }

    public static void closeBroweser (WebDriver driver){
        driver.close();
    }

    public static void main(String[] args) {
        WebDriver driver = createWebDriverInstance();
        goToKayak(driver);
        driver.manage().window().maximize();
        setDestination(driver);
        setCurrentCity(driver);
        setFromDate(driver);
        setToDate(driver);
        searchMethod(driver);
        closeBroweser(driver);


    }
}
