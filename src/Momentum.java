import hsa.*;
public class Momentum {

    public static void main(String[] args) {
        Console c=new Console();
        double mass,velocity,momentum;
        c.print("Enter object's mass: ");
        mass=c.readDouble();
        c.print("Enter object's velocity: ");
        velocity=c.readDouble();
        //calculate answer
        momentum=mass*velocity;
        //show result
        c.print("The momentum is "+momentum);
    }
    
}
