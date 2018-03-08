package ca.cmpt213.as4.shapes;

import ca.cmpt213.as4.UI.Canvas;

import java.awt.*;

public abstract class ShapeImpl implements Shape{
    private int LocationX;
    private int LocationY;
    private Color color;
    private char borderChar;
    private int height;
    private int width;

    //Rectangle
    public ShapeImpl(int x, int y, int width, int height)
    {
        //DEFAULT SETTINGS
        this.color = Color.YELLOW ;
        this.borderChar = '*';
        this.LocationX = x;
        this.LocationY = y;
        this.height = height;
        this.width = width;
    }

    //Triangle
    public ShapeImpl(int x, int y, int size)
    {
        //DEFAULT SETTINGS
        this.color = Color.YELLOW ;
        this.borderChar = '*';
        this.LocationX = x;
        this.LocationY = y;
        this.height = size;
        this.width = size;
    }

    public int getLocationX() {
        return LocationX;
    }

    public void setLocationX(int locationX) {
        this.LocationX = locationX;
    }

    public int getLocationY() {
        return LocationY;
    }

    public void setLocationY(int locationY) {
        this.LocationY = locationY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public char getBorderChar() {
        return borderChar;
    }

    public void setBorderChar(char borderChar) {
        this.borderChar = borderChar;
    }

    protected int getHeight()
    {
        return this.height;
    }

    protected int getWidth()
    {
        return this.width;
    }

    public void draw(Canvas canvas)
    {
        int leftEdge = this.getLocationX();
        int topEdge = this.getLocationY();
        int rightEdge = this.getLocationX() + this.getWidth();
        int bottomEdge = this.getLocationY() + this.getHeight();

        //only tests coordinates inside shape
        for(int x = leftEdge; x < rightEdge; x++)
        {
            for(int y = topEdge; y < bottomEdge; y++)
            {
                if(isBorder(x,y))
                {
                    canvas.setCellText(x,y,this.getBorderChar());
                    canvas.setCellColor(x,y,this.getColor());
                }
                else if(isInside(x,y))
                {
                    canvas.setCellText(x,y,' ');
                    canvas.setCellColor(x,y,this.getColor());
                }
            }
        }
    }

    protected abstract boolean isBorder(int xPos, int yPos);
    protected abstract boolean isInside(int xPos, int yPos);
}
