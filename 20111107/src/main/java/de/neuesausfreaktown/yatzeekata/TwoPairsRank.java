package de.neuesausfreaktown.yatzeekata;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA. User: coellen Date: 07.11.11 Time: 21:03 To change this template use File | Settings | File
 * Templates.
 */
@SuppressWarnings("SuppressionAnnotation")
public enum TwoPairsRank implements RankCalculator {
    TWOPAIRS;

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
                i--;
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
