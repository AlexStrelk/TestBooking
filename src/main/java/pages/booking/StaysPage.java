package pages.booking;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class StaysPage extends BasePage {

    private final By tab_Stays = By.xpath("//span[contains(text(),'Stays')]");
    private final By tittle_find_your = By.xpath("//span[contains(text(),'Find your next stay')]");
    private final By tittle_offers = By.xpath("//div[contains(text(),'Offers')]");
    private final By tittle_browse_by = By.xpath("//div[contains(text(),'Browse by property type')]");
    private final By tittle_other_similar = By.xpath("//div[contains(text(),'Other similar beaches you might like')]");
    private final By tittle_connect_with = By.xpath("//h2[contains(text(),'Connect with other travellers')]");
    private final By tittle_destinations_we_love = By.xpath("//h2[contains(text(),'Destinations we love')]");

    public StaysPage(WebDriver driver) {
        super(driver);
    }


    public StaysPage selectTabStays() {
        driver.findElement(tab_Stays).click();
        return this;
    }

    public StaysPage webElementFindYourNextStayIsVisible(String text){
        WebElement details = driver.findElement(tittle_find_your);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }
    public StaysPage webElementOffersIsVisible(String text){
        WebElement details = driver.findElement(tittle_offers);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }
    public StaysPage webElementBrowseByIsVisible(String text){
        WebElement details = driver.findElement(tittle_browse_by);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }
    public StaysPage webElementOtherSimilarIsVisible(String text){
        WebElement details = driver.findElement(tittle_other_similar);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }
    public StaysPage webElementConnectWithIsVisible(String text){
        WebElement details = driver.findElement(tittle_connect_with);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }
    public StaysPage webElementDestinationsIsVisible(String text){
        WebElement details = driver.findElement(tittle_destinations_we_love);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }

}
