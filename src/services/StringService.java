package services;

import models.HistoryList;

public interface StringService {
    public void symbolByIndex (String line, int index);
    public void splitBySpace (String line);
    public String reverse (String line);
    public String addNewLine (String line);
    public void numberOfCharacters (String line);
    public String splitBySymbol (String line);
    public String registerUp (String line);
    public String registerDown (String line);
    public String newLine();
    public String newFormat(String line);
    public String oneStepBack (String line, HistoryList historyList);
    public String oneStepForward (String line, HistoryList historyList);
}
