package de.neuesausfreaktown.yahtzeekata;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings({"ClassWithoutConstructor", "SuppressionAnnotation"})
public class FourOfAKindTest {
    @Test
    public final void aYahtzeeOfOnesOnFourOfAKindIsFour() {
        int score = FourOfAKindRank.FOUROFAKIND.calculateScore(1, 1, 1, 1, 1);
        Assert.assertThat(score, Matchers.is(4));
    }

    @Test
    public final void fourOrderedOnesOnFourOfAKindIsFour() {
        int score = FourOfAKindRank.FOUROFAKIND.calculateScore(1, 1, 1, 1, 3);
        Assert.assertThat(score, Matchers.is(4));
    }

    @Test
    public final void fourUnorderedTwosOnFourOfAKindIsEight() {
        int score = FourOfAKindRank.FOUROFAKIND.calculateScore(2, 2, 3, 2, 2);
        Assert.assertThat(score, Matchers.is(8));
    }
}
