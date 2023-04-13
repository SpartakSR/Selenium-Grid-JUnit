import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Platform;
 
@TestInstance(Lifecycle.PER_CLASS)
public class TusurTest {
private WebDriver driver;
String baseURL, remoteURL;
protected ThreadLocal<RemoteWebDriver> threadDriver = null;
 
@BeforeAll
public void setUp() throws MalformedURLException {
    baseURL="https://tusur.ru/ru";
    remoteURL = "http://localhost:4444/wd/hub";
        }

@Test
 public void test1() throws Throwable {
    System.out.println("Executing on FireFox");
    DesiredCapabilities capability= new DesiredCapabilities();
    capability.setBrowserName("firefox");
    capability.setPlatform(Platform.WIN10);
    driver=new RemoteWebDriver(new URL(remoteURL),capability);
    driver.get(baseURL);
    String appTitle = driver.getTitle();
    Assert.assertEquals("Томский государственный университет систем управления и радиоэлектроники",appTitle);
}
@Test
public void test2() throws Throwable {
    System.out.println("Executing on CHROME");
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setBrowserName("chrome");
    cap.setPlatform(Platform.WIN10);
    driver = new RemoteWebDriver(new URL(remoteURL), cap); 
    driver.get(baseURL);
    String appTitle = driver.getTitle();
    Assert.assertEquals("Томский государственный университет систем управления и радиоэлектроники",appTitle);
}

@AfterEach
public void tearDown() {
 driver.quit();
}

}