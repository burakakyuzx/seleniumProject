package demoqaCom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsInDemoqa {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        WebElement message = driver.findElement(By.id("doubleClickMessage"));
        String messageText = message.getText();
        System.out.println(messageText);

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickButton).perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        String message2 = rightClickMessage.getText();
        System.out.println(message2);

        WebElement dynamicClickButton = driver.findElement(By.xpath("//div/button[starts-with(text() , 'Click Me')]"));
        dynamicClickButton.click();

        WebElement dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage"));
        String message3 = dynamicClickMessage.getText();
        System.out.println(message3);
    }
}
