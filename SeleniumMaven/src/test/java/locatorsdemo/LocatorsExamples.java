package locatorsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehadshetty\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

       /* //id locator
        WebElement uname=driver.findElement(By.id("email"));
        uname.sendKeys("dysneha@gmail.com");

        //name locator
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("-/:;()");

        //Classname
        driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();*/

        //Linktext
        driver.findElement(By.linkText("Forgotten password?")).click();

        //partial link text
        driver.findElement(By.partialLinkText("Forgotten")).click();

        //tagName-
       System.out.println("driver.findElement(By.tagName(\"img\")).getSize()");;



    }
}
