import TurtleGraphics.*;
import TerminalIO.*;

public class BonusCircle {

    public static void main(String[] args) {
        KeyboardReader r=new KeyboardReader();
        double size;
        size=r.readDouble("Enter the diameter in inches of the circle you want: ");
        size=3.14159265358*size;
        SketchPadWindow win=new SketchPadWindow(400,400);
        Pen p=new RainbowPen(win);
        p.setWidth(3);
        p.up();
        p.move(0,size*100/3.14159265358/2);
        p.move(-0.01,size*100/3.14159265358/2);
        p.down();
        for (int x=1; x<101; x++){
            p.turn(3.6);
            p.move(size);
        }
        
        

    }
    
}
