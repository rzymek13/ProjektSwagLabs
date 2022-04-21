import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseDriver {

    @Test
    public static void addToCart() {
        driver.get("https://www.saucedemo.com/inventory.html");
        WebElement addToCartBtn = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        addToCartBtn.click();

        WebElement cartBtn = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        cartBtn.click();
    }
}
