package ru.otus.HW.homework7.tests.unit;

import ru.otus.HW.homework7.game.DiceImpl;

import static ru.otus.HW.homework7.assertions.Assertions.*;

public class DiceImplTests {

    public void testRollMethod(){
        String scenario = "Тест выбрасывания кубика";
        DiceImpl dice = new DiceImpl();
        try{
            for (int i = 0; i < 10; i++) {
                int rollTest = dice.roll();
                assertRollMethod(rollTest);
            }
            System.out.printf("\"%s\" passed %n", scenario);
        }catch (Throwable e){
            System.err.printf("\"%s\" fails with message \"%s\" %n" , scenario, e.getMessage());
        }
    }
}
