package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import util.BaseTest;

public class Genres extends BaseTest {

    @Test
    public void viewGenresTest(){
        viewGenres();
        viewRockSongs();
        viewCinematicSongs();
        viewJazzSongs();
    }

    public void viewGenres(){
        assertElementByTypeAndTextIsDisplayed("android.widget.TextView","Universal Music Player");
        clickElementById("title");
        assertElementByTypeAndTextIsDisplayed("android.widget.TextView","Universal Music Player");
    }

    public void viewRockSongs(){
        clickElementByTypeAndTex("android.widget.TextView","Rock");
       navBack();
    }

    public void viewCinematicSongs(){
        waitUntilElementIsVisible(30,By.id("title"));
        clickElementByTypeAndTex("android.widget.TextView","Cinematic");
        navBack();
    }

    public void viewJazzSongs(){
        waitUntilElementIsVisible(30,By.id("title"));
        clickElementByTypeAndTex("android.widget.TextView","Jazz & Blues");
        navBack();
    }
}
