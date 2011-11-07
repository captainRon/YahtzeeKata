package de.neuesausfreaktown.yatzeekata;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings({"ClassWithoutConstructor", "SuppressionAnnotation"})
public class OnePairTest {
    @Test
    public final void noPairOnPairsIsZero() {
        int score = PairRank.PAIR.calculateScore(1, 2, 3, 4, 5);
        Assert.assertThat(score, Matchers.is(0));
    }

    @Test
    public final void aPairOfRightmostFoursIsEight() {
        int score = PairRank.PAIR.calculateScore(1, 2, 3, 4, 4);
        Assert.assertThat(score, Matchers.is(8));
    }

    @Test
    public final void aPairOfThreesIsSix() {
        int score = PairRank.PAIR.calculateScore(1, 2, 3, 3, 4);
        Assert.assertThat(score, Matchers.is(6));
    }

    @Test
    public final void aPairOfTwosIsFour() {
        int score = PairRank.PAIR.calculateScore(1, 2, 2, 3, 4);
        Assert.assertThat(score, Matchers.is(4));
    }

    @Test
    public final void aPairOfOnesIsTwo() {
        int score = PairRank.PAIR.calculateScore(1, 1, 2, 3, 4);
        Assert.assertThat(score, Matchers.is(2));
    }

    @Test
    public final void aYahtzeeOfOnesOnPairsIsTwo() {
        int score = PairRank.PAIR.calculateScore(1, 1, 1, 1, 1);
        Assert.assertThat(score, Matchers.is(2));
    }

    @Test
    public final void onTwoPairsTheOneWithHiherValueIsChoosen() {
        int score = PairRank.PAIR.calculateScore(1, 6, 5, 1, 5);
        Assert.assertThat(score, Matchers.is(10));
    }
}
