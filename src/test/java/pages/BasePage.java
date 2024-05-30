package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static utilities.DriverSetUp.getBrowser;

public class BasePage {

    public WebElement getElement(By locator){

        return getBrowser().findElement(locator);
    }

    public void clickOnElement(By locator){

        getElement(locator).click();
    }

    public void writeOnElement(By locator, String text){

        getElement(locator).sendKeys(text);
    }

    public void dropDownSelection(By locator){
        WebElement dropDown = getElement(locator);
        Select select = new Select(dropDown);
        select.selectByIndex(5);
    }
}
