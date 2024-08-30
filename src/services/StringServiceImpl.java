package services;


import java.util.Scanner;

public class StringServiceImpl implements StringService {

    public InputData inputData;
    public StringServiceImpl() {}
    public StringServiceImpl(InputData inputData){
        this.inputData = inputData;
    }


    public void symbolByIndex (String line, int index){
        String[] arr = line.split("");
        System.out.println(index + " element on line: " +"'" + arr[index-1] + "'");
    }
    public String splitBySpace (String line){
        String str ="";
        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i) + " ");
            str = str + line.charAt(i) + " ";
        }
                return str;

    }
    public String reverse (String line){
        String str = new StringBuilder(line).reverse().toString();
        System.out.println(str);
        return str;

    }
    public String addNewLine (String line){
        System.out.println("Enter a new line to beginning of the string: ");
        String str1 = inputData.inputString();

        System.out.println("Enter a new line to add to the end of the string: ");
        String str2 = inputData.inputString();

        String str = new StringBuilder(line).insert(0, str1).toString();
        str = new StringBuilder(str).insert(str.length(), str2).toString();
        System.out.println(str);
        return str;

    }
    public void numberOfCharacters (String line){
        System.out.println(line.length());
    }
    public void splitBySymbol (String line){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a separator symbol: ");
        String symbol = scanner1.nextLine();
                String[] arr = line.split(symbol);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

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
        Scanner scanner1 = new Scanner(System.in);
        String str;
        System.out.println("Enter a new line: ");
        str = scanner1.nextLine();
        return str;

    }



}
