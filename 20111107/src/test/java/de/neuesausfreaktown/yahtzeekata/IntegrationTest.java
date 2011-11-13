package de.neuesausfreaktown.yahtzeekata;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

/** Description User: coellen Date: 07.11.11 Time: 23:22 */
@SuppressWarnings({"ClassWithoutConstructor", "SuppressionAnnotation", "MagicNumber"})
public class IntegrationTest {
    @Test
    public final void twoFoursOnFoursGivesEight() {
        assertThat(NumberRanks.FOURS.calculateScore(1, 1, 2, 4, 4), is(8));
    }

    @Test
    public final void twoFoursOnPairsGivesEight() {
        assertThat(PairRank.PAIR.calculateScore(3, 3, 3, 4, 4), is(8));
    }

    @Test
    public final void twoOnesAndTwoThreesOnTwoPairsGivesEight() {
        assertThat(TwoPairsRank.TWOPAIRS.calculateScore(1, 1, 2, 3, 3), is(8));
    }

    @Test
    public final void threeThreesOnThreeOfAKindGivesNine() {
        assertThat(ThreeOfAKindRank.THREEOFAKIND.calculateScore(3, 3, 3, 4, 5), is(9));
    }

    @Test
    public final void fourTwosOnFourOfAKindGives8() {
        assertThat(FourOfAKindRank.FOUROFAKIND.calculateScore(2, 2, 2, 2, 5), is(8));
    }

    @Test
    public final void smallStraight() {
        assertThat(SmallStraightRank.SMALLSTRAIGHT.calculateScore(1, 2, 3, 4, 6), is(30));
    }

    @Test
    public final void largeStraight() {
        assertThat(LargeStraightRank.LARGESTRAIGHT.calculateScore(1, 2, 3, 4, 5), is(40));
    }

    @Test
    public final void genuineFullHouse() {
        assertThat(FullHouseRank.FULLHOUSE.calculateScore(1, 1, 2, 2, 2), is(25));
    }

    @Test
    public final void fakeFullHouse() {
        assertThat(FullHouseRank.FULLHOUSE.calculateScore(2, 2, 2, 2, 2), is(0));
    }

    @Test
    public final void yahtzee() {
        assertThat(YahtzeeRank.YAHTZEE.calculateScore(2, 2, 2, 2, 2), is(50));
    }

    @Test
    public final void chance() {
        assertThat(ChanceRank.CHANCE.calculateScore(1, 2, 3, 4, 5, 6), is(21));
    }
}
