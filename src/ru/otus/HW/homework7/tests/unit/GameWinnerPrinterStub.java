package ru.otus.HW.homework7.tests.unit;

import ru.otus.HW.homework7.game.GameWinnerConsolePrinter;
import ru.otus.HW.homework7.game.Player;

public class GameWinnerPrinterStub extends GameWinnerConsolePrinter {
    private static String input;
    @Override
    public void printWinner(Player winner) {
        input = winner.getName();
    }

    public static String getWinnerName(){
        return input;
    }
}
