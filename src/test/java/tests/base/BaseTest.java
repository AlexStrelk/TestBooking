package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.booking.BookingMainPage;
import pages.booking.BookingPageWithResultsOfSearch;
import pages.booking.StaysPage;


import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.*;

@ExtendWith(Listener.class)
//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected BookingMainPage bookingMainPage= new BookingMainPage(driver);
    protected BookingPageWithResultsOfSearch bookingPageWithResultsOfSearch =
            new BookingPageWithResultsOfSearch(driver);
    protected StaysPage staysPage = new StaysPage(driver);

    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);

    static {
        logger.info("Start time" + LocalTime.now());
        logger.info("Start clear reports dir: build/reports...");
        File allure_results = new File("allure-results");
        if (allure_results.isDirectory()) {
            for (File item : Objects.requireNonNull(allure_results.listFiles())) {
                item.delete();
            }
        }
        if(CLEAR_REPORTS_DIR){
            File allureScreenShots = new File("build/reports/tests");
            for (File item : Objects.requireNonNull(allureScreenShots.listFiles())){
                item.delete();
            }
        }
    }

    @AfterEach
    void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
    @AfterAll
    void close(){
        if(!HOLD_BROWSER_OPEN){
            driver.close();
        }
    }
}
