import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class YouTube {
    public static void goToYouTube (WebDriver driver) {
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
    }
        public static void logIn (WebDriver driver) throws java.lang.Exception{
            driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/a")).click();
            driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("thenarenraizada");
            RobotMethods.pressEnterAndWait(3000);
            driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("124828cchd");
            RobotMethods.pressEnterAndWait(5000);
        }
        public static void searchVideo(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("iPhone"); }
        public static void openVideo(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
        }
        public static void playVideo(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
        }
        public static void logout(WebDriver driver){
            driver.get("https://www.youtube.com/logout");
        }
    public static void main(String[] args) {
        WebDriver driver = ChromeDriver.createWebDriverInstance();
        SeleniumMisc seleniumMisc = new SeleniumMisc();
        try{
            goToYouTube(driver);
            driver.manage().window().maximize();
            logIn(driver);

            if(seleniumMisc.findElementBy(driver, By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon"))) {
                Thread.sleep(2000);
                RobotMethods.pressEscapeAndWait(1500);
                searchVideo(driver);
                playVideo(driver);

            }
            else{
                System.out.println("Page failed to load in 30secs");
            }
            Thread.sleep(3000);
            RobotMethods.pressEscapeAndWait(1500);
            openVideo(driver);
            Thread.sleep(2000);
            SeleniumMisc.takeSnapShot(driver, "/home/naren/Documents/SeleniumScreenshots/" + System.currentTimeMillis() + ".png");
            RobotMethods.pressFAndWait(5000);
            SeleniumMisc.takeSnapShot(driver, "/home/naren/Documents/SeleniumScreenshots/" + System.currentTimeMillis() + ".png");

            RobotMethods.pressArrowDown(5);
            RobotMethods.pressKAndWait(1000);
            RobotMethods.pressKAndWait(1000);
            RobotMethods.pressMAndWait(1000);
            RobotMethods.pressEscapeAndWait(2000);

            // Play/Pause (k); Volume Up/Down arrow; Mute/UnMute (m)

            driver.get("https://www.youtube.com/logout");
            Thread.sleep(2000);
            driver.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
//        finally {
//            driver.close();
//        }
    }
}
