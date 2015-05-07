package session.fourteen;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PoorGuyTest {

    private PoorGuy poorGuy;

    @Before
    public void setUp() throws Exception {
        poorGuy = new PoorGuy();
    }

    @Test
    public void onInit_shouldReturnNormalState() throws Exception {
        assertThat(poorGuy.feelings()).isEqualTo("want to code");
    }

    @Test
    public void codedSomeStuff_shouldReturnNormalState() throws Exception {
        poorGuy.codeHard();
        assertThat(poorGuy.feelings()).isEqualTo("want to code");
    }

    @Test
    public void codedToMuch_shouldReturnTiredState() throws Exception {
        poorGuy.codeHard();

        poorGuy.codeHard();

        assertThat(poorGuy.feelings()).isEqualTo("want to sleep");
    }

    @Test
    public void tiredAndHungry_shouldReturnHungryState() throws Exception {
        poorGuy.codeHard();
        poorGuy.codeHard();

        poorGuy.sleep();

        assertThat(poorGuy.feelings()).isEqualTo("want to eat");
    }

    @Test
    public void hadAGoodMeal_shouldReturnNormalState() throws Exception {
        poorGuy.codeHard();
        poorGuy.codeHard();
        poorGuy.sleep();

        poorGuy.eat();

        assertThat(poorGuy.feelings()).isEqualTo("want to code");
    }

    @Test
    public void sleptToLong_shouldReturnHungryState() throws Exception {
        poorGuy.codeHard();
        poorGuy.codeHard();
        poorGuy.sleep();
        poorGuy.sleep();

        poorGuy.eat();

        assertThat(poorGuy.feelings()).isEqualTo("want to eat");
    }

    @Test
    public void hungryWorkedToHard_shouldReturnBurnoutState() throws Exception {
        poorGuy.codeHard();
        poorGuy.codeHard();
        poorGuy.sleep();

        poorGuy.codeHard();

        assertThat(poorGuy.feelings()).isEqualTo("burnout :-(");
    }
}