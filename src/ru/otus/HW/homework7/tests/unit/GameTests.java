package ru.otus.HW.homework7.tests.unit;

import ru.otus.HW.homework7.game.*;

import static ru.otus.HW.homework7.assertions.Assertions.*;
import static ru.otus.HW.homework7.tests.unit.DiceHigherNumberWin.*;
import static ru.otus.HW.homework7.tests.unit.IO.*;


public class GameTests {
    public void equalDiceValueMethod(Player player1, Player player2) {
        String scenario = "Тест на равные значения кубиков";

        DiceEqualValueTests diceTest = new DiceEqualValueTests();
        GameWinnerPrinterTest winnerPrinterTest = new GameWinnerPrinterTest();
        Game game = new Game(diceTest, winnerPrinterTest);
        game.playGame(player1, player2);
        String input = readerResult();
        try {
            assertEqualDiceValue(input, player1, player2);
            System.out.printf("\"%s\" passed %n", scenario);
        }catch (Throwable e){
            System.err.printf("\"%s\" fails with message \"%s\" %n" , scenario, e.getMessage());
        }
    }

    public void nullPlayerMethod(Player player1, Player player2) {
        String scenario = "Тест на нулевое значение игрока";

        DiceImpl dice = new DiceImpl();
        GameWinnerPrinterTest winnerPrinterTest = new GameWinnerPrinterTest();
        Game game = new Game(dice, winnerPrinterTest);
        try {
            for (int i = 0; i < 10; i++){
                game.playGame(player1, player2);
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (NullPointerException e){
            try {
                assertNullPlayer();
            }catch (Throwable ex){
                System.err.printf("\"%s\" fails with message \"%s\" %n" , scenario, ex.getMessage());
            }
        }
    }

    public void higherNumberWin(Player player1, Player player2){
        String scenario = "Тест <<Большее значение - выигрывает>>";
        DiceHigherNumberWin diceHigherNumberWin = new DiceHigherNumberWin();
        GameWinnerPrinterTest winnerPrinterTest = new GameWinnerPrinterTest();
        Game game = new Game(diceHigherNumberWin, winnerPrinterTest);
        game.playGame(player1, player2);
        String input = readerResult();
        int valueFirstPlayer = getValue();
        int valueSecondPlayer = getValue() + 1;
        try{
            assertHigherValueWin(input,player1, player2, valueFirstPlayer, valueSecondPlayer);
            System.out.printf("\"%s\" passed %n", scenario);
        }catch (Throwable e){
            System.err.printf("\"%s\" fails with message \"%s\" %n" , scenario, e.getMessage());
        }
    }


}
