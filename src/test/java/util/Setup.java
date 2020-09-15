package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.cache.annotation.CacheAnnotationParser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {

    private static final String  PACKAGE ="com.example.android.uamp";
    //private static final String ENVIRONMENT = "";

    protected static AppiumDriver driver;
    protected static final String APP_ID ="";
    protected static final String DEVICE = "LCL7N18428001913 ";

    @BeforeClass
    public static void Setup()throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName",DEVICE);
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage",PACKAGE);
        capabilities.setCapability("appActivity",PACKAGE + "ui.MusicPlayerActivity");
        capabilities.setCapability("noReset",true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        //driver.manage().timeouts().implicitlyWait(ge, TimeUnit.SECONDS);
    }
}
