package com.github.premnirmal.sequences;

/**
 * Created by premnirmal on 9/10/14.
 */
public class SquareSequence implements NumberSequence<Long> {

    @Override
    public Long getNumber(int index) {
        return Long.valueOf(index * index);
    }
}
