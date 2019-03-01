import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by max on 27.10.15.
 */
public class AsService {


    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities capa = new DesiredCapabilities();
        capa.setCapability( "platformName", "Android");
        capa.setCapability( "deviceName", "dfhjkk");
        capa.setCapability( "appPackage", "ua.slando");
        capa.setCapability( "appActivity", "pl.tablica2.app.startup.activity.StartupActivity");
        capa.setCapability( "udid", "e0ab7515");

        AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capa);



        driver.findElement(By.id("ua.slando:id/dismissButton")).click();

        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        driver.findElement(By.id("ua.slando:id/search_src_text")).sendKeys("одежда");

        ((WebElement) driver.findElements(By.id("ua.slando:id/photo")).get(0)).click();
    }
}
