package models;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class HistoryList {
    private HistoryInformation[] information;
    private int index;
    private int current;

   public HistoryList(){
       this.information = new HistoryInformation[5];
       this.index = 0;
       this.current = 0;
   }
    public HistoryList(HistoryInformation[] information, int index, int current){
        this.information = information;
        this.index = index;
        this.current = current;
    }

    public void setCurrent(int current){
       this.current = current;
    }

    public int getCurrent() {
        return current;
    }

    public HistoryInformation[] getInformation() {
        return information;
    }

    public void setInformation(HistoryInformation[] information) {
        this.information = information;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void addString(HistoryInformation information){
        if (index < this.information.length){
            this.information[index] = information;
            index++; current++;}
        else {
            HistoryInformation[] string1 = new HistoryInformation[index];

            for (int i = 0; i < this.information.length; i++){
                string1[i] = this.information[i];
            }
            this.information = new HistoryInformation[index+10];
            for (int i = 0; i < string1.length; i++){
                this.information[i] = string1[i];
            } this.information[index] = information;
            index++; current++;
        }
    }

    public void printHistoryList() {
       for (int i = 0; i<index; i++){
       System.out.println(information[i].toString());
    }}

    public void addToFile (){
        try {
            FileWriter writer = new FileWriter("historyOfString.txt", false);
            for (int i = 0; i<index; i++){
            writer.write(information[i].toString()); }
            writer.close();
            System.out.println("Writing to the file is successful");
        } catch (IOException e) {
            System.out.println("Error writing to file!");
            e.printStackTrace();
        }
    }
}
