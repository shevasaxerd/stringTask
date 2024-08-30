package services;

import java.util.Scanner;

public class InputDataImpl implements InputData{
    public String inputString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int inputInt() {
        return 0;
    }
}
