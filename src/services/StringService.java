package services;

import models.Line;

public interface StringService {
    public void symbolByIndex (Line line, int index);
    public void splitBySpace (Line line);
    public void reverse (Line line);
    public void addNewLine (Line line);
    public void numberOfCharacters (Line line);
    public void splitBySymbol (Line line);
    public void registerUp (Line line);
    public void registerDown (Line line);
    public void newLine(Line line);
}
