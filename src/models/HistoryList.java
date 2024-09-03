package models;
import java.util.ArrayList;
import java.util.Arrays;

public class HistoryList {
    private String[] string;
    private int index;

   public HistoryList(){
       this.string = new String[5];
       this.index = 0;
   }
    public HistoryList(String[] string, int index){
        this.string = string;
        this.index = index;
    }

    public String[] getString() {
        return string;
    }

    public void setString(String[] string) {
        this.string = string;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void addString(String newString){
       string[index] = newString;
       index++;
    }

    public String removeString(){
       string[index-1] = null;
       index--;
       System.out.println(string[index-1]);
       return string[index-1];
    }
    public String get(int index){
       return string[index];
    }


    public void printHistoryList() {
       for (int i = 0; i < string.length; i++) {
           System.out.println(string[i]);
       }
    }

}
