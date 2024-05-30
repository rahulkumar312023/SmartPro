package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public String homePageUrl = "https://staging-scweb.arcapps.org/";

    public String userName = "tester";

    public String passWord = "tester2023!";

    public String facility = "Dr Watson Dental Clinic";


    public By userNameField = By.xpath("//input[@placeholder='Enter Your Username']");

    public By passWordField = By.xpath("//input[@placeholder='Enter Your Password']");


    public By signInButton = By.xpath("//button[normalize-space()='Sign In']");

    public By selectProvince = By.xpath("//select[@placeholder='Enter Province']");

    public By selectDistrict = By.xpath("//select[@placeholder='Enter District']");

    public By searchFacility = By.xpath("//input[@placeholder='Search facility']");

    public By enterButton = By.xpath("//button[normalize-space()='Enter']");

    public By addNewPatient = By.xpath("//button[normalize-space()='NRC']");

}
