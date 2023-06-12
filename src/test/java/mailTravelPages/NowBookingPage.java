package mailTravelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class NowBookingPage extends CommonMethods {
    public NowBookingPage(WebDriver driver) {
        super(driver);
    }

    //WebElements
    @FindBy(xpath = "(//span[@dir='ltr'])[1]")
    private WebElement txtdepartpoint;

    @FindBy(xpath = "//span[@class='ibecurr']")
    private WebElement totalPrice;

    @FindBy(xpath = "//div[@class='nbf_fancy_nbf_tpl_pms_continue nbf_fg_pms_button_text ']")
    private WebElement btnContinue;

    @FindBy(xpath = "//button[@class='nbf_button nbf_tpl_pms_button']")
    private WebElement btnLeadContactContinue;

    @FindBy(xpath = "//div[@id='paxDepDateForm-container']")
    private WebElement navbarDateDepPax;

    @FindBy(id = "transportInfo")
    private WebElement navbartransportInfo;

    @FindBy(id = "accommodationSelection")
    private WebElement navbaraccomodation;

    @FindBy(id = "extrasSelection")
    private WebElement navbarExtraSelection;

    @FindBy(id = "paxSelection")
    private WebElement navbarPaxSelection;

    @FindBy(id = "paymentInfo")
    private WebElement navbarpaymentInfo;

    @FindBy(xpath = "//div[@class='nbf_tpl_pms_bf_passenger_number unit size1of2 lastUnit']")
    private WebElement noOfAdults;

    @FindBy(xpath = "//span[@dir='ltr']")
    private WebElement departureAirport;

    @FindBy(xpath = "//div[@class='nbf_tpl_pms_bf_departuredate']")
    private WebElement departuredtae;

    @FindBy(xpath = "//button[@class='nbf_button nbf_tpl_pms_book_button']")
    private WebElement btnRoomsAndContinue;

    @FindBy(id = "pax-a-first-1")
    private WebElement txtA1FirstName;

    @FindBy(id = "pax-a-last-1")
    private WebElement txtA1LastNm;

    @FindBy(id = "pax-a-first-2")
    private WebElement txtA2FirstName;

    @FindBy(id = "pax-a-last-2")
    private WebElement txtA2LastName;

    @FindBy(id = "contact-name")
    private WebElement leadtxtContactName;

    @FindBy(id = "contact-mobile")
    private WebElement leadtxtContactMobile;

    @FindBy(id = "contact-email")
    private WebElement leadtxtContactEmail;

    @FindBy(id = "contact-address1")
    private WebElement leadtxtContactAddress1;

    @FindBy(id = "contact-address2")
    private WebElement leadtxtContactAddress2;

    @FindBy(id = "contact-city")
    private WebElement leadtxtContactCity;

    @FindBy(id = "contact-postcode")
    private WebElement leadtxtContactPostcode;

    @FindBy(xpath = "//h1[@class='nbf_fancyimg_payment_pageheader']")
    private WebElement confirmDetailsBookHeadingElement;

    @FindBy(id = "nbf_booknow_button")
    private WebElement bookNowButtonElement;


    public void selectAdultPassenger(int value) throws InterruptedException {
        scrollIntoView(driver.findElement(By.xpath("//select[@name='numAdults']")));
        Thread.sleep(3000);
        selectValuefromDropdownviaindex(By.xpath("//select[@name='numAdults']"), value);
    }

    public void selectChildrenPassenger(int value1) {
        selectValuefromDropdownviaindex(By.xpath("//select[@name='numChildren']"), value1);
    }

    public String getTextDepartPoint() {
        String textofDepartPoint = txtdepartpoint.getText();
        return textofDepartPoint;
    }

    public String PriceValidation() throws InterruptedException {
        Thread.sleep(3000);
        scrollIntoView(totalPrice);
        String price = totalPrice.getText();
        return price;
    }

    public void clickContinue() {
        btnContinue.click();
    }

    public void getAlertText() {
        getAlertText();
    }

    public void getaccomidation(int noofrooms) {
        selectValuefromDropdownviaindex(By.xpath("//select[@id='room-1859919-numselect']"), noofrooms);
    }

    public void navigationTo(String navbarname) {
        if (navbarname.equalsIgnoreCase("Date,Departure & Passengers")) {
            clickButton(navbarDateDepPax);
        } else if (navbarname.equalsIgnoreCase("Transport")) {
            clickButton(navbartransportInfo);
        } else if (navbarname.equalsIgnoreCase("Accommodation")) {
            clickButton(navbaraccomodation);
        } else if (navbarname.equalsIgnoreCase("Extras")) {
            clickButton(navbarExtraSelection);
        } else if (navbarname.equalsIgnoreCase("Passenger Details")) {
            clickButton(navbarPaxSelection);
        } else if (navbarname.equalsIgnoreCase("Payment")) {
            clickButton(navbarpaymentInfo);
        }

    }

    public void verifydetailsOfDDPax(String adults, String departureport, String departureDate) {
        // Verify that the details are valid
        if (noOfAdults.getText().equals(adults) && departureAirport.getText().equals(departureport) && departuredtae.getText().equals(departureDate)) {
            System.out.println("Details are valid");
        } else {
            System.out.println("Details are not valid");
        }
    }

    public void clickonSelectRoomsAndContinue() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        clickButton(btnRoomsAndContinue);
    }

    public void fillAdult1details(String passtitle1, String firstNm, String lastNm, int date, int month, int year) {
        selectValuefromDropdownviaValue(By.id("pax-a-title-1"), passtitle1);
        enterText(txtA1FirstName, firstNm);
        enterText(txtA1LastNm, lastNm);
        selectValuefromDropdownviaindex(By.id("pax-a-dobd-1"), date);
        selectValuefromDropdownviaindex(By.id("pax-a-dobm-1"), month);
        selectValuefromDropdownviaindex(By.id("pax-a-doby-1"), year);
    }

    public void fillAdult2details(String passtitle2, String firstNm2, String lastNm2, int date2, int month2, int year2) {
        selectValuefromDropdownviaValue(By.id("pax-a-title-2"), passtitle2);
        enterText(txtA2FirstName, firstNm2);
        enterText(txtA2LastName, lastNm2);
        selectValuefromDropdownviaindex(By.id("pax-a-dobd-2"), date2);
        selectValuefromDropdownviaindex(By.id("pax-a-dobm-2"), month2);
        selectValuefromDropdownviaindex(By.id("pax-a-doby-2"), year2);
    }

    public void setLeadContactDetails(String ConatctNm, String mobilenum, String email, String addrss1, String addrss2, String city, String postcode) {
        enterText(leadtxtContactName, ConatctNm);
        enterText(leadtxtContactMobile, mobilenum);
        enterText(leadtxtContactEmail, email);
        enterText(leadtxtContactAddress1, addrss1);
        enterText(leadtxtContactAddress2, addrss2);
        enterText(leadtxtContactCity, city);
        enterText(leadtxtContactPostcode, city);
    }

    public void selectCountry(String country) {
        selectValuefromDropdownviaValue(By.id("contact-country"), country);
    }

    public void selecthearAbout(String hearabout) {
        selectValuefromDropdownviaValue(By.id("contact-hearabout"), hearabout);
    }

    public void clickLeadContactContinue() {
        clickButton(btnLeadContactContinue);
    }

    public boolean isConfirmDetailsBookHeadingPresent() {
        // Check if the element is displayed
        if (confirmDetailsBookHeadingElement.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBookNowButtonEnabled() {
        if (bookNowButtonElement.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

}