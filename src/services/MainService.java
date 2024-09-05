package services;
import models.HistoryInformation;
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



        //String historyFile = "Format: TIME | operation name | string before | string after\n";

        int check = 1;
        while (check != 15) {
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
                    "11. step back\n " +
                    "12. step forward\n" +
                    "13. Enter a NEW line\n" +
                    "14. print the history of operations\n" +
                    "15. EXIT");


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
                        HistoryInformation historyInformation = new HistoryInformation();
                        historyInformation.setDateTimeOperation(java.time.LocalDateTime.now());
                        historyInformation.setOperationName("EXPAND");
                        historyInformation.setOldString(line);
                        line = stringService.reverse(line);
                        historyInformation.setNewString(line);

                        historyList.addString(historyInformation);
                    }
                    else if (choice == 4) {
                        HistoryInformation historyInformation = new HistoryInformation();
                        historyInformation.setDateTimeOperation(java.time.LocalDateTime.now());
                        historyInformation.setOperationName("ADD TO THE END AND TO THE BEGINNING");
                        historyInformation.setOldString(line);
                        line = stringService.addNewLine(line);
                        historyInformation.setNewString(line);

                        historyList.addString(historyInformation);
                    }
                    else if (choice == 5) {
                        stringService.numberOfCharacters(line);
                    }
                    else if (choice == 6) {
                        HistoryInformation historyInformation = new HistoryInformation();
                        historyInformation.setDateTimeOperation(java.time.LocalDateTime.now());
                        historyInformation.setOperationName("SEPARATE BY USER SYMBOL");
                        historyInformation.setOldString(line);
                        line = stringService.splitBySymbol(line);
                        historyInformation.setNewString(line);

                        historyList.addString(historyInformation);
                    }
                    else if (choice == 7) {
                        HistoryInformation historyInformation = new HistoryInformation();
                        historyInformation.setDateTimeOperation(java.time.LocalDateTime.now());
                        historyInformation.setOperationName("CONVERT TO UPPER CASE");
                        historyInformation.setOldString(line);
                        line = stringService.registerUp(line);
                        historyInformation.setNewString(line);

                        historyList.addString(historyInformation);
                    }
                    else if (choice == 8) {
                        HistoryInformation historyInformation = new HistoryInformation();
                        historyInformation.setDateTimeOperation(java.time.LocalDateTime.now());
                        historyInformation.setOperationName("CONVERT TO LOWER CASE");
                        historyInformation.setOldString(line);
                        line = stringService.registerDown(line);
                        historyInformation.setNewString(line);

                        historyList.addString(historyInformation);
                    }
                    else if (choice == 9) {
                        HistoryInformation historyInformation = new HistoryInformation();
                        historyInformation.setDateTimeOperation(java.time.LocalDateTime.now());
                        historyInformation.setOperationName("CHANGE FORMAT");
                        historyInformation.setOldString(line);
                        line = stringService.newFormat(line);
                        historyInformation.setNewString(line);

                        historyList.addString(historyInformation);
                    }
                    else if (choice == 10) {
                        historyList.addToFile();}
                    else if (choice == 11) {
                        line = stringService.oneStepBack(line, historyList);
                    }
                    else if (choice == 12) {
                        line = stringService.oneStepForward(line, historyList);
                    }
                    else if (choice == 13) {
                        HistoryInformation historyInformation = new HistoryInformation();
                        historyInformation.setDateTimeOperation(java.time.LocalDateTime.now());
                        historyInformation.setOperationName("INPUT NEW LINE");
                        historyInformation.setOldString(line);
                        line = stringService.newLine();
                        historyInformation.setNewString(line);

                        historyList.addString(historyInformation);
                    }
                    else if (choice == 14) {
                        historyList.printHistoryList();
                    }
                        else {
                        System.out.println("Wrong choice!");
                    }

                } catch (InputMismatchException e){System.out.println("Wrong choice!!");}
                catch (NullPointerException | ArrayIndexOutOfBoundsException e) {System.out.println("You have gone beyond the acceptable limits!!!");}
        }
    }

}
