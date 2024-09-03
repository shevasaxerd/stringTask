package services;
import models.HistoryList;

import java.util.ArrayList;
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
        historyList.addString(line);

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

            int choice = inputDataService.inputInt();
            check = choice;

            if (choice == 1) {
                System.out.println("Enter a number of symbol: ");
                int index = inputDataService.inputInt();
                stringService.symbolByIndex(line, index);
            }
            if (choice == 2) {
                stringService.splitBySpace(line);
            }
            if (choice == 3) {
               line = stringService.reverse(line);
               historyList.addString(line);
            }
            if (choice == 4) {
               line = stringService.addNewLine(line);
                historyList.addString(line);
            }
            if (choice == 5) {
                stringService.numberOfCharacters(line);
            }
            if (choice == 6) {
                line = stringService.splitBySymbol(line);
                historyList.addString(line);
            }
            if (choice == 7) {
                line = stringService.registerUp(line);
                historyList.addString(line);
            }
            if (choice == 8) {
               line = stringService.registerDown(line);
                historyList.addString(line);
            }
            if (choice == 9){
                line = stringService.newFormat(line);
                historyList.addString(line);
            }
            if (choice == 10){

            }
            if (choice == 11){
                line = stringService.oneStepBack(line, historyList);
            }
            if (choice == 12){
                line = stringService.newLine();
                historyList.addString(line);
            }

        }
    }

}
