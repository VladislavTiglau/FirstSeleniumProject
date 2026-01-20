import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Homework01 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
    @Test
    public void findElementByClassName() {
        WebElement title = driver.findElement(By.className("title"));
        System.out.println(title.getText());
        WebElement elements = driver.findElement(By.className("page-links"));
        System.out.println(elements.getClass());
        WebElement action = driver.findElement(By.className("action"));
        System.out.println(action.getText());
        WebElement login = driver.findElement(By.className("login-btn"));
        System.out.println(login.getText());

    }
    @Test
    public void findElementByTagName() {
        WebElement div = driver.findElement(By.tagName("div"));
        System.out.println(div.getText());
        WebElement span = driver.findElement(By.tagName("span"));
        System.out.println(span.getText());
        List<WebElement> div1 = driver.findElements(By.tagName("div"));
        System.out.println(div1.size());
        List<WebElement> span1 = driver.findElements(By.tagName("span"));
        System.out.println(span1.size());

    }
    @Test
    public void findElementById() {
        WebElement element = driver.findElement(By.id("0"));
        System.out.println(element.getAttribute("id"));
        WebElement element2 = driver.findElement(By.id("2"));
        System.out.println(element2.getAttribute("id"));
    }


}
