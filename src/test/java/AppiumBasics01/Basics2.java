package AppiumBasics01;

import io.appium.java_client.AppiumBy;
import org.junit.Test;

public class Basics2 extends AppiumBasicsP1  {
    @Test
    public void testApp(){
       driver.findElement(AppiumBy.accessibilityId(""));

    }
}
