package de.neuesausfreaktown.yatzeekata;

import org.jetbrains.annotations.NotNull;

/**
 * Created by IntelliJ IDEA. User: coellen Date: 07.11.11 Time: 22:03 To change this template use File | Settings | File
 * Templates.
 */
public interface RankCalculator {
    int calculateScore(@NotNull int... pips);
}
