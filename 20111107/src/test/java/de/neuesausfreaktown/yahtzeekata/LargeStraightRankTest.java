package de.neuesausfreaktown.yahtzeekata;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@SuppressWarnings({"ClassWithoutConstructor", "SuppressionAnnotation"})
public class LargeStraightRankTest {

    private static final int LARGE_STRTAIGHT_SCORE = 40;

    @Test
    public final void aRandomCollectionOnLargeStraightIsZero() {
        int score = LargeStraightRank.LARGESTRAIGHT.calculateScore(1, 1, 2, 2, 3);
        assertThat(score, is(0));
    }

    @Test
    public final void aLowerLargeStraightOnLargeStraightIsFourty() {
        int score = LargeStraightRank.LARGESTRAIGHT.calculateScore(1, 2, 3, 4, 5);
        assertThat(score, is(LARGE_STRTAIGHT_SCORE));
    }

    @Test
    public final void aHighLargeStraightOnLargeStraightIsFourty() {
        int score = LargeStraightRank.LARGESTRAIGHT.calculateScore(2, 6, 3, 5, 4);
        assertThat(score, is(LARGE_STRTAIGHT_SCORE));
    }
}
