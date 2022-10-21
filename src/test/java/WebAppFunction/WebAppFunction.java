package WebAppFunction;

import PageObject.HomePageObjects;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.util.Strings;

public class WebAppFunction {

    WebDriver driver;

    public WebAppFunction(WebDriver remoteDriver)
    {
        driver = remoteDriver;
    }

    public void SelectMovie()
    {
        HomePageObjects homePageObjects = new HomePageObjects(driver);
        String MovieName = homePageObjects.DisplayMovieName.getText();
        Assert.assertEquals(MovieName,"The Shawshank Redemption");
        homePageObjects.SelectMovie.click();
    }
}
