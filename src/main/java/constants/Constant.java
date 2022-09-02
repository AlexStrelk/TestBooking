package constants;

import org.openqa.selenium.By;

public class Constant {
    public static class TimeOutVariables {
        public static final int IMPLICIT_WAIT = 10;
        public static final int EXPLICIT_WAIT = 25;

    }

    public static class Urls {
        public static final String BOOKING_MAIN_PAGE = "https://www.booking.com/index.en-gb.html?label=gen173nr" +
                "-1DCAEoggI46AdIM1gEaOkBiAEBmAEhuAEXyAEM2AED6AEBiAIBqAIDuALIq4" +
                "-YBsACAdICJGE0MDFhMjAwLTFkODQtNDg0Mi1hM2U4LWM5MzdjMzgzZDMwYdgCBOACAQ&sid" +
                "=4b5ee15d07d7ba64e9fff5984f1499fb&lang=en" +
                "-gb&sb_price_type=total&soz=1&lang_click=other&cdl=ru&lang_changed=1";
       public static final String URL_WITH_RESULT_OF_SEARCH = "https://www.booking.com/" +
               "searchresults.en-gb.html?label=gen173nr+++-" +
               "1DCAEoggI46AdIM1gEaOkBiAEBmAEhuAEXyAEM2AED6AEBiAIBqAIDuALIq4+++-YBsACAdICJGE0MDFhMjAwLTFkODQtNDg0Mi1hM2U4" +
               "LWM5MzdjMzgzZDMwYdgCBOACAQ&lang=en-gb&sid=4b5ee15d07d7ba64e9fff5984f1499fb&sb=1&sb_lp" +
               "=1&src=index&src_elem=sb&error_url=https%3A%2F%2Fwww.booking.com%2Findex." +
               "en-gb.html%3Flabel%3Dgen173nr%2520%2520%2520-" +
               "1DCAEoggI46AdIM1gEaOkBiAEBmAEhuAEXyAEM2AED6AEBiAIBqAIDuALIq4%2520%2520%2520-" +
               "YBsACAdICJGE0MDFhMjAwLTFkODQtNDg0Mi1hM2U4LWM5MzdjMzgzZDMwYdgCBOACAQ%26sid%3D4b5ee15d07d7ba64e9fff5984f1499fb%26sb" +
               "_price_type%3Dtotal%26%26&ss=New+York&is_ski_area=0&ssne=New+York&ssne_untouched=New+York&dest_id=20088325&dest_" +
               "type=city&checkin_year=2022&checkin_month=12&checkin_monthday=1&checkout_year=2022&checkout_month=12&checkout_monthday" +
               "=30&efdco=1&group_adults=2&group_children=0&no_rooms=1&b_h4u_keep_filters=&from_sf=1";
    }
    public static class CityAndDates{
        public static final String CITY= "NewYork";
        public static final String MONTH_DECEMBER = "//div[text()[contains(.,'December 2022')]]";

    }

       public static class InfoForAssertion{
          public static final  String CITY_FOR_ASSERTION= "New York";
           public static final String CHECK_IN_DATE_FOR_BOOKING_MAIN_PAGE="1\nThursday 1 December 2022";
           public static final String CHECK_OUT_DATE_FOR_BOOKING_MAIN_PAGE="30\nFriday 30 December 2022";
           public static final String CHECK_IN_DATE_FOR_BOOKING_PAGE_WITH_RESULT_OF_SEARCH="Thursday 1 December 2022";
           public static final String CHECK_OUT_DATE_FOR_BOOKING_PAGE_with_RESULT_OF_SERCH="Friday 30 December 2022";

           public static final String  TITTLE_FOR_ASSERTION_STAYS_PAGE_FIND_YOUR = "Find your next stay";
           public static final String  TITTLE_FOR_ASSERTION_STAYS_PAGE_OFFERS = "Offers";
           public static final String  TITTLE_FOR_ASSERTION_STAYS_PAGE_BROWSE_BY = "Browse by property type";
           public static final String  TITTLE_FOR_ASSERTION_STAYS_PAGE_OTHER_SIMILAR = "Other similar beaches you might like";
           public static final String  TITTLE_FOR_ASSERTION_STAYS_PAGE_CONNECT_WITH = "Connect with other travellers";
           public static final String  TITTLE_FOR_ASSERTION_STAYS_PAGE_DESTINATION_WE = "Destinations we love";

       }

}
