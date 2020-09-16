package tests;

import org.junit.Test;
import util.BaseTest;

public class Regression extends BaseTest {

    @Test
    public void regression(){
        Genres genres = new Genres();
        genres.viewGenresTest();

        ControlPlayer controls = new ControlPlayer();
        controls.controlTests();

        BurgerMenu menu = new BurgerMenu();
        menu.burgerMenuTests();
    }
}
