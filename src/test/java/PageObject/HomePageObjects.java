package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObjects {

    WebDriver webDriver;

    public HomePageObjects(WebDriver webDriver)
    {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = "(//span[contains(text(),'Learn More')])[2]")
    public WebElement SelectMovie;

    @FindBy(xpath = "(//h2[@class='jss39 jss44'])[2]")
    public WebElement DisplayMovieName;

}
