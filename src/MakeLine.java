import TurtleGraphics.*;
import hsa.*;
import java.awt.Color;
       
public class MakeLine {

    public static void main(String[] args) { 
        Console c=new Console();
        SketchPadWindow s=new SketchPadWindow(400,400);
        Pen p=new StandardPen(s);
        int pointx,pointy;
        boolean loop=true;
        p.setWidth(1);
        c.print("Enter an X position: ");
        pointx=c.readInt();
        c.print("Enter a Y Position: ");
        pointy=c.readInt();
        p.up();
        p.move(pointx-200,pointy-200);
        p.down();
        p.drawString("("+pointx+","+pointy+")");
        while(loop=true){
        c.print("Enter an X position: ");
        pointx=c.readInt();
        c.print("Enter a Y Position: ");
        pointy=c.readInt();
        p.move(pointx-200,pointy-200);
        p.drawString("("+pointx+","+pointy+")");
        }
    }
    
}
