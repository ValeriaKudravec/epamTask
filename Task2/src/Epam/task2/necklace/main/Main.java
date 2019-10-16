package Epam.task2.necklace.main;

import Epam.task2.necklace.model.Decor;
import Epam.task2.necklace.necklacefactory.NecklaceFactory;
import Epam.task2.necklace.necklacefactory.NecklaceSorter;
import Epam.task2.necklace.necklacefactory.NeclaceFilter;
import Epam.task2.necklace.neclacereader.NecklaceReader;
import Epam.task2.parser.Parser;
import Epam.task2.stonefactory.StoneFactory;

import Epam.task2.validator.Validator;


import java.util.List;


public class Main {
    static String fileName = "resources/resourcesFile.txt";
    public static void main(String[] args) {
        NecklaceReader necklaceReader = new NecklaceReader();
        List<String> stonesString = necklaceReader.readNecklaceFromFile(fileName);
        System.out.println(stonesString);
        NecklaceFactory necklaceFactory = new NecklaceFactory();
        Parser parser = new Parser();
        for (String line:stonesString){
            if(Validator.validate(line)) {
                necklaceFactory.add(new StoneFactory().makeStone(parser.parseLine(line)));
            }
        }
        NecklaceSorter necklaceSorter = new NecklaceSorter();
        necklaceSorter.sort(necklaceFactory);
        System.out.println("SORT");
        for (Decor irem:necklaceFactory.getNecklace()) {
            System.out.println(irem + "\n");

        }
        System.out.println("filtered");
        NeclaceFilter neclaceFilter = new NeclaceFilter();
        neclaceFilter.filter(necklaceFactory, 70, 300, 150, 300).
                forEach(item-> System.out.println(item));
    }
}
