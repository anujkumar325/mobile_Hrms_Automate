import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pages.Login;

import java.time.Duration;
import java.util.Properties;

public class Log_in_Page extends BaseTest {

    configLoader configLoader= new configLoader();
    Properties prop = configLoader.init_prop();

    //Login login = new Login(driver);
    @Test
    public void login_emp()  throws InterruptedException {

        String emp_code= prop.getProperty("emp_code");

      //  String emp_code = configLoader.init_prop().getProperty("emp")
        Login login = new Login(driver) ;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



        login.setUser_name(emp_code);
        login.setUser_Password("1234567");
        login.click_login();
        Thread.sleep(5000);

    }

}
