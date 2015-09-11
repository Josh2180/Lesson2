import hsa.*;
public class PizzaCost {
    public static void main(String[] args) {
    Console c=new Console();
    double pizza;
    double base=2.25;
    int toppings,size;
    c.print("Enter the length of the diameter for your pizza in inches: ");
    size=c.readInt();
    c.print("Enter the amount of toppings you would like: ");
    toppings=c.readInt();
    pizza=(size*0.50+toppings*0.75+base);
    c.print("Your pizza is "+size+" inches with "+toppings+" Toppings. This comes out to a total of $"+pizza);
    }
    
}
