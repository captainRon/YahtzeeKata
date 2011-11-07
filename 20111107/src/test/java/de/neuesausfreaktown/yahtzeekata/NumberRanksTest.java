package de.neuesausfreaktown.yahtzeekata;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

/** Testet die Regeln für Nummern. */
@SuppressWarnings({"MagicNumber", "SuppressionAnnotation", "ClassWithoutConstructor"})
public class NumberRanksTest {

    @Test
    public final void noFourOnFoursIsZero() {
        int score = NumberRanks.FOURS.calculateScore(1, 1, 2, 2, 3);
        assertThat(score, is(0));
    }

    @Test
    public final void oneFourOnFoursIsFour() {
        int score = NumberRanks.FOURS.calculateScore(1, 1, 2, 2, 4);
        assertThat(score, is(4));
    }

    @Test
    public final void threeFoursOnFoursIsTwelve() {
        int score = NumberRanks.FOURS.calculateScore(1, 1, 4, 4, 4);
        assertThat(score, is(12));
    }

    @Test
    public final void noOneOnOnesIsZero() {
        int score = NumberRanks.ONES.calculateScore(2, 2, 2, 2, 4);
        assertThat(score, is(0));
    }

    @Test
    public final void oneOneOnOnesIsOne() {
        int score = NumberRanks.ONES.calculateScore(1, 2, 2, 2, 4);
        assertThat(score, is(1));
    }

}
