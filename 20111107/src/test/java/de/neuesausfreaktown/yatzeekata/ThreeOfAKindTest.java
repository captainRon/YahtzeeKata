package de.neuesausfreaktown.yatzeekata;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings({"ClassWithoutConstructor", "SuppressionAnnotation"})
public class ThreeOfAKindTest {
    @Test
    public final void aYahtzeeOfOnesOnThreeOfAKindIsThree() {
        int score = ThreeOfAKindRank.THREEOFAKIND.calculateScore(1, 1, 1, 1, 1);
        Assert.assertThat(score, Matchers.is(3));
    }

    @Test
    public final void threeOrderedOnesOnThreeOfAKindIsThree() {
        int score = ThreeOfAKindRank.THREEOFAKIND.calculateScore(1, 1, 1, 3, 3);
        Assert.assertThat(score, Matchers.is(3));
    }

    @Test
    public final void threeUnorderedTwosOnThreeOfAKindIsSix() {
        int score = ThreeOfAKindRank.THREEOFAKIND.calculateScore(2, 2, 3, 2, 3);
        Assert.assertThat(score, Matchers.is(6));
    }

    @Test
    public final void anOrderedFullHouseOfTwosAndThresOnThreeOfAKindIsSix() {
        int score = ThreeOfAKindRank.THREEOFAKIND.calculateScore(2, 2, 2, 3, 3);
        Assert.assertThat(score, Matchers.is(6));
    }

    @Test
    public final void anInverseOrderedFullHouseOfTwosAndThresOnThreeOfAKindIsSix() {
        int score = ThreeOfAKindRank.THREEOFAKIND.calculateScore(3, 3, 2, 2, 2);
        Assert.assertThat(score, Matchers.is(6));
    }

    @Test
    public final void anUnorderedFullHouseOfTwosAndThresOnThreeOfAKindIsSix() {
        int score = ThreeOfAKindRank.THREEOFAKIND.calculateScore(3, 2, 3, 2, 2);
        Assert.assertThat(score, Matchers.is(6));
    }
}
