package ru.otus.HW.homework7.tests.unit;

import ru.otus.HW.homework7.game.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO {
    public static void writer(Player player){
        File file = new File("src/ru/otus/HW/homework7/tests/result.txt");

        try(FileWriter writer = new FileWriter(file, false)) {
            String winnerName = player.getName();
            writer.write(winnerName);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static String readerResult(){
        File file = new File("src/ru/otus/HW/homework7/tests/result.txt");
        try(Scanner scanner = new Scanner(file);) {
            return scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
