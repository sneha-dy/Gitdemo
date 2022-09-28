package locatorsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicxpath {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehadshetty\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F&aff=27964");

        //different ways dynamic xpath for username textboz
        driver.findElement(By.name("//input[@name='log']"));
        driver.findElement(By.id("user_login"));
        driver.findElement(By.id("//input[@type='text']"));
        driver.findElement(By.id("//input[@class='input'][@name='log']"));

    }
}














