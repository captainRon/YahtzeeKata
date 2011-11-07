package de.neuesausfreaktown.yahtzeekata;

/**
 * Created by IntelliJ IDEA. User: coellen Date: 07.11.11 Time: 21:03 To change this template use File | Settings | File
 * Templates.
 */
@SuppressWarnings("SuppressionAnnotation")
public enum NumberRanks implements RankCalculator {
    ONES, TWOS, THREES, FOURS, FIVES, SIXES;

    @Override
    public int calculateScore(int... pips) {
        //noinspection ConstantConditions
        assert pips != null && pips.length == 5;

        int result = 0;

        for (int pip : pips) {
            if (pip == ordinal() + 1) {
                result += pip;
            }
        }

        return result;

    }
}
