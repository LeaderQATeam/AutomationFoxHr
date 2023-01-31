package TestCases;

import Heplers.JsonReader;
import Pages.LoginPage;
import Pages.PunchinPunchoutPage;
import com.google.gson.JsonObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PunchinPunchoutTest extends BaseTest {

    private PunchinPunchoutPage page_Punchin;


    private JsonObject internalInfo;
    private LoginPage loginpage;

    @BeforeClass
    public void init()
    {    JsonReader jsonReader = new JsonReader();
        page_Punchin = new PunchinPunchoutPage(webDriver);
    }



    @BeforeTest

    public void login(){

        //open application URL
        webDriver.get(System.getProperty("target.homepage"));
        // initialize an object from login page
        loginpage = new LoginPage(webDriver);
        // login with username and password provided from test.properties file
        loginpage.Login(System.getProperty("account.username"),
                System.getProperty("account.password"));
        System.out.println("LoginTest Tc_001 Passed");

    }

    @Test(description = "Punchin & Punchout")
    public void punchin_punchout() {
        //  page_Punchin =new PunchinPunchoutPage(driver);
        Boolean isPunchin = page_Punchin.punchinButton.isDisplayed();
        System.out.println("******"  +isPunchin);
        if(isPunchin){
            page_Punchin.clickPunchin();
            System.out.println("Punched in    Successfully");
            page_Punchin.clickPunchout();
            System.out.println("Punched out   Successfully");
        }
        else {
            System.out.println("Punchin    Failed");
        }

    }





}
