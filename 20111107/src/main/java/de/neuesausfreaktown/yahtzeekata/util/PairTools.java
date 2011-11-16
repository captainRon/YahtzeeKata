package de.neuesausfreaktown.yahtzeekata.util;

import java.util.Collection;
import java.util.List;

@SuppressWarnings({"UtilityClass", "SuppressionAnnotation"})
public class PairTools {
    private PairTools() { // Prevents sub-classing
    }

    public static int valueOfPair(int i, int[] pips) {
        return pips[i] + pips[i - 1];
    }

    public static boolean isPair(int i, int[] pips) {
        return pips[i] == pips[i-1];
    }

    public static boolean isPair(int startPosition, Collection<Integer> list) {
        int[] array = new int[list.size()];
        int i = 0;
        for (Integer item : list) {
            array[i] = item;
            i++;
        }

        return isPair(startPosition, array);
    }
}
