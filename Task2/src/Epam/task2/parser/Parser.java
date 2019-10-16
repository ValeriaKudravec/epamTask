package Epam.task2.parser;

public class Parser {
    public String[] parseLine(String line){
        String[] parseLine = line.split(";");
        return parseLine;
    }
}
