package com.github.premnirmal.sequences;

import android.util.LongSparseArray;

/**
 * Created by premnirmal on 9/11/14.
 */
public class RecamanSequence implements NumberSequence<Long> {

    private LongSparseArray<Long> previousValues = new LongSparseArray<Long>();

    @Override
    public Long getNumber(int index) {
        if (index == 0) {
            return (long) 0;
        } else {
            Long previous = getNumber(index - 1);
            if (previousValues.get(previous - index) != null) {
                return previous - index;
            } else {
                return previous + index;
            }
        }
    }
}
