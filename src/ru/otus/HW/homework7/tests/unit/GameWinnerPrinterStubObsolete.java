package ru.otus.HW.homework7.tests.unit;

import ru.otus.HW.homework7.game.GameWinnerPrinter;
import ru.otus.HW.homework7.game.Player;
import static ru.otus.HW.homework7.tests.unit.IOObsolete.*;

public class GameWinnerPrinterStubObsolete implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        writer(winner);
    }
}
