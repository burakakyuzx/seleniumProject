package demoqaCom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {
    public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

      WebDriver driver = new ChromeDriver();

      driver.get("https://demoqa.com/radio-button");

        WebElement yesCheckBoxRadio = driver.findElement(By.cssSelector("label[for='yesRadio']"));

        Boolean yesCheckBoxRadioIsEnable = yesCheckBoxRadio.isEnabled();

        if(yesCheckBoxRadioIsEnable)  {
            yesCheckBoxRadio.click();
            System.out.println("yesCheckBoxRadioIsEnable : " + yesCheckBoxRadioIsEnable);
        }
        else {
            System.out.println("yesCheckBoxRadioIsEnable : " + yesCheckBoxRadioIsEnable);
        }

        WebElement yesCheckBoxTitle = driver.findElement(By.cssSelector("p.mt-3"));

        System.out.println(yesCheckBoxTitle.getText());

        WebElement yesCheckBoxClicked = driver.findElement(By.id("yesRadio"));

        Boolean yesCheckBoxClickedIsSelected = yesCheckBoxClicked.isSelected();
        System.out.println("yesCheckBoxClickedIsSelected: " + yesCheckBoxClickedIsSelected);


        WebElement noRadioCheckBox = driver.findElement(By.id("noRadio"));

        Boolean noRadioCheckBoxIsEnable = noRadioCheckBox.isEnabled();

        if (noRadioCheckBoxIsEnable) {
            noRadioCheckBox.click();
            System.out.println("NoRadioChecked");
        }
        else {
            System.out.println("noRadioCheckBox : " + noRadioCheckBoxIsEnable);
        }

        Boolean noRadioCheckBoxIsSelected =  noRadioCheckBox.isSelected();

        System.out.println("noRadioCheckBoxIsSelected : " + noRadioCheckBoxIsSelected);

    }
}
