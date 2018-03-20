package ca.cmpt213.as4.shapes;

import ca.cmpt213.as4.UI.Canvas;

import java.util.ArrayList;
import java.util.List;

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
        int lineLimit = this.getWidth() - 2;

//        int endOfLine;
//        if(message.length() > lineLimit)
//        {
//            endOfLine = lineLimit - 1;
//        }
//        else
//        {
//            endOfLine = message.length() - 1;
//        }
//
//        while(charArray[endOfLine] != ' ')
//        {
//            endOfLine--;
//        }
//        int spacing = (lineLimit - endOfLine)/2;

//        String remainingMessage = message.substring(endOfLine);
//        System.out.print("lineLimit= " + lineLimit);
//        System.out.println();
//        System.out.print("endOfLine= " + endOfLine);
//        System.out.println();
//        System.out.print("spacing= " + spacing);
//        System.out.println();


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

//        int lineLength = this.getWidth() - 2;
//
//
//        String toPrint = message;
//        char[] charArray = toPrint.toCharArray();
//        for(int y = topEdge + 1; y < bottomEdge; y++)
//        {
//            int segmentLength = getRemainingStringIndex(lineLength);
//            int spacing = (lineLength - segmentLength)/2;
//            int currentIndex = 0;
//            int i = 0;
//            for(int x = leftEdge; x < rightEdge; x++)
//            {
//                if(currentIndex < segmentLength)
//                {
//                    if(currentIndex < spacing)
//                    {
//                        canvas.setCellText(x,y,' ');
//                    }
//                    else
//                    {
//                        canvas.setCellText(x,y,charArray[i]);
//
//                    }
//
//                    currentIndex++;
//                }
//                else {
//                    canvas.setCellText(x, y, ' ');
//                }
//            }
//            int remainingStringIndex = getRemainingStringIndex(lineLength);
//            toPrint = toPrint.substring(remainingStringIndex - 1);
//            charArray = toPrint.toCharArray();
//        }
//    }
//
//    private int getRemainingStringIndex(int lineLength)
//    {
//        char[] charArray = message.toCharArray();
//        int lineLimit = lineLength;
//        if(lineLength > charArray.length)
//        {
//            lineLimit = charArray.length;
//        }
////        for(int i = lineLimit - 1; i >= 0; i--)
//        int lineCutOff = lineLimit - 1;
////        int stringCutOff = 0;
//        while(lineCutOff >= 0)
//        {
//            if(charArray[lineCutOff] == ' ')
//            {
//                break;
//            }
//            lineCutOff--;
//        }
//
////        String convertString = charArray.toString();
////        String remainingString = convertString.substring((stringCutOff));
//
//        //increment to get true length, not index
//        return lineCutOff + 1;
    }
}
