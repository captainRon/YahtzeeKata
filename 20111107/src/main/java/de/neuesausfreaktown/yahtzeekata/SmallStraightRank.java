package de.neuesausfreaktown.yahtzeekata;

import java.util.Arrays;

@SuppressWarnings("SuppressionAnnotation")
public enum SmallStraightRank implements RankCalculator {
    SMALLSTRAIGHT;
    private static final int SCORE = 30;
    private static final int ADDITIONAL_ELEMENTS = 3;
    private static final int SUM_OF_DIFFERENCES = 3;

    @Override
    public int calculateScore(int... pips) {
        //noinspection ConstantConditions
        assert pips != null && pips.length == 5;

        Arrays.sort(pips);
        int result = 0;
        for (int i = 0; i < 2; i++) {
            if (isSmallStraight(i, pips)) {
                result = SCORE;
                //noinspection BreakStatement
                break;
            }
        }

        return result;
    }

    private static boolean isSmallStraight(int startPosition, int[] pips) {
        int summe = 0;
        boolean retval = true;
        for (int i = startPosition; i < startPosition + ADDITIONAL_ELEMENTS; i++) {
            if (pips[i+1] - pips[i] == 1) {
                summe += pips[i + 1] - pips[i];
            } else {
                retval = false;
                //noinspection BreakStatement
                break;
            }
        }
        if (retval) {
            retval = summe == SUM_OF_DIFFERENCES;
        }
        return retval;
    }
}
