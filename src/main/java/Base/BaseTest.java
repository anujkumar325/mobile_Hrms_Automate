package Base;


import com.google.common.cache.CacheLoader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class BaseTest {

    public static AndroidDriver driver;
    //public  AndroidDriverLocalService service;


    @BeforeClass
    public void AppiumTest() throws URISyntaxException, MalformedURLException, InterruptedException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 9a");
        //options.setDeviceName("Medium Phone");
        //options.setApp("/home/anuj/IdeaProjects/mobile_app/src/main/resources/APKFiles 1/resources/ApiDemos-debug.apk");
        //options.setApp("/home/anuj/IdeaProjects/mobile_app/src/main/resources/unified-Hrms1.apk");
        options.setApp("/home/anuj/IdeaProjects/mobile_Hrms_Automate/src/main/resources/unified-Hrms1.apk");

        Thread.sleep(10000);
        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        // AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723/wd/hub"), options);

        //Xpath, id , accessibilityId, classname, androidUIAutomator
        //driver.findElement(AppiumBy.accessibilityId("Preference")).click();


    }





    /*@AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();


        }

    }*/
}
