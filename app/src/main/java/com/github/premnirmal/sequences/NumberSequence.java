package com.github.premnirmal.sequences;

/**
 * Created by premnirmal on 9/10/14.
 */
public interface NumberSequence<T extends Number> {

    T getNumber(int index);

}
