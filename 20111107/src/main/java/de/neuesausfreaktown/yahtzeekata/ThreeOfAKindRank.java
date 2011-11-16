package de.neuesausfreaktown.yahtzeekata;

import de.neuesausfreaktown.yahtzeekata.util.TripleTools;

import java.util.Arrays;

@SuppressWarnings("SuppressionAnnotation")
public enum ThreeOfAKindRank implements RankCalculator {
    THREEOFAKIND;

    @Override
    public int calculateScore(int... pips) {
        //noinspection ConstantConditions
        assert pips != null && pips.length == 5;

        Arrays.sort(pips);
        int result = 0;
        for (int i = pips.length - 1; i > 1; i--) {
            if (TripleTools.isTriple(i, pips)) {
                result += TripleTools.valueOfTriple(i, pips);
                //noinspection AssignmentToForLoopParameter
                i -= 2;
            }
        }

        return result;
    }
}
