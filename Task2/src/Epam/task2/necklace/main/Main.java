package Epam.task2.necklace.main;

import Epam.task2.necklace.models.Decor;
import Epam.task2.necklace.necklacefactory.NecklaceFactory;
import Epam.task2.necklace.neclacereader.NecklaceReader;
import Epam.task2.stoneFactory.StoneFactory;

import Epam.task2.validation.Validator;

import java.util.List;


public class Main {
    static String fileName = "resources/resourcesFile.txt";
    public static void main(String[] args) {
        NecklaceReader necklaceReader = new NecklaceReader();
        List<String> stonesString = necklaceReader.readNecklaceFromFile(fileName);
        System.out.println(stonesString);
        NecklaceFactory necklaceFactory = new NecklaceFactory();

        for (String line:stonesString){
            if(Validator.validate(line)) {
                necklaceFactory.add(new StoneFactory().makeStone(line));
            }
        }
        for (Decor irem:necklaceFactory.getNecklace()) {
            System.out.println(irem + "\n");

        }
        System.out.println("\\\\\\\\");
        necklaceFactory.sort();
        for (Decor irem:necklaceFactory.getNecklace()) {
            System.out.println(irem + "\n");

        }
        System.out.println("filtered");
        necklaceFactory.filter().forEach(item-> System.out.println(item+"\n"));
    }
}
