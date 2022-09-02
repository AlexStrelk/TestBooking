package pages.booking;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import java.util.ArrayList;
import static constants.Constant.InfoForAssertion.*;


public class BookingPageWithResultsOfSearch extends BasePage {
    public BookingPageWithResultsOfSearch(WebDriver driver) {
        super(driver);
    }
    private final By checkInDate =
            By.xpath("//div[contains(text(),'Thursday 1 December 2022')]");
    private final By checkOutDate =
            By.xpath("//div[contains(text(),'Friday 30 December 2022')]");

    public BookingPageWithResultsOfSearch webElementWithDataCheckInDataIsVisible(String text){
        WebElement details = driver.findElement(checkInDate);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }
    public BookingPageWithResultsOfSearch webElementWithDataCheckOutDataIsVisible(String text){
        WebElement details = driver.findElement(checkOutDate);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }

    public void selectFirstLinkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][1]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }
    public void selectSecondLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][2]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }

    public void selectThirdLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][3]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }
    public void selectFourthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][4]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }
    public void selectFifthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][5]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }
    public void selectSixthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][6]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }
    public void selectSeventhLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][7]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectEighthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][8]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectNinthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][9]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectTenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectEleventhLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][11]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectTwelfthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][12]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectThirteenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][13]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectFourteenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][14]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectFifteenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][15]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectSixteenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][16]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectSeventeenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][17]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectEighteenthCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][18]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectNineteenthCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][19]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void selectTwentiethCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][20]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectTwentyFirstCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][21]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectTwentySecondCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][22]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectTwentyThirdCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][23]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectTwentyFourCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][24]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void selectTwentyFifthCheckInAndCheckOut() {
        String urlFirstApartment = driver.findElement(By.xpath("//div[@data-testid='property-card'][25]//div/a")).getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(urlFirstApartment);
        webElementWithDataCheckInDataIsVisible(CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH);
        webElementWithDataCheckOutDataIsVisible(CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }


    }