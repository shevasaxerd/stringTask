package services;
import java.util.Scanner;

public class MainService {
    private StringService stringService;
    public MainService(){}
    public MainService(StringService stringService){
        this.stringService = stringService;
    }

    public void start() {

        String line;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line: ");
        line = scanner.nextLine();

        int check = 1;
        while (check != 13) {
            System.out.println("What do you want to do?");
            System.out.println("1. output a string character by its index\n" +
                    "2. output all characters of a string separated by a space\n" +
                    "3. expand a string\n" +
                    "4. add a new line to a string from the end and from the beginning\n" +
                    "5. output the number of characters in a string\n" +
                    "6. turn a string into an array of strings separated by the character entered by the user\n" +
                    "7. convert the entire string to upper case\n" +
                    "8. convert the entire string to lower case\n" +
                    "9. roll back changes one step back\n" +
                    "10. add the ability to save a string and the history of operations with it to a file in the format (date and time of the operation: name of the operation: value of the string before the operation: value of the string after the operation)\n" +
                    "11. output strings in the format (4 characters “space”4 characters “new line”)\n " +
                    "12. Enter a NEW line\n" +
                    "13. EXIT");

            int choise = scanner.nextInt();
            check = choise;

            if (choise == 1) {
                System.out.println("Enter a number of symbol: ");
                int index = scanner.nextInt();
                stringService.symbolByIndex(line, index);
            }
            if (choise == 2) {
                line = stringService.splitBySpace(line);
            }
            if (choise == 3) {
               line = stringService.reverse(line);
            }
            if (choise == 4) {
               line = stringService.addNewLine(line);
            }
            if (choise == 5) {
                stringService.numberOfCharacters(line);
            }
            if (choise == 6) {
                stringService.splitBySymbol(line);
            }
            if (choise == 7) {
                line = stringService.registerUp(line);
            }
            if (choise == 8) {
               line = stringService.registerDown(line);
            }
            if (choise == 9){

            }
            if (choise == 10){

            }
            if (choise == 11){

            }
            if (choise == 12){
                line = stringService.newLine();
            }

        }
    }

}
