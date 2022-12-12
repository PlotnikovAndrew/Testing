package ru.otus.HW.homework7.tests.unit;

import ru.otus.HW.homework7.game.Dice;

import java.util.concurrent.atomic.AtomicInteger;

public class DiceHigherNumberWin implements Dice {
    private static AtomicInteger atomicInteger = new AtomicInteger();
    @Override
    public int roll(){
        return atomicInteger.incrementAndGet();
    }

    public static int getValue(){
        return atomicInteger.get();
    }
}
