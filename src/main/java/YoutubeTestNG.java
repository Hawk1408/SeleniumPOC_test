import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.awt.Robot;
import java.awt.event.KeyEvent;


public class YoutubeTestNG {
    @Test(priority = 0)
    public static void goToYouTube (WebDriver driver){
        driver.get("https://www.youtube.com/"); }
    @Test(groups = "testnggroup", dependsOnMethods = "goToYouTube")
    public static void logIn (WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/a")).click();}
    @Test(groups = "testnggroup")
    public static void logInUserName(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("");}
    @Test(groups = "testnggroup", dependsOnMethods = "goToYouTube")
    public static void logInPassword(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("");}
    public static void searchVideo(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("table"); }
    public static void openVideo(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
    }

    public static void main(String[] args) {

    }

    }

