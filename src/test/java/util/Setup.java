package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.cache.annotation.CacheAnnotationParser;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {

    protected static AppiumDriver driver;
    protected static final String APP_APK ="\\apkfolder\\UAMPMusicPlayerApp.apk";
    private static final String  PACKAGE = "com.instantappsample.uamp";
    private static final String ANDROID_PACKAGE ="com.example.android.uamp";
    protected static final String  APP_ID = PACKAGE+":id/";
    private static final String PATH = System.getProperty("user.dir");
    protected static final String DEVICE = "LCL7N18428001913 ";

    @BeforeClass
    public static void Setup()throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName",DEVICE);
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage",PACKAGE);
        capabilities.setCapability("appActivity",ANDROID_PACKAGE+".ui.MusicPlayerActivity");
        //capabilities.setCapability("noReset",true);
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("app",new File(PATH+APP_APK));

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

    }
}
