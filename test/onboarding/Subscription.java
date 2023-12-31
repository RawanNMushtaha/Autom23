package onboarding;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
// Generated by Selenium IDE
import driver.ClientDriver;
import driver.Watcher;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import signin.SignUp;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Subscription {

    String testCaseId;
    String testRunId = "62";//Signin -Automated test cases
    @Rule
    public Watcher watcher = new Watcher(ClientDriver.driver);

    @BeforeClass
    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("SignUpLayout Delay 10 seconds applied ");
    }

    @Test
    //Select TTS voice
    public void test1_subsribe() {

        //Click to close button
        String closeXpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.view.View[1]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(closeXpath));
        ClientDriver.base.getElementByXpath(closeXpath).click();
        
        //Unlock 3 pro days
        String free3xxDaysXpath="//android.widget.Button[@content-desc=\"Unlock 3 Pro days for free\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(free3xxDaysXpath));
        ClientDriver.base.getElementByXpath(free3xxDaysXpath).click();
        
        //Congratulation pop-up
        String startLearningXpath="//android.view.View[@content-desc=\"Start learning\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(startLearningXpath));
        ClientDriver.base.getElementByXpath(startLearningXpath).click();    
        
    }

    //@Test
    public void test2_checkTestResult() {
        //Check test result
        String expectedResultXpath = "//android.view.View[@content-desc=\"Level 1 In-progress\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(expectedResultXpath));
        String expectedResult = ClientDriver.base.getElementByXpath(expectedResultXpath).getTagName();
        System.out.println("-----------------" + expectedResult);
        String actualResult = "Level 1 In-progress";
        System.out.println("*****************" + actualResult);
        assertEquals(expectedResult, actualResult);

    }
}
