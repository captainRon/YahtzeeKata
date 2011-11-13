package de.neuesausfreaktown.yahtzeekata;

import java.util.Arrays;

@SuppressWarnings("SuppressionAnnotation")
public enum FourOfAKindRank implements RankCalculator {
    FOUROFAKIND;

    @Override
    public int calculateScore(int... pips) {
        assert pips != null && pips.length == 5;

        Arrays.sort(pips);
        int result = 0;
        for (int i = pips.length - 1; i > 0; i--) {
            if (isQuaduple(i, pips)) {
                result += valueOfPair(i, pips);
                //noinspection AssignmentToForLoopParameter
                i -= 3;
            }
        }

        return result;
    }

    private static int valueOfPair(int i, int[] pips) {
        int result = 0;
        for (int j = i; j > i - 4; j--) {
            result += pips[j];
        }
        return result;
    }

    private static boolean isQuaduple(int i, int[] pips) {
        for (int j = i; j > i - 4; j--) {
            if (pips[i] != pips[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
