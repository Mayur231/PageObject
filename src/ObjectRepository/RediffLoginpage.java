package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

    WebDriver driver;

    public RediffLoginpage(WebDriver driver)
    {
        this.driver=driver;
    }
    By username=By.xpath("//*[@id='login1']");

    By password=By.name("passwd");

    By proceed=By.name("proceed");

    By homepage=By.linkText("rediff.com");

    public WebElement Emailid()
    {
        return driver.findElement(username);
    }
    public WebElement Password()
    {
        return driver.findElement(password);
    }
    public WebElement Signin()
    {
        return driver.findElement(proceed);
    }
    public WebElement homepage()
    {
        return driver.findElement(homepage);
    }


}
