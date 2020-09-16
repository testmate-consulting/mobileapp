package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import util.BaseTest;

public class BurgerMenu extends BaseTest {

    @Test
    public void burgerMenuTests(){
        waitUntilElementIsVisible(240, By.id("title"));
        openMenu();
        viewPlaylists();
        viewAllMusic();
    }
    public void openMenu(){
        clickElementByTypeAndContentDesc("android.widget.ImageButton","Open the main menu");
        assertElementByTypeAndTextIsDisplayed("android.widget.TextView","Username");
    }
    public void viewPlaylists(){
        clickElementByTypeAndTex("android.widget.CheckedTextView","Playlists");
        assertElementByTypeAndTextIsDisplayed("android.widget.TextView","This is a placeholder for your application " +
                 "code.");
        openMenu();
    }
    public void viewAllMusic(){
        clickElementByTypeAndTex("android.widget.CheckedTextView","All Music");
        assertElementByTypeAndTextIsDisplayed("android.widget.TextView","Genres");
    }
}
