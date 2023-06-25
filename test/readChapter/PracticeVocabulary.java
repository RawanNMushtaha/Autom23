package readChapter;


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
import static driver.ClientDriver.driver;
import driver.Watcher;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.touch.offset.PointOption;
import static io.appium.java_client.touch.offset.PointOption.point;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.id;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import signin.SignUp;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PracticeVocabulary {

    String testCaseId;
    String testRunId = "62";//Signin -Automated test cases
    @Rule
    public Watcher watcher = new Watcher(ClientDriver.driver);

    @BeforeClass
    public static void delay() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("SignUpLayout Delay 10 seconds applied ");
    }

    //Comprehension quetion
    @Test
    public void test1_setGoal() {
        
        String goalXpath="//android.widget.Button[@content-desc=\"Set Goal\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(goalXpath));
        ClientDriver.base.getElementByXpath(goalXpath).click();
        
        String allowReminderXpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Switch";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(allowReminderXpath));
        ClientDriver.base.getElementByXpath(allowReminderXpath).click();
         
        String selectGoalXpath="//android.widget.Button[@content-desc=\"Set Goal\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(selectGoalXpath));
        ClientDriver.base.getElementByXpath(selectGoalXpath).click();
      
    }
    

    @Test
       public void test2_checkTestResult() {
      //Check test result
         String expectedResultXpath = "//android.view.View[@content-desc=\"Chapter1 Completed\"]";
         ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(expectedResultXpath));
        String expectedResult = ClientDriver.base.getElementByXpath(expectedResultXpath).getTagName();
        System.out.println("-----------------" + expectedResult);
        String actualResult = "Chapter1 Completed";
        System.out.println("*****************" + actualResult);
        assertEquals(expectedResult, actualResult);
}
}
