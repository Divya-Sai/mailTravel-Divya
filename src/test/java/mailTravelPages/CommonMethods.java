package mailTravelPages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CommonMethods {

    WebDriver driver ;
    public final int timeOut = 45;

    public CommonMethods(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    /**
     * method to open specified url
     * @param url to open
     */
    //Step to navigate to specified URL
    public void get(String url){
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    /**
     * method to navigate to specified page
     * @param url navigation url
     */
    public void navigate(String url){
        driver.navigate().to(url);
    }
    /**
     * method to click on an element with action class
     * @param element to be clicked
     */
    public void clickOnElementUsingActions(By element){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(element));
        actions.click().perform();
    }
    /**
     * method to click on an element using javascript
     * @param element to be clicked
     */
    public void clickOnElementUsingJs(By element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement webElement = driver.findElement(element);
        js.executeScript("arguments[0].click();", webElement);
    }

    /**
     * method to click on an element using Selenium
     * @param element to be clicked
     */
    public void clickOnElementUsingSelenium(By element){
        WebElement webElement = driver.findElement(element);
        webElement.click();
    }

    /**
     * method to get title of current webpage
     * @return String name of a webpage
     */
    public String getTitle(){
        return driver.getTitle();
    }

    /**
     * method to accept alert,
     * exception is thrown if no alert is present
     */
    public void acceptAlert(){
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e){
            throw new NoAlertPresentException();
        }
    }

    /**
     * method to get the text of  alert,
     * exception is thrown if no alert is present
     */
    public void getAlertText(){
        try {
            Alert alert = driver.switchTo().alert();
            alert.getText();
            alert.dismiss();
        } catch (NoAlertPresentException e){
            throw new NoAlertPresentException();
        }
    }
    /**
     * method to find an element
     * @param locator element to be found
     * @return WebElement if found else throws NoSuchElementException
     */
    public WebElement findElement(By locator){
        try {
            WebElement element = driver.findElement(locator);
            return element;
        }
        catch (NoSuchElementException e){
            // Log.logError(this.getClass().getName(), "findElement", "Element not found " + locator);
            throw new NoSuchElementException(e.getMessage());
        }
    }
    /**
     * method to select a value from dropdown with index
     *
     * @param selectLocator element with select tag
     */
    public void selectValuefromDropdownviaindex(By selectLocator,int valueToBeSelected){
        Select selectFromDropdown = new Select(driver.findElement(selectLocator));
        selectFromDropdown.selectByIndex(valueToBeSelected);
    }

    /**
     * method to select a value from dropdown with value
     *
     * @param selectLocator element with select tag
     */
    public void selectValuefromDropdownviaValue(By selectLocator,String valueToBeSelected){
        Select selectFromDropdown = new Select(driver.findElement(selectLocator));
        selectFromDropdown.selectByValue(valueToBeSelected);
    }
    /*method to enter the value into text box
     * @param element where to pass the value
     * @param  text what to send to the webElement
     * */
    public void enterText(WebElement element, String text) {
        element.sendKeys(text);
    }

    /*method to click on submit buttom
     * @param WebElement  submitButton to pass
     * */
    public void clickButton(WebElement submitButton) {
        submitButton.click();
    }

    /*Method to Scroll into view using JavaScript Executor
    * @param driver It takes a WebDriver instance
    * @param element to be scrol
    * */

    public  void scrollIntoView( WebElement element) {
        // Create a new instance of the JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll the element into view using JavaScript
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

