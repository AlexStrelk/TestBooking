package tests.check_in_check_oot_tests;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import tests.base.BaseTest;

import static constants.Constant.CityAndDates.CITY;
import static constants.Constant.InfoForAssertion.*;
import static constants.Constant.Urls.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CheckInCheckOut extends BaseTest {
    @Order(1)
    @Test
    public void enterDateCheckInAndCheckOutAndCity() {
        basePage.goToUrl(BOOKING_MAIN_PAGE);
        bookingMainPage.enterCityName(CITY);
        bookingMainPage.selectCalendarField();
        bookingMainPage.selectAppropriateMonth();
        bookingMainPage.selectCheckInDate();
        bookingMainPage.selectCheckOutDate();
        bookingMainPage.clickButtonSearch();
        bookingMainPage.webElementWithNameOCityIsVisible(CITY_FOR_ASSERTION);
        bookingMainPage.webElementDataCheckInIsVisible(CHECK_IN_DATE_FOR_BOOKING_MAIN_PAGE);
        bookingMainPage.webElementDataCheckOutIsVisible(CHECK_OUT_DATE_FOR_BOOKING_MAIN_PAGE);
    }

    @Order(2)
    @Test
    public void checkFirstApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectFirstLinkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(3)
    @Test
    public void checkSecondApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectSecondLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(4)
    @Test
    public void checkThirdApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectThirdLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(5)
    @Test
    public void checkFourthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectFourthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(6)
    @Test
    public void checkFifthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectFifthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(7)
    @Test
    public void checkSixthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectSixthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(8)
    @Test
    public void checkSeventhApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectSeventhLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(9)
    @Test
    public void checkEighthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectEighthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(10)
    @Test
    public void checkNinthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectNinthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(11)
    @Test
    public void checkTenthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectTenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(12)
    @Test
    public void checkEleventhApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectEleventhLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(13)
    @Test
    public void checkTwelfthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectTwelfthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(14)
    @Test
    public void checkThirteenthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectThirteenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(15)
    @Test
    public void checkFourteenthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectFourteenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(16)
    @Test
    public void checkFifteenthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectFifteenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(17)
    @Test
    public void checkSixteenthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectSixteenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }

    @Order(18)
    @Test
    public void checkSeventeenthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectSeventeenthLInkWithApartmentsAndCheckDatesWithCheckInAndCheckOut();
    }
    @Order(19)
    @Test
    public void selectEighteenthCheckInAndCheckOut() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectEighteenthCheckInAndCheckOut();
    }
    @Order(20)
    @Test
    public void checkNineteenthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectNineteenthCheckInAndCheckOut();
    }
    @Order(21)
    @Test
    public void checkTwentiethApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectTwentiethCheckInAndCheckOut();
    }
    @Order(22)
    @Test
    public void checkTwentyFirstApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectTwentyFirstCheckInAndCheckOut();
    }
    @Order(23)
    @Test
    public void checkTwentySecondApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectTwentySecondCheckInAndCheckOut();
    }
    @Order(24)
    @Test
    public void checkTwentyThirdApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectTwentyThirdCheckInAndCheckOut();
    }
    @Order(25)
    @Test
    public void checkTwentyFourApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectTwentyFourCheckInAndCheckOut();
    }
    @Order(26)
    @Test
    public void checkTwentyFifthApartment() {
        basePage.goToUrl(URL_WITH_RESULT_OF_SEARCH);
        bookingPageWithResultsOfSearch.selectTwentyFifthCheckInAndCheckOut();
    }
}
