package ca.cmpt213.as4.shapes;

public class Triangle extends ShapeImpl {
    public Triangle(int x, int y, int size)
    {
        super(x,y,size);
    }

    protected boolean isBorder(int xPos, int yPos)
    {
        boolean isBorder = false;
        int leftEdge = this.getLocationX();
//        int rightEdge = this.getLocationX() + this.getWidth() - 1;
        int rightEdge = this.getLocationX();
        int topEdge = this.getLocationY();
        int bottomEdge = this.getLocationY() + this.getHeight() - 1;

        //Check Left and Bottom Edge
        if(xPos == leftEdge)
        {
            isBorder = true;
        }
        else if(yPos == bottomEdge)
        {
            isBorder = true;
        }
        else
        {
            for(int y = topEdge; y < bottomEdge; y++)
            {
                for(int x = leftEdge; x <= rightEdge; x++)
                {
                    if(x == xPos && y == yPos && !isInside(x,y))
                    {
                        isBorder = true;
                    }
                }
                rightEdge++;
            }
        }

        return isBorder;
    }

    @Override
    protected boolean isInside(int xPos, int yPos) {
        boolean isInside = false;
        int topEdge = this.getLocationY();
        int bottomEdge = this.getLocationY() + this.getHeight() - 1;
        int leftEdge = this.getLocationX();
        int rightEdge = this.getLocationX();

        for(int y = topEdge; y < bottomEdge; y++)
        {
            for(int x = leftEdge; x < rightEdge; x++)
            {
                if(x == xPos && y == yPos)
                {
                    isInside = true;
                }
            }
            rightEdge++;
        }

        return isInside;
    }
}
