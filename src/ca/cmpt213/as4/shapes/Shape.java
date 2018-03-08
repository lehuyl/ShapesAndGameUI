package ca.cmpt213.as4.shapes;

import ca.cmpt213.as4.UI.Canvas;

import java.awt.Color;

public interface Shape{
    public int getLocationX();
    public int getLocationY();
    public void setBorderChar(char borderChar);
    public char getBorderChar();
    public void setColor(Color color);
    public Color getColor();
    public void draw(Canvas canvas);
}
