package mailTravelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class TravelPage extends CommonMethods{
    public TravelPage(WebDriver driver) {
        super(driver);
    }
    //WebElements
    @FindBy(xpath="//button[@name='enterbookingflow']")
    private WebElement btnBookOnline;

    @FindBy(xpath="//div[@id='book-button']//div[contains(@class,'nbf_fancyimg_pms_add_button nbf_fg_pms_button_text nbf_bg_pms_button nbf_fg_pms_button_text')][normalize-space()='Book Online']")
    private WebElement btnBookOnline2;

    @FindBy(xpath="//div[@class='fielderror']")
    private WebElement fielderror;

    @FindBy(xpath="//div[@class='nbf_tpl_pms_calendar_box_select']")
    private WebElement selectDate;

    @FindBy(xpath="//div[@class='nbf_tpl_pms_departure_select_title']")
    private WebElement titleofDepartAirport;

    public void clickonBookOnline() throws InterruptedException {
       // scrollIntoView(btnBookOnline);
        Thread.sleep(3000);
        btnBookOnline.click();
    }

    public String geterrorText(){
      String errorText=  fielderror.getText();
      return errorText;
    }

    public void isnotvisibleText(){
        // Check if the element is not visible
        if (!fielderror.isDisplayed()) {
            System.out.println("The 'Please select your departure date' text is not visible.");
        } else {
            System.out.println("The 'Please select your departure date' text is visible.");
        }
    }

    public void clickonBookOnline2() throws InterruptedException {
//        scrollIntoView(btnBookOnline2);
        Thread.sleep(3000);
        clickButton(btnBookOnline2);
    }

    public void selectDate(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        clickButton(selectDate);
    }

    public String captureDepatureairpotText(){
       String DepartpointText= titleofDepartAirport.getText();
       System.out.println("Departure Airport is :"+DepartpointText);
       return DepartpointText;
    }


}
