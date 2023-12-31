package signin;


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
import driver.WebBaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class multipleChoice {

    String testCaseId;
    String testRunId = "62";//Signin -Automated test cases
    @Rule
    public Watcher watcher = new Watcher(ClientDriver.driver);

    @BeforeClass
    public static void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("SignUpLayout Delay 1 second applied ");
    }

    //login button
    @Test
    public void test1_closeTip() {
        //My vocabulary tab       
        String vocabularyTabXpath = "//android.widget.ImageView[@index='1']";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(vocabularyTabXpath));
        ClientDriver.base.getElementByXpath(vocabularyTabXpath).click();
                
    }

    @Test
    public void test2_practice() {
        //Click to practice button
        String practiceXpath = "//android.widget.Button[@content-desc=\"Practice\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(practiceXpath));
        ClientDriver.base.getElementByXpath(practiceXpath).click();

    }
     @Test
    public void test3_FlashCard() {
        //Click to flash Card button
        String loginXpath2 = "//android.widget.ImageView[@content-desc=\"Multiple choice\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(loginXpath2));
        ClientDriver.base.getElementByXpath(loginXpath2).click();

    }
    @Test
    public void test4_startFlashCard() {
        //Click to show answer
        String selectAnswerXpath = "//android.view.View[@index='0']";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(selectAnswerXpath));
        ClientDriver.base.getElementByXpath(selectAnswerXpath).click();
             String answer = ClientDriver.base.getElementByXpath(selectAnswerXpath).getTagName();

        System.out.println("//////////////////////////"+ answer);
        
        //Click to learn button
        String checkAnswerXpath = "//android.widget.Button[@content-desc=\"Check answer\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(checkAnswerXpath));
        ClientDriver.base.getElementByXpath(checkAnswerXpath).click();
        
        //Click to show answer
        String nextAnswerXpath = "//android.widget.Button[@content-desc=\"Next\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(nextAnswerXpath));
        ClientDriver.base.getElementByXpath(nextAnswerXpath).click();
        
        //Click to know button
        String learnXpath = "//android.widget.Button[@content-desc=\"I know\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(learnXpath));
        ClientDriver.base.getElementByXpath(learnXpath).click();
        
        //Click to continue later
        String closeXpath = "//android.view.View[@content-desc=\"Continue later\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(closeXpath));
        ClientDriver.base.getElementByXpath(closeXpath).click();
        
    }
     @Test
    public void test5_startFlashCard() {
        //move words to know from congratulation screen
         String closeXpath = "//android.widget.Button[@content-desc=\"Move all to know\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(closeXpath));
        ClientDriver.base.getElementByXpath(closeXpath).click();
    }

     // @Test
    public void test6_result_flashCard() {

        //vocabulary tab
        String learningTabXpath = "//android.view.View[@index='1']";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(learningTabXpath));
        String learningEpected = ClientDriver.base.getElementByXpath(learningTabXpath).getTagName();
        System.out.println("*****Learning Tab 1 of 2*********" + learningEpected);
        String learningActual = "Learning Tab 1 of 2";
        System.out.println("--------Learning Tab 1 of 2-----------" + learningActual);
        assertEquals(learningEpected, learningActual);
    }

}
