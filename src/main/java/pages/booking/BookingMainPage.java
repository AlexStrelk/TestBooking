package pages.booking;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import static constants.Constant.CityAndDates.*;



public class BookingMainPage extends BasePage {
    public BookingMainPage(WebDriver driver) {
        super(driver);
    }

    private final By inputField = By.xpath("//input[@type='search']");
    private final By checkInDateCheckbox_1_December_2022 = By.xpath("//span[@aria-label='1 December 2022']");
    private final By checkOutDateCheckbox_30_December_2022 = By.xpath("//span[@aria-label='30 December 2022']");
    private final By buttonSearch = By.xpath("//button[@type='submit']");
    private final By selectCalendarField =
            By.xpath("//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']");
    private final By calendar_control_next =
            By.xpath("//div[@class='bui-calendar__control bui-calendar__control--next']");


    private final By month_december = By.xpath(MONTH_DECEMBER);
    private final By checkCity = By.xpath("//li[4]/span/a/span[contains(text(),'New York')]");
    private final By checkInDate =
            By.xpath("//button[contains(text(),'Thursday 1 December 2022')]");
    private final By checkOutDate =
            By.xpath("//button[contains(text(),'Friday 30 December 2022')]");



    public void  selectAppropriateMonth() {

          while (!isElementPresent(month_december)) {
              calendarControlNext();
          }
    }

    public boolean isElementPresent(By locatorKey) {
        try {
            driver.findElement(locatorKey);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public BookingMainPage calendarControlNext() {
        driver.findElement(calendar_control_next).click();
        return this;
    }

    public BookingMainPage enterCityName(String cityName) {
        driver.findElement(inputField).sendKeys(cityName);
        return this;
    }

    public BookingMainPage selectCalendarField() {
        driver.findElement(selectCalendarField).click();
        return this;
    }

    public BookingMainPage selectCheckInDate() {
        driver.findElement(checkInDateCheckbox_1_December_2022).click();
        return this;
    }

    public BookingMainPage selectCheckOutDate() {
        driver.findElement(checkOutDateCheckbox_30_December_2022).click();
        return this;
    }

    public BookingMainPage clickButtonSearch() {
        driver.findElement(buttonSearch).click();
        return this;
    }


    public BookingMainPage webElementWithNameOCityIsVisible(String text){
        WebElement details = driver.findElement(checkCity);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }
    public BookingMainPage webElementDataCheckInIsVisible(String text){
        WebElement details = driver.findElement(checkInDate);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }

    public BookingMainPage webElementDataCheckOutIsVisible(String text){
        WebElement details = driver.findElement(checkOutDate);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }
}
