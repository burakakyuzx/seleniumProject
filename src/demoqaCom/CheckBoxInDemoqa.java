package demoqaCom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxInDemoqa {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        String homeCheckBoxCssValue = "label[for='tree-node-home'] span.rct-checkbox svg";

        WebElement homeCheckBox = driver.findElement(By.cssSelector(homeCheckBoxCssValue));
        homeCheckBox.click();

        homeCheckBox=  driver.findElement(By.cssSelector(homeCheckBoxCssValue));

        String homeCheckBoxClassName = homeCheckBox.getAttribute("class");



    if (homeCheckBoxClassName.contains("check"))  {
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }












    }
}
