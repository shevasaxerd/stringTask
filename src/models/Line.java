package models;

import java.util.Objects;

public class Line {
    private String line;
    private int index;



    public Line (){}
    public Line (String line, int index){
        this.line = line;
        this.index = index;
    }
    public String getLine() {
        return line;
    }
    public void setLine(String line) {
        this.line = line;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    @Override
    public String toString() {
        return "Line{" +
                "line='" + line + '\'' +
                ", size=" + index +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line1 = (Line) o;
        return index == line1.index && Objects.equals(line, line1.line);
    }
    @Override
    public int hashCode() {
        return Objects.hash(line, index);
    }

}
