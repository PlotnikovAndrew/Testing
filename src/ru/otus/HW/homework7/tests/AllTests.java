package ru.otus.HW.homework7.tests;

import ru.otus.HW.homework7.game.Player;
import ru.otus.HW.homework7.tests.unit.DiceImplTests;
import ru.otus.HW.homework7.tests.unit.GameTests;

public class AllTests {
    public static void main (String[] args){
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        DiceImplTests diceImplTests = new DiceImplTests();
        diceImplTests.testRollMethod();
        GameTests gameTests = new GameTests();
        gameTests.nullPlayerMethod(player1,player2);
        gameTests.equalDiceValueMethod(player1,player2);
        gameTests.higherNumberWin(player1,player2);

    }
}
