import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BestBuy {
    public static void goToEbay(WebDriver driver){driver.get("https://www.ebay.com/");}
    public static void shopCategories(WebDriver driver, String xpath){
        List<WebElement> listCategories = driver.findElement(By.xpath(xpath)).findElements(By.xpath("*"));
        System.out.println("Number of Categories - " + listCategories.size() + "\n");

        for (WebElement element: listCategories
        ){
            System.out.println(element.getText());
        }

    }

    public static void main(String[] args) throws java.lang.InterruptedException {
        WebDriver driver = ChromeDriver.createWebDriverInstance();
        goToEbay(driver);
        for(int i = 0; i < 100; i++) {
            try {
                if (i>2) {
                    shopCategories(driver, "//*[@id=\"gh-cat\"]");
                    driver.close();
                    break;
                }
                if(i<2)
                    shopCategories(driver, "//*[@id=\"ghs-cat\"]");
            } catch (org.openqa.selenium.NoSuchElementException e) {
                //e.printStackTrace();
                driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iphone");
                driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
                driver.get("https://www.ebay.com/");
                Thread.sleep(2000);
//            } finally {
//                driver.close();
           }
        }
    }
}
