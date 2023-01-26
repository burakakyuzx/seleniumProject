package demoqaCom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxInDemoqa {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        Thread.sleep(500);
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("burak"); // Tıklanmış olan bölgeye bilgileri yazmaya yarıyor "String" alabiliyor.

        Thread.sleep(500);
        WebElement email = driver.findElement(By.cssSelector(".mr-sm-2[id='userEmail']"));  // Css selector ile de elementler bulunabilir.
        email.click();
        email.sendKeys("burak@fakemail.com");

        Thread.sleep(500);
        WebElement currentAdress = driver.findElement(By.cssSelector(".form-control[placeHolder='Current Address']"));
        currentAdress.click();
        currentAdress.sendKeys("koseyi donunce sagda");

        Thread.sleep(500);
        WebElement permanentAddress = driver.findElement(By.cssSelector(".form-control[id='permanentAddress']"));
        permanentAddress.click();
        permanentAddress.sendKeys("Istanbul");

        Thread.sleep(500);
        WebElement button = driver.findElement(By.cssSelector(".btn-primary[id='submit']"));
        button.click();

        // catch
        Thread.sleep(500);
        WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
        String getName =  nameText.getText();
        System.out.println(getName);;

        Thread.sleep(500);
        WebElement emailText = driver.findElement(By.xpath("//div/p[@id='email']"));
        String getEmail = emailText.getText();
        System.out.println(getEmail);

        Thread.sleep(500);
        WebElement currentAddressText = driver.findElement(By.xpath("//div/p[@id='currentAddress']"));
        String getCurrentAdress = currentAddressText.getText();
        System.out.println(getCurrentAdress);

        Thread.sleep(500);
        WebElement permanentAddressText = driver.findElement(By.xpath("//div/p[@id='permanentAddress']"));
        String getPermanentAddress = permanentAddressText.getText();
        System.out.println(getPermanentAddress);



    }
}
