package de.neuesausfreaktown.yatzeekata;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

@SuppressWarnings("SuppressionAnnotation")
public enum FourOfAKindRank implements RankCalculator {
    FOUROFAKIND;
    // , , SMALLSTRAIGHT, LARGESTRAIGHT, FULLHOUSE, YAHTZEE, CHANCE;

    @Override
    public int calculateScore(@NotNull int... pips) {
        //noinspection ConstantConditions
        assert pips != null && pips.length == 5;

        Arrays.sort(pips);
        int result = 0;
        for (int i = pips.length - 1; i > 0; i--) {
            if (isPair(i, pips)) {
                result += valueOfPair(i, pips);
                //noinspection AssignmentToForLoopParameter
                i -= 2;
            }
        }

        return result;
    }

    private static int valueOfPair(int i, int[] pips) {
        return pips[i] + pips[i - 1];
    }

    private static boolean isPair(int i, int[] pips) {
        return pips[i] == pips[i-1];
    }
}
