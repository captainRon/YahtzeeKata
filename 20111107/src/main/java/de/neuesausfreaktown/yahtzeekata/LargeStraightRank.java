package de.neuesausfreaktown.yahtzeekata;

import java.util.Arrays;

@SuppressWarnings("SuppressionAnnotation")
public enum LargeStraightRank implements RankCalculator {
    LARGESTRAIGHT;

    private static final int SCORE = 40;
    private static final int ADDITIONAL_ELEMENTS = 4;
    private static final int SUM_OF_DIFFERENCES = 4;

    @Override
    public int calculateScore(int... pips) {
        //noinspection ConstantConditions
        assert pips != null && pips.length == 5;

        Arrays.sort(pips);
        int result = 0;
        for (int i = 0; i < 1; i++) {
            if (isLargeStraight(i, pips)) {
                result = SCORE;
                //noinspection BreakStatement
                break;
            }
        }

        return result;
    }

    private static boolean isLargeStraight(int startPosition, int[] pips) {
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
