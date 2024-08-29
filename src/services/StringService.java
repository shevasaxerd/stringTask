package services;

import models.Line;

public interface StringService {
    public void symbolByIndex (Line line, int index);
    public void splitBySpace (Line line);
    public void reverse (Line line);
    public void addNewLine (Line line, String str1, String str2);
    public void numberOfCharacters (Line line);

}
