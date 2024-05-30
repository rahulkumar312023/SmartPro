package testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetUp;

public class testLogin extends DriverSetUp {
    HomePage homePage = new HomePage();

    @Test
    public void testSignWithValidCredentials() throws InterruptedException {
        getBrowser().get(homePage.homePageUrl);
        homePage.writeOnElement(homePage.userNameField, homePage.userName);
        homePage.writeOnElement(homePage.passWordField, homePage.passWord);
        homePage.clickOnElement(homePage.signInButton);
        homePage.clickOnElement(homePage.selectProvince);
        homePage.dropDownSelection(homePage.selectProvince);
        homePage.clickOnElement(homePage.selectDistrict);
        homePage.dropDownSelection(homePage.selectDistrict);
        homePage.writeOnElement(homePage.searchFacility, homePage.facility);


    }
}
