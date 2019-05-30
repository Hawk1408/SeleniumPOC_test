import com.google.common.hash.HashingInputStream;
import net.bytebuddy.description.annotation.AnnotationDescription;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class SeleniumMisc {
    private static int secsWait;
    SeleniumMisc() {secsWait =30;}
    int SeleniumMisc(int secs){
        secsWait = secs;
        return secsWait;
    }

    private WebDriverWait waitFor(WebDriver driver){
        return new WebDriverWait(driver, secsWait);
    }

    public boolean findElementBy (WebDriver driver, By selector){
        return waitFor(driver).until(ExpectedConditions.visibilityOfElementLocated(selector)).isDisplayed();
    }
    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

    }

    public static void hoverMouse(WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        Locatable hoverItem = (Locatable) element;
        Mouse mouse = ((HasInputDevices) driver).getMouse();
        mouse.mouseMove(hoverItem.getCoordinates());
    }
}


