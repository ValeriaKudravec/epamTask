package Epam.Task2.Main;

import Epam.Task2.neclacereader.NecklaceReader;
import Epam.Task2.necklacefactory.NecklaceFactory;
import Epam.Task2.stones.Decor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NecklaceReader necklaceReader = new NecklaceReader();
        List<String> stonesString = necklaceReader.readNecklaceFromFile("input/InputFile.txt");
        System.out.println(stonesString);
        NecklaceFactory necklaceFactory = new NecklaceFactory();
        List<Decor> listOfDecor = necklaceFactory.makeListOfStones(stonesString);
        for (Decor irem:listOfDecor
             ) {
            System.out.println(irem + "\n");

        }
        System.out.println("\\\\\\\\");
        necklaceFactory.sort(listOfDecor);
        for (Decor irem:listOfDecor
        ) {
            System.out.println(irem + "\n");

        }
        System.out.println("filtered");
        necklaceFactory.filter(listOfDecor).forEach(item-> System.out.println(item+"\n"));
    }
}
