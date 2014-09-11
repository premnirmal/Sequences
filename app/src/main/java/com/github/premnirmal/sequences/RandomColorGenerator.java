package com.github.premnirmal.sequences;

import android.graphics.Color;

/**
 * Created by premnirmal on 9/10/14.
 */
public final class RandomColorGenerator {

    private RandomColorGenerator() {
    }

    public static int randomRGB(){
        return (int) (Math.random()*255);
    }

    public static int getRandomColorInt(){
        return Color.argb(255, randomRGB(), randomRGB(), randomRGB());
    }
}
