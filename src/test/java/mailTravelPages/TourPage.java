package mailTravelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TourPage extends CommonMethods{


    public TourPage(WebDriver driver) {
        super(driver);

    }

    //WebElements
    @FindBy(xpath="//div[@id='iterator_6_product_custom_product-content']")
    private WebElement imageProduct6;

    public void clickTour6() throws InterruptedException {
        Thread.sleep(5000);
        scrollIntoView(imageProduct6);
        imageProduct6.click();

    }
}
