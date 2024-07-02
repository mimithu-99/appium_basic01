package AppiumBasics01;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;



public class AppiumBasicsP1 {
    AndroidDriver driver;

    public void AppiumTest()throws MalformedURLException, URISyntaxException
    {

        // AndroidDriver, IOSDriver
        // Appium code --> Appium server -->  Mobile

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("MyDevice"); // emulator
        options.setApp("D://Java_Practice//AppiumProjectOne//src//test//java//Resources//ApiDemos-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URI("http//127.0.0.1:4723").toURL(),options);

       // driver = new AndroidDriver(new URI("http//127.0.0.1:4723").toURL(),options);


    }
}
//D:\Java_Practice\AppiumProjectOne\src\test\java\Resources\ApiDemos-debug.apk