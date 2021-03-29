package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffhomepage {

    WebDriver driver;

    public Rediffhomepage(WebDriver driver)
    {
        this.driver = driver;
    }
    By Search=By.id("srchword");
    By Submit=By.xpath("//*[@type='submit']");

    public WebElement Search()
    {
        return driver.findElement(Search);
    }
    public WebElement Submit()
    {
        return driver.findElement(Submit);
    }





}
