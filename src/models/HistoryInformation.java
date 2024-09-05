package models;

import java.time.LocalDateTime;

public class HistoryInformation {

    String oldString;
    String newString;
    java.time.LocalDateTime dateTimeOperation;
    String operationName;


    public HistoryInformation(String oldstring, String newstring, java.time.LocalDateTime dateTimeOperation, String operationName){
        this.oldString = oldstring;
        this.newString = newstring;
        this.dateTimeOperation = dateTimeOperation;
        this.operationName = operationName;
    }
    public HistoryInformation(){}


    public String getNewString() {
        return newString;
    }
    public void setNewString(String newString) {
        this.newString = newString;
    }
    public String getOldString() {
        return oldString;
    }
    public void setOldString(String oldString) {
        this.oldString = oldString;
    }
    public LocalDateTime getDateTimeOperation() {
        return dateTimeOperation;
    }
    public void setDateTimeOperation(LocalDateTime dateTimeOperation) {
        this.dateTimeOperation = dateTimeOperation;
    }
    public String getOperationName() {
        return operationName;
    }
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String toString() {
        return "{ " + dateTimeOperation  + ';' + operationName + ';' + oldString + ';' + newString + "} \n";
    }

}
