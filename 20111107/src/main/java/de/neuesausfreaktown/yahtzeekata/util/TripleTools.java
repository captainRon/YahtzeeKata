package de.neuesausfreaktown.yahtzeekata.util;

/** Description User: coellen Date: 16.11.11 Time: 07:36 */
public class TripleTools {
    public static int valueOfTriple(int i, int[] pips) {
        return pips[i] + pips[i - 1] + pips[i - 2];
    }

    public static boolean isTriple(int i, int[] pips) {
        return pips[i] == pips[i - 1] && pips[i] == pips[i - 2];
    }
}
