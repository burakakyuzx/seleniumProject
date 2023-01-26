package demoqaCom;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeForm {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement hobbiesSportsCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
        Boolean isEnabled = hobbiesSportsCheckBox.isEnabled();

        WebElement hobbiesCheckbox2 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));



        System.out.println("isEnabled : " + isEnabled);
        if (isEnabled) {
            try {
                hobbiesSportsCheckBox.click();
                System.out.println("With try");

            } catch (ElementClickInterceptedException e) {
                hobbiesCheckbox2.click();
                System.out.println("With catch");
            }
        }
        Boolean isSelected = hobbiesSportsCheckBox.isSelected();
        System.out.println("isSelected : " + isSelected);


    }
}
