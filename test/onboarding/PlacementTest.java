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
public class PlacementTest {

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
    //Placement Test
    public void test1_Placement_Test() {
        String startPalcementTestXpath = "//android.widget.Button[@content-desc=\"Start from level 1\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(startPalcementTestXpath));
        ClientDriver.base.getElementByXpath(startPalcementTestXpath).click();

    }

   // @Test
    public void test2_Answer_Questions() {
        for (int i = 0; i <= 9; i++) {           
            String select = "//android.view.View[@index='0']";   
            ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(select));
            ClientDriver.base.getElementByXpath(select).click();
            String x = ClientDriver.base.getElementByXpath(select).getTagName();
            System.out.println("placement test "+x);


           String nextQuestionXpath = "//android.widget.Button[@content-desc=\"Next Question\"]";
            ClientDriver.base.getElementByXpath(nextQuestionXpath).click();
        }
         
    }

    //  Finish answer question
   // @Test
    public void test3_Show_Result() {
        	
        String showResultXpath = "//android.widget.Button[@content-desc=\"Show Results\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(showResultXpath));
        ClientDriver.base.getElementByXpath(showResultXpath).click();
        
        String continueXpath = "(//android.widget.Button[@content-desc=\"Continue\"])";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(continueXpath));
        ClientDriver.base.getElementByXpath(continueXpath).click();

    }

   // @Test
    public void test4_checkTestResult() {
        //Check test result
        String expectedResultXpath = "//android.view.View[@content-desc=\"Restore Purchases\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(expectedResultXpath));
        String expectedResultTest = ClientDriver.base.getElementByXpath(expectedResultXpath).getTagName();
        System.out.println("-----------------" + expectedResultTest + "----------------");
        String actualResultTest = "Restore Purchases";
        System.out.println("*****************" + actualResultTest + "****************");
        assertEquals(expectedResultTest, actualResultTest);
    }
}
