import TurtleGraphics.*;
import TerminalIO.*;

public class BarGraph {

    public static void main(String[] args) {
        KeyboardReader r=new KeyboardReader();
        int bar1,bar2,bar3,bar4;
        int i=50;
        int a=-200;
        bar1=r.readInt("Enter 4 numbers from 1-200: ");
        bar2=r.readInt();
        bar3=r.readInt();
        bar4=r.readInt();
        SketchPadWindow win=new SketchPadWindow(400,400);
        Pen p=new StandardPen(win);
        p.setWidth(50);
        
            p.up();
            p.move(i+a,0+a);
            p.down();
            p.move(i+a,bar1+a);
            p.up();
            p.move(i-212.5,bar1-150);
            p.down();
            p.drawString(""+bar1);
            i+=100;
            p.up();
            p.move(i+a,0+a);
            p.down();
            p.move(i+a,bar2+a);
            p.up();
            p.move(i-212.5,bar2-150);
            p.down();
            p.drawString(""+bar2);
            i+=100;
            p.up();
            p.move(i+a,0+a);
            p.down();
            p.move(i+a,bar3+a);
            p.up();
            p.move(i-212.5,bar3-150);
            p.down();
            p.drawString(""+bar3);
            i+=100;
            p.up();
            p.move(i+a,0+a);
            p.down();
            p.move(i+a,bar4+a);
            p.up();
            p.move(i-212.5,bar4-150);
            p.down();
            p.drawString(""+bar4);
            
         
 
    }
    
}
