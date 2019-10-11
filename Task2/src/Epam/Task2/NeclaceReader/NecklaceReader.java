package Epam.Task2.NeclaceReader;

import Epam.Task2.stones.Decor;
import Epam.Task2.stones.stones.naturalstones.Diamond;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NecklaceReader {
    public List<String> readNecklaceFromFile(String fileName){
        List<String> stonesString = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()){
                stonesString.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return stonesString;
    }
}
