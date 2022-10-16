package testes;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends TestBase {

    @Test
    public void navigatingHomepage() {
        HomePage homePage = new HomePage();
        homePage.clickSingInButton();
        homePage.clickSearchJobsBtn();


    }
}


