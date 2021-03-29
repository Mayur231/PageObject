package ObjectRepository;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffloginpagePOF {

    WebDriver driver;

    public RediffloginpagePOF(WebDriver driver) {

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    /*By username=By.xpath("//*[@id='login1']");
    By password=By.name("passwd");
    By proceed=By.name("proceed");
    By homepage=By.linkText("rediff.com");*/

    @FindBy(xpath ="//*[@id='login1']" )
    WebElement username;

    @FindBy(name = "passwd")
    WebElement password;

    @FindBy(name = "proceed")
    WebElement proceed;

    @FindBy(linkText ="rediff.com" )
    WebElement homepage;

    public WebElement Emailid()
    {
        return username;
    }
    public WebElement Password()
    {
        return password;
    }
    public WebElement Signin()
    {
        return proceed;
    }
    public WebElement homepage()
    {
        return homepage;
    }


}
