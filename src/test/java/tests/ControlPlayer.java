package tests;

import org.junit.Test;
import util.BaseTest;

public class ControlPlayer extends BaseTest {
    @Test
    public void controlTests(){
        playSong();
        pauseSong();
    }
    public void playSong(){
        clickElementByTypeAndTex("android.widget.TextView","Cinematic");
        clickElementById("play_eq");
        assertElementByIdDisplayed("fragment_playback_controls");
    }
    public void pauseSong(){
        clickElementById("play_pause");
        assertElementByIdHasText("title","The Story Unfolds");
        navBack();
    }
}
