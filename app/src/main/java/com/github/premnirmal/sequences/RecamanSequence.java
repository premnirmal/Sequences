package com.github.premnirmal.sequences;

import android.util.SparseBooleanArray;

/**
 * Created by premnirmal on 9/11/14.
 */
public class RecamanSequence implements NumberSequence<Integer> {

    private SparseBooleanArray previousValues = new SparseBooleanArray();

    @Override
    public Integer getNumber(int index) {
        if (index == 0) {
            return (int) 0;
        } else {
            Integer previous = getNumber(index - 1);
            if (previous - index > 0 && previousValues.get((previous - index)) == false) {
                previousValues.put((previous - index), true);
                return previous - index;
            } else {
                return previous + index;
            }
        }
    }
}
