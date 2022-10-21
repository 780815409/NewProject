package TestCases;

import Utilities.BaseClass;
import WebAppFunction.WebAppFunction;
import org.testng.annotations.Test;


public class TestCase1 extends BaseClass {

    @Test
    public void abc()
    {
        WebAppFunction webAppFunction = new WebAppFunction(webDriver);
        webAppFunction.SelectMovie();
    }
}
