import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.Assertion;

import java.util.List;

public class amazon {

    /**
     *
     * @return ChromeDriver
     */

    private static Assertion assertion = new Assertion();
    private static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "/home/naren/Documents/chromedriver");
        return new ChromeDriver();
    }

    public static void getCategoriesOnamazon(WebDriver driver) {

       // WebDriver driver = getChromeDriver();

        //Go to Amazon

        driver.get("https://www.amazon.com");

        List<WebElement> categories = driver.findElement(By.id("searchDropdownBox")).findElements(By.xpath("*"));
        System.out.println("Number of Categories: " + categories.size() + "\n");

        for (WebElement element: categories
        ) {
            System.out.println(element.getText());
        }

        //driver.close();
    }
    public static void addItemToCart(WebDriver driver) {

    }

    public static void goToAmazon(WebDriver driver){driver.get("https://www.amazon.com/"); }

    public static  void logIn(WebDriver driver) throws Exception{
        goToAmazon(driver);
        driver.manage().window().maximize();
        String password = "xxUrFMmqyJ+DsLXDL4iZaw==";
        try {
            driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("raizadanaren@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(Crypto.decryptString(password));
            driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
            SeleniumMisc.hoverMouse(driver,By.xpath("//*[@id=\"nav-link-accountList\"]"));
            Thread.sleep(5000);
            SeleniumMisc.hoverMouse(driver,By.xpath("//*[@id=\"nav-item-signout\"]/span"));
            RobotMethods.click();
            //driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]/span")).click();
            Thread.sleep(3000);
        }
        catch(Exception e){
            SeleniumMisc.takeSnapShot(driver, "/home/naren/Documents/SeleniumScreenshots/Error_Amazon_" + System.currentTimeMillis() + ".png");
            e.printStackTrace();
            assertion.fail("Failed during logIn");
        }
//        finally {
//            driver.close();
//        }
    }

    public static void playVideoOnYoutube() throws java.lang.InterruptedException{
        WebDriver driver = getChromeDriver();
        Actions action = new Actions(driver);

        //Go to YouTube

        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();

        driver.findElement(By.id("search")).sendKeys("unbox therapy");
        driver.findElement(By.id("search-icon-legacy")).click();

        driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
        action.sendKeys("f");
        Thread.sleep(5000);
        action.sendKeys(Keys.ESCAPE);
        //driver.close();
    }

    public static void main(String[] args) throws java.lang.Exception{
       // getCategoriesOnamazon();
       // playVideoOnYoutube();
        WebDriver driver = getChromeDriver();
        logIn(driver);

    }
}