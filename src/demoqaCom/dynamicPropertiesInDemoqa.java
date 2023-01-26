package demoqaCom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicPropertiesInDemoqa {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/dynamic-properties");

        WebElement textElement = driver.findElement(By.xpath("//div/p"));
        String text = textElement.getText();
        System.out.println(text);

        WebElement firstButton = driver.findElement(By.id("enableAfter"));

    }
}
