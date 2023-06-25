package driver;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import testrail.TestRailManager;
//import com.applitools.eyes.appium.Eyes;

/**
 *
 * @author Ibrahim
 */
public class ClientDriver {

    public static JavascriptExecutor javascriptExecutor;
    public static WebBaseTest base;
    public static TestRailManager testrail;
    // public static String testRunId;
    public static boolean testRailReport;
    static DesiredCapabilities dc = new DesiredCapabilities();
    private static final String reportDirectory = "reports";
    private static final String reportFormat = "xml";
    private static final String testName = "Untitled";
    public static AndroidDriver<AndroidElement> driver = null;
    private static WebDriverWait wait;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        System.out.println("InitiSetup Started ..");

//        dc.setCapability("reportDirectory", reportDirectory);
//        dc.setCapability("reportFormat", reportFormat);
//        dc.setCapability("testName", testName);
//        dc.setCapability(MobileCapabilityType.UDID, "emulator-5556");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "sa.app.iStoria.dev");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.ryanheise.audioservice.AudioServiceActivity");
        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
        driver.setLogLevel(Level.INFO);
        wait = new WebDriverWait(driver, 10);
        base = new WebBaseTest(driver, wait, javascriptExecutor);
        
//        // Initialize the eyes SDK and set your private API key.
//        Eyes eyes = new Eyes();
//        eyes.setApiKey("XWONyLhGsg1EP2s97qQJKf9LbsL4711053m0e3twSt5pvs110");
//
//        eyes.setForceFullPageScreenshot(true);
//
//        try {
//
//            // Start the test.
//            eyes.open(driver, "Contacts!", "My first Appium native Java test!");
//
//            // Visual validation.
//            eyes.checkWindow("Contact list!");
//
//            // End the test.
//            eyes.close();
//
//        } finally {
//
//            // Close the app.
//            driver.quit();
//
//            // If the test was aborted before eyes.close was called, ends the test as aborted.
//            eyes.abortIfNotClosed();
//    }
    }

    @Test
    public void start() {
        System.out.println(getClass().getName() + "Start function is started");
    }

}
