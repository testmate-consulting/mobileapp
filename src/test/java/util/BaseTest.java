package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseTest extends Setup{

    protected void waitUntilElementIsVisible(int seconds, By by) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    protected void waitUntilElementByIdHasText(int seconds, String id, String text) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));

        Assert.assertEquals(text, el.getText());
    }
    protected WebElement findElementById(String id) {
        WebElement element = driver.findElement(By.id(id));
        return element;
    }
    protected WebElement findElementByIdOrXpath(By by) {
        return driver.findElement(by);
    }
    protected void clickElementById(String id) {
        driver.findElement(By.id(APP_ID + id)).click();
    }

    protected void assertElementByTypeAndTextIsDisplayed(String widget,String text) {
        assert findElementByIdOrXpath(By.xpath("//"+ widget +"[@text = '" + text + "']")).isDisplayed();
    }

    protected void assertElementByIdHasText(String id,String text) {
        WebElement element = findElementByIdOrXpath(By.id(APP_ID + id));
        Assert.assertEquals(text,element.getText());
    }

    protected void clickElementByTypeAndTex(String widget,String text) {
        String query = "//" + widget + "[@text = '" + text + "']";
        WebElement element = findElementByIdOrXpath(By.xpath(query));
        element.click();
    }

    protected void clickElementByTypeAndContentDesc(String widget, String text){
        WebElement element = findElementByIdOrXpath(By.xpath("//" + widget + "[@content-desc = '" + text + "']"));
        element.click();
    }

    protected void assertElementByIdDisplayed(String id){
        Assert.assertTrue(findElementById(APP_ID+id).isDisplayed());
    }

    protected void navBack(){
        //Navigate to the genre list
        clickElementByTypeAndContentDesc("android.widget.ImageButton","Navigate up");
    }

}
