package Epam.Task2.necklace.main;

import Epam.Task2.necklace.models.Decor;
import Epam.Task2.necklace.necklacefactory.NecklaceFactory;
import Epam.Task2.necklace.neclacereader.NecklaceReader;
import Epam.Task2.stoneFactory.StoneFactory;

import Epam.Task2.validation.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
                System.out.println(line);
            }
        }
        for (Decor irem:necklaceFactory.getNecklace()) {
            System.out.println(irem + "\n");

        }
        System.out.println("\\\\\\\\");
        necklaceFactory.sort();
        for (Decor irem:necklaceFactory.filter()
        ) {
            System.out.println(irem + "\n");

        }
        System.out.println("filtered");
        necklaceFactory.filter().forEach(item-> System.out.println(item+"\n"));
    }
}
