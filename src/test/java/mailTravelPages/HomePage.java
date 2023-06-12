package mailTravelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonMethods {


    public HomePage(WebDriver driver) {
        super(driver);
    }



    //WebELements
    @FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
    private WebElement btnAcceptCookies;

    @FindBy(id="searchtext_freetext_search_form")
    private WebElement txtSearch;

    @FindBy(xpath="(//button[@type='submit'])[1]")
    private WebElement btnSearchSubmit;

    @FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/form[1]/div[1]/ul[1]/li[1]/a[1]/span[3]")
    private WebElement Day11;

    public void setBtnAcceptCookies() throws InterruptedException {
        Thread.sleep(3000);
        btnAcceptCookies.click();
    }

    public void setSearchText(String searchText) throws InterruptedException{
        enterText(txtSearch,searchText);
        Thread.sleep(3000);
        clickButton(Day11);


    }
}
