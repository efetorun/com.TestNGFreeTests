package tests.amazon;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonTest {
@Test
    public void test01(){
    Driver.getdriver().get(ConfigReader.getProperty("amazonUrl"));
    AmazonPage amazonPage = new AmazonPage();
    amazonPage.searchBox.sendKeys("efe" + Keys.ENTER);
    ReusableMethods.wait(3);
    Driver.closedriver();

}



}
