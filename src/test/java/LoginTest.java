import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest extends BaseDriver {


    @Test
    public static void Login() {
        String userName = "standard_user";
        String password = "secret_sauce";
        String exceptedValue = "PRODUCTS";


        driver.get("https://www.saucedemo.com/");

        WebElement loginInput = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        loginInput.sendKeys(userName);

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordInput.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        loginBtn.click();

        WebElement actualValue = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String actualwrite = actualValue.getText();

        Assert.assertEquals(actualwrite,exceptedValue);



    }
}
