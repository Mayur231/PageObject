package Testcases;

import ObjectRepository.RediffloginpagePOF;
import ObjectRepository.Rediffhomepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginapplication1 {

    @Test
    public void Login()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffloginpagePOF rd=new RediffloginpagePOF(driver);
        rd.Emailid().sendKeys("mayu@gmail.com");
        rd.Password().sendKeys("mayu112");
        rd.Signin().click();
        rd.homepage().click();
        Rediffhomepage rh=new Rediffhomepage(driver);
        rh.Search().sendKeys("lenovo laptops");
        rh.Submit().click();
    }

}

