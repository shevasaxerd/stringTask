package services;
import models.HistoryList;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainService {
    private StringService stringService;
    private InputDataService inputDataService;
    public MainService(){}
    public MainService(StringService stringService){
        this.stringService = stringService;
    }

    public MainService(StringService stringService, InputDataService inputDataService) {
        this.stringService = stringService;
        this.inputDataService = inputDataService;
    }

    public void start() {
        System.out.println("Enter a line: ");
        String line = inputDataService.inputString();

        HistoryList historyList = new HistoryList();


        String historyFile = "Format: TIME | operation name | string before | string after\n";
        historyList.addString(line, historyList);

        int check = 1;
        while (check != 13) {
            System.out.println("What do you want to do?\n" +
                    "1. output a string character by its index\n" +
                    "2. output all characters of a string separated by a space\n" +
                    "3. expand a string\n" +
                    "4. add a new line to a string from the end and from the beginning\n" +
                    "5. output the number of characters in a string\n" +
                    "6. turn a string into an array of strings separated by the character entered by the user\n" +
                    "7. convert the entire string to upper case\n" +
                    "8. convert the entire string to lower case\n" +
                    "9. output strings in the format (4 characters “space”4 characters “new line”)\n" +
                    "10. save a string and the history of operations to a file\n" +
                    "11. roll back changes one step back\n " +
                    "12. Enter a NEW line\n" +
                    "13. EXIT");


                try {
                    int choice = inputDataService.inputInt();
                    check = choice;

                    if (choice == 1) {
                        System.out.println("Enter a number of symbol: ");
                        int index = inputDataService.inputInt();
                        if (index > line.length()){
                            System.out.println("String is shortly!");
                        }
                       else {stringService.symbolByIndex(line, index);}
                    }
                    else if (choice == 2) {
                        stringService.splitBySpace(line);
                    }
                    else if (choice == 3) {
                        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
                        historyFile = historyFile + "{" + currentDateTime + "| EXPAND | " + line + " | ";
                        line = stringService.reverse(line);
                        historyFile = historyFile + line + "}" + " \n";
                        historyList.addString(line, historyList);
                    }
                    else if (choice == 4) {
                        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
                        historyFile = historyFile + "{" + currentDateTime + "| ADD TO THE END AND TO THE BEGINNING | " + line + " | ";
                        line = stringService.addNewLine(line);
                        historyFile = historyFile + line + "}" + " \n";
                        historyList.addString(line, historyList);
                    }
                    else if (choice == 5) {
                        stringService.numberOfCharacters(line);
                    }
                    else if (choice == 6) {
                        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
                        historyFile = historyFile + "{" + currentDateTime + "| SEPARATE BY USER SIMBOL | " + line + " | ";
                        line = stringService.splitBySymbol(line);
                        historyFile = historyFile + line + "}" + " \n";
                        historyList.addString(line, historyList );
                    }
                    else if (choice == 7) {
                        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
                        historyFile = historyFile + "{" + currentDateTime + "| CONVERT TO UPPER CASE | " + line + " | ";
                        line = stringService.registerUp(line);
                        historyFile = historyFile + line + "}" + " \n";
                        historyList.addString(line, historyList);
                    }
                    else if (choice == 8) {
                        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
                        historyFile = historyFile + "{" + currentDateTime + "| CONVERT TO LOWER CASE | " + line + " | ";
                        line = stringService.registerDown(line);
                        historyFile = historyFile + line + "}" + " \n";
                        historyList.addString(line, historyList);
                    }
                    else if (choice == 9) {
                        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
                        historyFile = historyFile + "{" + currentDateTime + "| CHANGE FORMAT | " + line + " | ";
                        line = stringService.newFormat(line);
                        historyFile = historyFile + line + "}" + " \n";
                        historyList.addString(line, historyList);
                    }
                    else if (choice == 10) {
                        try {
                            FileWriter writer = new FileWriter("historyOfString.txt", false);
                            writer.write(historyFile);
                            writer.close();
                            System.out.println("Writing to the file is successful");
                        } catch (IOException e) {
                            System.out.println("Error writing to file!");
                            e.printStackTrace();
                        }
                    }
                    else if (choice == 11) {
                        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
                        historyFile = historyFile + "{" + currentDateTime + "| ONE STEP BACK | " + line + " | ";
                        line = stringService.oneStepBack(line, historyList);
                        historyFile = historyFile + line + "}" + " \n";
                    }
                    else if (choice == 12) {
                        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
                        historyFile = historyFile + "{" + currentDateTime + "| INPUT NEW LINE | " + line + " | ";
                        line = stringService.newLine();
                        historyFile = historyFile + line + "}" + " \n";
                        historyList.addString(line, historyList);
                    }
                    else if (choice == 14) {
                        historyList.printHistoryList();
                    }
                        else {
                        System.out.println("Wrong choice!");
                    }

                } catch (InputMismatchException e){System.out.println("Wrong choice!!");}
                   catch (ArrayIndexOutOfBoundsException e) {System.out.println("Wrong choice!!!");}
        }
    }

}
