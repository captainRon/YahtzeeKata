package de.neuesausfreaktown.yahtzeekata;

import java.util.Arrays;

@SuppressWarnings("SuppressionAnnotation")
public enum YahtzeeRank implements RankCalculator {
    YAHTZEE;

    @Override
    public int calculateScore(int... pips) {
        //noinspection ConstantConditions
        assert pips != null && pips.length == 5;

        Arrays.sort(pips);
        int result = 0;
        for (int i = pips.length - 1; i > 1; i--) {
            if (isTriple(i, pips)) {
                result += valueOfTriple(i, pips);
                //noinspection AssignmentToForLoopParameter
                i -= 2;
            }
        }

        return result;
    }

    private static int valueOfTriple(int i, int[] pips) {
        return pips[i] + pips[i - 1] + pips[i - 2];
    }

    private static boolean isTriple(int i, int[] pips) {
        return pips[i] == pips[i - 1] && pips[i] == pips[i - 2];
    }
}
