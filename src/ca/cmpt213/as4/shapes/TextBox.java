package ca.cmpt213.as4.shapes;

import ca.cmpt213.as4.UI.Canvas;

public class TextBox extends Rectangle {
    private String message;
    public TextBox(int x, int y, int width, int height, String text) {
        super(x, y, width, height);
        this.message = text;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int leftEdge = this.getLocationX() + 1;
        int rightEdge = this.getLocationX() + getWidth() - 1;
        int topEdge = this.getLocationY();
        int bottomEdge = this.getLocationY() + this.getHeight() - 1;

        char[] charArray = message.toCharArray();
        int messageCounter = 0;
        int messageLimit = charArray.length;
        for(int y = topEdge; y < bottomEdge; y++)
        {
            for(int x = leftEdge; x < rightEdge; x++)
            {
                if(isBorder(x,y))
                {
                    //do nothing
                }
                else
                {
                    if(messageCounter < messageLimit) {
                        canvas.setCellText(x, y, charArray[messageCounter]);
                        messageCounter++;
                    }
                }
            }
        }

    }
}
