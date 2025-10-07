package pages;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

public class Login extends BasePage {



        @AndroidFindBy(id = "com.nkcerp.unifiednyggs:id/et_user_id")
    public WebElement user_name;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement user_Password;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Log In']")
    private WebElement login;

    public Login(AndroidDriver driver) {
        super(driver);
    }


    public void setUser_name(String user)
    {
        user_name.sendKeys(user);

    }


    public  void setUser_Password(String password)
    {
        user_Password.sendKeys(password);

    }

    public void click_login()
    {
        login.click();
    }



}
