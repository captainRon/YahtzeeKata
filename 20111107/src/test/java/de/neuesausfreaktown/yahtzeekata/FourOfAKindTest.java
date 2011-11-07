package de.neuesausfreaktown.yahtzeekata;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings({"ClassWithoutConstructor", "SuppressionAnnotation"})
public class FourOfAKindTest {
    @Test
    public final void aYahtzeeOfOnesOnThreeOfAKindIsFour() {
        int score = FourOfAKindRank.FOUROFAKIND.calculateScore(1, 1, 1, 1, 1);
        Assert.assertThat(score, Matchers.is(4));
    }
/*
    @Test
    public final void threeOrderedOnesOnThreeOfAKindIsThree() {
        int score = FourOfAKindRank.FOUROFAKIND.calculateScore(1, 1, 1, 3, 3);
        Assert.assertThat(score, Matchers.is(3));
    }

    @Test
    public final void threeUnorderedTwosOnThreeOfAKindIsSix() {
        int score = FourOfAKindRank.FOUROFAKIND.calculateScore(2, 2, 3, 2, 3);
        Assert.assertThat(score, Matchers.is(6));
    }

    @Test
    public final void anOrderedFullHouseOfTwosAndThresOnThreeOfAKindIsSix() {
        int score = FourOfAKindRank.FOUROFAKIND.calculateScore(2, 2, 2, 3, 3);
        Assert.assertThat(score, Matchers.is(6));
    }

    @Test
    public final void anInverseOrderedFullHouseOfTwosAndThresOnThreeOfAKindIsSix() {
        int score = FourOfAKindRank.FOUROFAKIND.calculateScore(3, 3, 2, 2, 2);
        Assert.assertThat(score, Matchers.is(6));
    }

    @Test
    public final void anUnorderedFullHouseOfTwosAndThresOnThreeOfAKindIsSix() {
        int score = FourOfAKindRank.FOUROFAKIND.calculateScore(3, 2, 3, 2, 2);
        Assert.assertThat(score, Matchers.is(6));
    }
*/
}
