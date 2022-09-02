package tests.check_tabs;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import tests.base.BaseTest;

import static constants.Constant.InfoForAssertion.*;
import static constants.Constant.Urls.BOOKING_MAIN_PAGE;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TabTest extends BaseTest {

    @Order(1)
    @Test
    public void checkTitle1() {
        basePage.goToUrl(BOOKING_MAIN_PAGE);
        staysPage.selectTabStays();
        staysPage.webElementFindYourNextStayIsVisible(TITTLE_FOR_ASSERTION_STAYS_PAGE_FIND_YOUR);

    }

    @Order(2)
    @Test
    public void checkTitle2() {
        basePage.goToUrl(BOOKING_MAIN_PAGE);
        staysPage.selectTabStays();
        staysPage.webElementOffersIsVisible(TITTLE_FOR_ASSERTION_STAYS_PAGE_OFFERS);
    }

    @Order(3)
    @Test
    public void checkTitle3() {
        basePage.goToUrl(BOOKING_MAIN_PAGE);
        staysPage.selectTabStays();
        staysPage.webElementBrowseByIsVisible(TITTLE_FOR_ASSERTION_STAYS_PAGE_BROWSE_BY);

    }

    @Order(4)
    @Test
    public void checkTitle4() {
        basePage.goToUrl(BOOKING_MAIN_PAGE);
        staysPage.selectTabStays();
        staysPage.webElementOtherSimilarIsVisible(TITTLE_FOR_ASSERTION_STAYS_PAGE_OTHER_SIMILAR);
    }

    @Order(5)
    @Test
    public void checkTitle5() {
        basePage.goToUrl(BOOKING_MAIN_PAGE);
        staysPage.selectTabStays();
        staysPage.webElementConnectWithIsVisible(TITTLE_FOR_ASSERTION_STAYS_PAGE_CONNECT_WITH);

    }

    @Order(6)
    @Test
    public void checkTitle6() {
        basePage.goToUrl(BOOKING_MAIN_PAGE);
        staysPage.selectTabStays();
        staysPage.webElementDestinationsIsVisible(TITTLE_FOR_ASSERTION_STAYS_PAGE_DESTINATION_WE);
    }
}
