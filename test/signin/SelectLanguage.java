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
import driver.Watcher;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SelectLanguage {

    String testCaseId;
    String testRunId = "62";//Signin -Automated test cases
    @Rule
    public Watcher watcher = new Watcher(ClientDriver.driver);

    @BeforeClass
    public static void delay() {
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("SignUpLayout Delay 10 seconds applied ");
    }

    @Test
    //Select language
    public void test_Language_welcome() {
//       
ClientDriver.base.Wait(5);
        String selectLanguageXpath = "//android.view.View[@content-desc=\"English\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(selectLanguageXpath));
        ClientDriver.base.getElementByXpath(selectLanguageXpath).click();
        
        //Selec app language
        String continueXpath = "//android.widget.Button[@content-desc=\"Continue\"]";
        ClientDriver.base.waitForElementToBeVisibleBy(By.xpath(continueXpath));
        ClientDriver.base.getElementByXpath(continueXpath).click();              
//       }
    }
}