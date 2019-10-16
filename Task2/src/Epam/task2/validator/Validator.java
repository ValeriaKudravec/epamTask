package Epam.task2.validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static boolean validate(String line) {

        try (Scanner scanner = new Scanner(line).useDelimiter(";")) {

            switch (line.split(";")[0].toLowerCase()) {
                case "diamond": {
                    Pattern pattern = Pattern.compile("diamond;\\d+;\\d+;\\d+\\.\\d+;rare;\\d+");
                    Matcher matcher = pattern.matcher(line.toLowerCase());
                    Pattern pattern1 = Pattern.compile("diamond;\\d+;\\d+;\\d+\\.\\d+;averange;\\d+");
                    Matcher matcher1 = pattern1.matcher(line.toLowerCase());
                    Pattern pattern2 = Pattern.compile("diamond;\\d+;\\d+;\\d+\\.\\d+;common;\\d+");
                    Matcher matcher2 = pattern2.matcher(line.toLowerCase());
                    if(matcher.find()){
                        return true;
                    }
                    if(matcher1.find()){
                        return true;
                    }
                    if(matcher2.find()){
                        return true;
                    }
                    else {
                        System.out.println(false);
                        return false;
                    }
                }
                case "emerald": {
                    Pattern pattern = Pattern.compile("emerald;\\d+;\\d+;\\d+\\.\\d+;rare;\\d+");
                    Matcher matcher = pattern.matcher(line.toLowerCase());
                    Pattern pattern1 = Pattern.compile("emerald;\\d+;\\d+;\\d+\\.\\d+;averange;\\d+");
                    Matcher matcher1 = pattern1.matcher(line.toLowerCase());
                    Pattern pattern2 = Pattern.compile("emerald;\\d+;\\d+;\\d+\\.\\d+;common;\\d+");
                    Matcher matcher2 = pattern2.matcher(line.toLowerCase());
                    if(matcher.find()){
                        return true;
                    }
                    if(matcher1.find()){
                        return true;
                    }
                    if(matcher2.find()){
                        return true;
                    }
                    else {
                        System.out.println(false);
                        return false;
                    }
                }
                case "ruby": {
                    Pattern pattern = Pattern.compile("ruby;\\d+;\\d+;\\d+\\.\\d+;rare;\\d+");
                    Matcher matcher = pattern.matcher(line.toLowerCase());
                    Pattern pattern1 = Pattern.compile("ruby;\\d+;\\d+;\\d+\\.\\d+;averange;\\d+");
                    Matcher matcher1 = pattern1.matcher(line.toLowerCase());
                    Pattern pattern2 = Pattern.compile("ruby;\\d+;\\d+;\\d+\\.\\d+;common;\\d+");
                    Matcher matcher2 = pattern2.matcher(line.toLowerCase());
                    if(matcher.find()){
                        return true;
                    }
                    if(matcher1.find()){
                        return true;
                    }
                    if(matcher2.find()){
                        return true;
                    }
                    else {
                        System.out.println(false);
                        return false;
                    }
                }
                case "pearl": {
                    Pattern pattern = Pattern.compile("pearl;\\d+;\\d+;sea;");
                    Matcher matcher = pattern.matcher(line.toLowerCase());
                    Pattern pattern1 = Pattern.compile("ruby;\\d+;\\d+;river;");
                    Matcher matcher1 = pattern1.matcher(line.toLowerCase());
                    if(matcher.find()){
                        return true;
                    }
                    if(matcher1.find()){
                        return true;
                    }
                    else {
                        System.out.println(false);
                        return false;
                    }
                }
                case "syntetic diamond": {
                    Pattern pattern = Pattern
                            .compile("syntetic diamond;\\d+;\\d+;\\d+\\.\\d+;\\d+;");
                    Matcher matcher = pattern.matcher(line.toLowerCase());
                    if(matcher.find()){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                case "syntetic emerald": {
                    Pattern pattern = Pattern
                            .compile("syntetic emerald;\\d+;\\d+;\\d+\\.\\d+;\\d+;");
                    Matcher matcher = pattern.matcher(line.toLowerCase());
                    if(matcher.find()){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                case "syntetic ruby": {
                    Pattern pattern = Pattern
                            .compile("syntetic ruby;\\d+;\\d+;\\d+\\.\\d+;\\d+;");
                    Matcher matcher = pattern.matcher(line.toLowerCase());
                    if(matcher.find()){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                case "amber": {
                    Pattern pattern = Pattern
                            .compile("amber;\\d+;\\d+;\\d+\\.\\d+;\\d+;");
                    Matcher matcher = pattern.matcher(line.toLowerCase());
                    if(matcher.find()){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                default: {
                    return false;
                }
            }
        } catch (Exception e){
            return false;
        }
    }
}
