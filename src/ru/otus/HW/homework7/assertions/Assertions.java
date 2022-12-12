package ru.otus.HW.homework7.assertions;

import ru.otus.HW.homework7.game.Player;
import java.util.Objects;

public class Assertions {
    public static void assertRollMethod(int expected){
        if (expected < 1 || expected > 6){
            throw new AssertionError(String.format("Expected 1 <= %d <= 6", expected));
        }
    }

    public static void assertEqualDiceValue(String nameWinner, Player player1, Player player2){
        if (Objects.equals(nameWinner, player1.getName()) || Objects.equals(nameWinner, player2.getName())){
            throw new AssertionError("Expected <draw>");
        }
    }

    public static void assertNullPlayer(){
        throw new AssertionError("Expected Player != null");
    }

    public static void assertHigherValueWin(String nameWinner, Player player1, Player player2, int valueFirstPlayer, int valueSecondPlayer){
        if ((valueFirstPlayer > valueSecondPlayer && Objects.equals(nameWinner, player2.getName()))
                || (valueSecondPlayer > valueFirstPlayer && Objects.equals(nameWinner, player1.getName()))){
            throw new AssertionError("Expected The player with the highest value lost");
        }
    }


}
