package services;
import models.Line;

public class StringServiceImpl implements StringService {
    public void symbolByIndex (Line line, int index){
        String str = line.getLine();
        String[] arr = str.split("");
        System.out.println(arr[index]);
    }
}
