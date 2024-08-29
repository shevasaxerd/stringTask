package services;
import models.Line;

import java.util.Scanner;

public class StringServiceImpl implements StringService {
    public void symbolByIndex (Line line, int index){
        String str = line.getLine();
        String[] arr = str.split("");
        System.out.println(index + " element on line: " +"'" + arr[index-1] + "'");
    }
    public void splitBySpace (Line line){
        String str = line.getLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        line.setLine(str);
    }
    public void reverse (Line line){
        String str = new StringBuilder(line.getLine()).reverse().toString();
        System.out.println(str);
        line.setLine(str);
    }
    public void addNewLine (Line line){
        Scanner scanner1 = new Scanner(System.in);
        String str1;
        String str2;
        System.out.println("Enter a new line to beginning of the string: ");
        str1 = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter a new line to add to the end of the string: ");
        str2 = scanner2.nextLine();
        String str = str1  + line.getLine() + str2;
        System.out.println(str);
        line.setLine(str);
    }
    public void numberOfCharacters (Line line){
        String str = line.getLine();
        System.out.println(str.length());
    }
    public void splitBySymbol (Line line){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a separator symbol: ");
        String symbol = scanner1.nextLine();
        String str = line.getLine();
        String[] arr = str.split(symbol);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    public void registerUp (Line line){
        String str = line.getLine();
        System.out.println(str.toUpperCase());
        line.setLine(str.toUpperCase());
    }
    public void registerDown (Line line){
        String str = line.getLine();
        System.out.println(str.toLowerCase());
        line.setLine(str.toLowerCase());
    }
    public void newLine(Line line){
        Scanner scanner1 = new Scanner(System.in);
        String str1;
        System.out.println("Enter a new line: ");
        str1 = scanner1.nextLine();
        line.setLine(str1);
    }



}
