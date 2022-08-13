package ru.pda;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected PrimitiveIterator.OfInt random;

    public Randoms(int min, int max) {
        random = new Random().ints(min, max +1).iterator();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;//всегда true для бесконечности
            }

            @Override
            public Integer next() {
                return random.nextInt();//возвращаем следующее сгенерированное число
            }
        };
    }
}
