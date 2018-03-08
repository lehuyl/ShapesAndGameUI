package ca.cmpt213.as4.shapes;

public class Rectangle extends ShapeImpl {
    public Rectangle(int x, int y, int width, int height)
    {
        super(x,y,width,height);

    }

    /**
     * Check if the selected cell falls along the border of the shape
     * @param xPos X position of cell we want to test
     * @param yPos Y position of cell we want to test
     * @return Returns true if this cell is a border cell
     */
    @Override
    protected boolean isBorder(int xPos, int yPos) {
        boolean isInBorder = false;
        int topEdge = this.getLocationY();
        int bottomEdge = this.getLocationY() + this.getHeight() - 1 ;
        int leftEdge = this.getLocationX();
        int rightEdge = this.getLocationX() + this.getWidth() - 1 ;

        //works since this method is only passed coordinates inside shape
        if(xPos == leftEdge || xPos == rightEdge)
            isInBorder = true;
        else if(yPos == topEdge || yPos == bottomEdge)
            isInBorder = true;

        return isInBorder;
    }

    /**
     * Check if the selected cell falls inside the Shape
     * @param xPos X position of cell we want to test
     * @param yPos Y position of cell we want to test
     * @return Returns true if this cell is inside the Shape
     */
    @Override
    protected boolean isInside(int xPos, int yPos) {
        boolean isInside = false;
        int topEdge = this.getLocationY();
        int bottomEdge = this.getLocationY() + this.getHeight() - 1;
        int leftEdge = this.getLocationX();
        int rightEdge = this.getLocationX() + this.getWidth() - 1;

        for(int x = leftEdge + 1; x < rightEdge; x++)
        {
            for(int y = topEdge + 1; y < bottomEdge; y++)
            {
                if(x == xPos && y == yPos)
                {
                    isInside = true;
                }
            }
        }

        return isInside;
    }
}
