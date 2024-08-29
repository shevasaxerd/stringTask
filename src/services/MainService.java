package services;
import models.Line;
import java.util.Scanner;

public class MainService {
    private StringService stringService;
    public MainService(){}
    public MainService(StringService stringService){
        this.stringService = stringService;
    }

    public void start(){
        Line line = new Line();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line: ");
        line.setLine(scanner.nextLine());
        System.out.println("Enter a number of symbol: ");
        int index = scanner.nextInt();
        stringService.symbolByIndex(line, index);
    }

}
