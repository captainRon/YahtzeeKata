package de.neuesausfreaktown.yatzeekata;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings({"ClassWithoutConstructor", "SuppressionAnnotation"})
public class TwoPairsTest {
    @Test
    public final void anOrderedPairOfOnesAndAPairOfThreesIsEight() {
        int score = TwoPairsRank.TWOPAIRS.calculateScore(1, 1, 2, 3, 3);
        Assert.assertThat(score, Matchers.is(8));
    }

    @Test
    public final void anOrderedPairOfOnesAndAPairOfTwosIsSix() {
        int score = TwoPairsRank.TWOPAIRS.calculateScore(1, 1, 2, 2, 3);
        Assert.assertThat(score, Matchers.is(6));
    }

    @Test
    public final void anOrderedPairOfTwosAndAPairOfThreesIsTen() {
        int score = TwoPairsRank.TWOPAIRS.calculateScore(1, 2, 2, 3, 3);
        Assert.assertThat(score, Matchers.is(10));
    }

    @Test
    public final void anUnorderedPairOfTwosAndAPairOfThreesIsTen() {
        int score = TwoPairsRank.TWOPAIRS.calculateScore(1, 2, 3, 2, 3);
        Assert.assertThat(score, Matchers.is(10));
    }

    @Test
    public final void anOrderedFullHouseOfTwosAndThresAsTwoPairsIsTen() {
        int score = TwoPairsRank.TWOPAIRS.calculateScore(2, 2, 2, 3, 3);
        Assert.assertThat(score, Matchers.is(10));
    }

    @Test
    public final void anInverseOrderedFullHouseOfTwosAndThresAsTwoPairsIsTen() {
        int score = TwoPairsRank.TWOPAIRS.calculateScore(3, 3, 2, 2, 2);
        Assert.assertThat(score, Matchers.is(10));
    }

    @Test
    public final void aYahtzeeOfOnesOnTwoPairsIsFour() {
        int score = TwoPairsRank.TWOPAIRS.calculateScore(1, 1, 1, 1, 1);
        Assert.assertThat(score, Matchers.is(4));
    }

    @Test
    public final void anUnorderedFullHouseOfTwosAndThresAsTwoPairsIsTen() {
        int score = TwoPairsRank.TWOPAIRS.calculateScore(3, 2, 3, 2, 2);
        Assert.assertThat(score, Matchers.is(10));
    }
}
