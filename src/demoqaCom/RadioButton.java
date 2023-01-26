package demoqaCom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");

        WebElement yesCheckBoxLabel = driver.findElement(By.cssSelector("label[for='yesRadio']"));

        Boolean isEnabledYesBox = yesCheckBoxLabel.isEnabled();
        System.out.println("isEnabled : " + isEnabledYesBox);

        if (isEnabledYesBox) {
            yesCheckBoxLabel.click();
            System.out.println("yes button clicked");
        }

        WebElement yesCheckBox = driver.findElement(By.id("yesRadio"));

        Boolean isSelected = yesCheckBox.isSelected();
        System.out.println("isSelected : " +isSelected);

        WebElement outputCheckBox = driver.findElement(By.cssSelector("p.mt-3"));
        System.out.println(outputCheckBox.getText());

        WebElement noRadioCheckBox = driver.findElement(By.id("noRadio"));

        Boolean isEnabledNoRadio = noRadioCheckBox.isEnabled();

        if (isEnabledNoRadio) {
            noRadioCheckBox.click();
            System.out.println("isEnabledNoRadio : " + isEnabledNoRadio);
        }
        else {
            System.out.println("isEnabledNoRadio : " + isEnabledNoRadio);
        }

        Boolean isSelectedNoRadio = noRadioCheckBox.isSelected();

        System.out.println("isSelectedNoRadio : " + isSelectedNoRadio);








    }
}
