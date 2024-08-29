package services;
import models.Line;

public class StringServiceImpl implements StringService {
    public void symbolByIndex (Line line, int index){
        String str = line.getLine();
        String[] arr = str.split("");
        System.out.printf(index + " element on line: " + arr[index+1]);
    }
    public void splitBySpace (Line line){
        String str = line.getLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
    public void reverse (Line line){
        String str = new StringBuilder(line.getLine()).reverse().toString();
        System.out.println(str);
        line.setLine(str);
    }
    public void addNewLine (Line line, String str1, String str2){
        String str = str1  + line.getLine() + str2;
        System.out.println(str);
        line.setLine(str);
    }
    public void numberOfCharacters (Line line){
        String str = line.getLine();
        System.out.println(str.length());
    }



}
