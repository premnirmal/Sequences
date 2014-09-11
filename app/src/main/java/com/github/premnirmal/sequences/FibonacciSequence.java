package com.github.premnirmal.sequences;

import android.util.SparseArray;

import java.math.BigInteger;

/**
 * Created by premnirmal on 9/10/14.
 */
public class FibonacciSequence implements NumberSequence<BigInteger> {

    private SparseArray<BigInteger> existingValues = new SparseArray<BigInteger>();

    @Override
    public BigInteger getNumber(int index) {
        if (existingValues.get(index) != null) {
            return existingValues.get(index);
        }
        BigInteger result;
        if (index <= 0) {
            result = BigInteger.ZERO;
        } else if (index == 1) {
            result = BigInteger.ONE;
        } else {
            result = getNumber(index - 2).add(getNumber(index - 1));
        }
        existingValues.put(index, result);
        cleanup(index - 11);
        return result;
    }

    /**
     * Don't wanna hold too many numbers in memory
     * @param index
     */
    private void cleanup(int index) {
        if (index >= 10) { // cleanup
            existingValues.removeAtRange(index, 10);
        }
    }

}
