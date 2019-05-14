import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.security.PublicKey;
public class Amazon {
public static void goToAmazon(WebDriver driver){driver.get("https://www.amazon.com/"); }
public static void searchItem(WebDriver driver){
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("chair"); }
public static void dropDown(WebDriver driver){
    Select dropdown = new Select(driver.findElement(By.id("//*[@id=\"searchDropdownBox\"]"))); }
public static void proceedSearch(WebDriver driver){
driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click(); }
public static void closeBroweser (WebDriver driver){
driver.close(); }
public static void itemDetail(WebDriver driver){
driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img")).click(); }
public static void addToCart(WebDriver driver){
    driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click(); }
public static void main(String[] args) {
WebDriver driver = ChromeDriver.createWebDriverInstance();
goToAmazon(driver);
driver.manage().window().maximize();
searchItem(driver);
proceedSearch(driver);
itemDetail(driver);
addToCart(driver); }}