package de.neuesausfreaktown.yahtzeekata;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SmallStraightRankTest {

    @Test
    public final void aRandomCollectionOnSmalStraightIsZero() {
        int score = SmallStraightRank.SMALLSTRAIGHT.calculateScore(1, 1, 2, 2, 3);
        assertThat(score, is(0));
    }

    @Test
    public final void aLowerSmallStraightOnSmalStraightIsThirty() {
        int score = SmallStraightRank.SMALLSTRAIGHT.calculateScore(1, 1, 2, 3, 4);
        assertThat(score, is(30));
    }

    @Test
    public final void aMiddleSmallStraightOnSmalStraightIsThirty() {
        int score = SmallStraightRank.SMALLSTRAIGHT.calculateScore(2, 2, 5, 3, 4);
        assertThat(score, is(30));
    }

    @Test
    public final void aHighSmallStraightOnSmalStraightIsThirty() {
        int score = SmallStraightRank.SMALLSTRAIGHT.calculateScore(3, 6, 5, 3, 4);
        assertThat(score, is(30));
    }

}
