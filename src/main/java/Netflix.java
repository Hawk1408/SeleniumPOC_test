import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class Netflix {
    public static void goToNetflix (WebDriver driver){
        driver.get("https://www.netflix.com/"); }

    public static void netflixLogIn (WebDriver driver){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[2]")).click(); }

    public static void netflixUserName(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("6179097436");
    }

    public static void netflixPassword(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("R@1zadaash3r");
    }

    public static void selectProfile(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[1]/div/div[2]/div/div/ul/li[2]/div/a/div/div")).click();
    }

    public static void searchShow(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[1]/div/div[1]/div/div/div/div[1]/div/button/span")).click();
    }

    public static void searchInput(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[1]/div/div[1]/div/div/div/div[1]/div/div/input")).sendKeys("The Office");
    }

    public static void playVideo(WebDriver driver){
        driver.get("https://www.netflix.com/watch/70136120?tctx=0%2C0%2C%2C%2C");
    }

    public static void main(String[] args) {
        WebDriver driver = ChromeDriver.createWebDriverInstance();
        try {
        driver.manage().window().maximize();
        goToNetflix(driver);
        netflixLogIn(driver);
        netflixUserName(driver);
        netflixPassword(driver);
        RobotMethods.pressEnterAndWait(3000);
        selectProfile(driver);
        RobotMethods.pressSpaceAndWait(1000);
        searchShow(driver);
        searchInput(driver);
        playVideo(driver);
        RobotMethods.pressSpaceAndWait(1000);
        RobotMethods.pressSpaceAndWait(1000);
        RobotMethods.pressMAndWait(1000);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
//        finally {
//            driver.close();
//       }
    }
}
