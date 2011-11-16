package de.neuesausfreaktown.yahtzeekata;

import de.neuesausfreaktown.yahtzeekata.util.PairTools;
import de.neuesausfreaktown.yahtzeekata.util.TripleTools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("SuppressionAnnotation")
public enum FullHouseRank implements RankCalculator {
    FULLHOUSE;

    @Override
    public int calculateScore(int... pips) {
        //noinspection ConstantConditions
        assert pips != null && pips.length == 5;

        Arrays.sort(pips);
        int result = 0;
        int foundNumber = 0;
        List<Integer> rest = new ArrayList<Integer>(2);
        for (int i = pips.length - 1; i > 2; i--) {
            if (TripleTools.isTriple(i, pips)) {
                result += TripleTools.valueOfTriple(i, pips);
                foundNumber = result / 3;
                for (int pip : pips) {
                    if (pip != foundNumber) {
                        rest.add(pip);
                    }
                }
                //noinspection AssignmentToForLoopParameter
                i -= 2;
                //noinspection BreakStatement
                break;
            }
        }
        int retVal;
        if (PairTools.isPair(0, rest))  {
            retVal = 25;
        } else {
            retVal = 0;
        }
        return retVal;
    }
}
