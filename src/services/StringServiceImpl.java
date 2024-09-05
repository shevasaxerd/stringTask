package services;
import models.HistoryInformation;
import models.HistoryList;

import java.util.Scanner;

public class StringServiceImpl implements StringService {

    public InputDataService inputDataService;
    public StringServiceImpl() {}
    public StringServiceImpl(InputDataService inputDataService){
        this.inputDataService = inputDataService;

    }



    public void symbolByIndex (String line, int index){
        String[] arr = line.split("");
        System.out.println(index + " element on line: " +"'" + arr[index-1] + "'");
    }
    public void splitBySpace (String line){
        String str ="";
        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i) + " ");
            str = str + line.charAt(i) + " ";
        }


    }
    public String reverse (String line){
        String str = new StringBuilder(line).reverse().toString();
        System.out.println(str);
        return str;

    }
    public String addNewLine (String line){
        String str1;
        System.out.println("Enter a new line to beginning of the string: ");
        str1 = inputDataService.inputString();

        String str2 = "";
        System.out.println("Enter a new line to add to the end of the string: ");
        str2 = inputDataService.inputString();

        String str = new StringBuilder(line).insert(0, str1).toString();
        str = new StringBuilder(str).insert(str.length(), str2).toString();
        System.out.println(str);
        return str;

    }
    public void numberOfCharacters (String line){
        System.out.println(line.length());
    }
    public String splitBySymbol (String line){

        System.out.println("Enter a separator symbol: ");
        String symbol = inputDataService.inputString();
        boolean flag = true;
        String text = "";
        line = line.replaceAll(symbol, " ");
        while (flag) {
            text = line.replaceAll(" {2}", " ");
            if (text.length() == line.length()){
                flag = false;
            } else line = text;
        }
          String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        return text;
    }
    public String registerUp (String line){
        System.out.println(line.toUpperCase());
        return line.toUpperCase();
    }
    public String registerDown (String line){
        System.out.println(line.toLowerCase());
        return line.toLowerCase();
    }
    public String newLine(){
        System.out.println("Enter a new line: ");
        return inputDataService.inputString();

    }
    public String newFormat(String line){

        String str = line.replaceAll(" ", "");
        StringBuilder str1 = new StringBuilder(str);
        for (int i=4; i<str1.length(); i=i+9){
            str1.insert(i, " ");
        }
        for (int i=9; i<str1.length(); i=i+10){
            str1.insert(i, "\n");
        }
        System.out.println(str1);
        return str1.toString();
    }
    public String oneStepBack(String line, HistoryList historyList) {
        HistoryInformation[] arr = historyList.getInformation();
        line = arr[historyList.getCurrent() - 1].getOldString();
        historyList.setCurrent(historyList.getCurrent() - 1);
        System.out.println(line);
        return line;
    }
    public String oneStepForward(String line, HistoryList historyList){
        HistoryInformation[] arr = historyList.getInformation();
        line = arr[historyList.getCurrent() + 1].getOldString();
        historyList.setCurrent(historyList.getCurrent() +1);
        System.out.println(line);
        return line;
    }
}
