package mailTravelStepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import mailTravelPages.*;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

public class mailTravelSteps  {
    WebDriver driver;
    Properties p;
    String br;
    HomePage hmPage;
    TravelPage travelPage;
    NowBookingPage nowBookingPage;

    @Before
    public void setup() throws IOException
    {


        //Reading config.properties (for browser)
        FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
        p=new Properties();
        p.load(file);
        br=p.getProperty("browser");

        if(br.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (br.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (br.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Scenario status ======>"+scenario.getStatus());
        if(scenario.isFailed()) {

            TakesScreenshot ts=(TakesScreenshot) driver;
            byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png",scenario.getName());

        }
        driver.quit();
    }

    @Given("I am on the Mail Travel {string} website")
    public void i_am_on_the_Mail_Travel_website(String url) {
       driver.get(url);
    }

    @When("I accept all cookies")
    public void i_accept_all_cookies() throws InterruptedException {
    hmPage = new HomePage(driver);
    hmPage.setBtnAcceptCookies();
    }

    @When("I search for {string} in the search bar")
    public void i_search_for_in_the_search_bar(String textforSearch) throws InterruptedException{
       hmPage.setSearchText(textforSearch);
           }

    @And("I click on BOOK ONLINE button")
    public void iClickOnBOOKONLINEButton() throws InterruptedException{
        travelPage = new TravelPage(driver);
        travelPage.clickonBookOnline();
    }

    @When("I select the next available date for {int} adults")
    public void i_select_the_next_available_date_for_adults(Integer index) throws InterruptedException {
        nowBookingPage = new NowBookingPage(driver);
        nowBookingPage.selectAdultPassenger(index);
    }

    @When("I make note of the departure airport")
    public void i_make_note_of_the_departure_airport() {
        travelPage.captureDepatureairpotText();
    }

    @When("I validate the price")
    public void i_validate_the_price_for_adults() throws InterruptedException {
      nowBookingPage.PriceValidation();
    }

    @Then("I should not see the Please select your departure date text")
    public void i_should_not_see_the_text() {
        travelPage.isnotvisibleText();
    }

    @Then("I select the number required as {int} for two people in the Accommodation section")
    public void i_select_the_number_required_as_for_people_in_the_Accommodation_section(Integer int1) {
        nowBookingPage.getaccomidation(int1);
    }


    @Then("I should verify the Confirm Details + Book page")
    public void i_should_verify_the_Confirm_Details_Book_page() {
       nowBookingPage.isConfirmDetailsBookHeadingPresent();
    }

    @Then("I verify the Book Now button is enabled.")
    public void i_verify_the_Book_Now_button_is_enabled() {
     nowBookingPage.isBookNowButtonEnabled();
    }

    @And("Verify the title of the  page is  {string}")
    public void verifyTheTitleOfThePageIs(String expectedTitle) {
       String actual= driver.getTitle();
       Assert.assertEquals(actual,expectedTitle);
    }

    @And("I click on CONTINUE button")
    public void iClickOnCONTINUEButton() {
        nowBookingPage.clickLeadContactContinue();
    }

    @Then("I should see the Please select your departure date text")
    public void iShouldSeeThePleaseSelectYourDepartureDateText() {
        travelPage.geterrorText();
    }

    @Then("I click on dates radio button")
    public void iClickOnDatesRadioButton() {
        travelPage.selectDate();
    }

    @And("I click on BOOK ONLINE button at bottom")
    public void iClickOnBOOKONLINEButtonAtBottom() throws InterruptedException {
        travelPage.clickonBookOnline2();
    }

    @And("I expand the {string} section")
    public void iExpandTheSection(String navigation) {
        nowBookingPage.navigationTo(navigation);
    }

    @And("I verify the details populated are valid adults {string}, departure airport {string} and departure date {string}")
    public void iVerifyTheDetailsPopulatedAreValidAdultsDepartureAirportAndDepartureDate(String adults, String departairport, String departDate) {
        nowBookingPage.verifydetailsOfDDPax(adults,departairport,departDate);
    }

    @And("I click on SELECT YOUR ROOMS AND CONTINUE")
    public void iClickOnSELECTYOURROOMSANDCONTINUE() {
    nowBookingPage.clickonSelectRoomsAndContinue();
    }

    @And("I fill the Passenger details for first Adult as {string},firstName as {string},lastName as {string},DOB as {int} {int} {int}")
    public void iFillThePassengerDetailsForFirstAdultAsFirstNameAsLastNameAsDOBAs(String title, String fname, String lname, int day, int month, int year) {
        nowBookingPage.fillAdult1details(title,fname,lname,day,month,year);
    }

    @And("I fill the Passenger details for second Adult as {string},firstName as {string},lastName as {string},DOB as {int} {int} {int}")
    public void iFillThePassengerDetailsForSecondAdultAsFirstNameAsLastNameAsDOBAs(String tit, String firname, String lasname, int day, int month, int year) {
        nowBookingPage.fillAdult2details(tit,firname,lasname,day,month,year);
    }

    @And("I fill the Contact details as {string},{string},{string},{string},{string},{string},{string}")
    public void iFillTheContactDetails(String contactnum,String mobNum,String emailID,String addrs1,String adrs2,String city,String postcd) {
        nowBookingPage.setLeadContactDetails(contactnum,mobNum,emailID,addrs1,adrs2,city,postcd);
    }

    @And("I select country as {string}")
    public void iSelectCountryAs(String country) {
        nowBookingPage.selectCountry(country);
    }

    @And("I Select hear about us from {string}")
    public void iSelectHearAboutUsFrom(String hearabout) {
        nowBookingPage.selecthearAbout(hearabout);
    }
}


