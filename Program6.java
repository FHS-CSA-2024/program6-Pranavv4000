//import stuff here!
import java.util.Scanner;

//Your code here
public class Program3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        final double pi = 3.14159;
        double radius = 0.0;
        System.out.println("Please enter the radius: ");
        radius = myScanner.nextDouble();
        
        
        double diameter = radius*2;
        double circumference = 2*pi*radius;
        double area = (pi)*(radius)*(radius);
        
        //casting
        diameter = (double)(diameter)*1000;
        diameter = (int)(diameter+0.5);
        diameter = (double)(diameter)/1000;
        
        circumference = (double)(circumference)*1000;
        circumference = (int)(circumference+0.5);
        circumference = (double)(circumference)/1000;
        
        area = (double)(area)*1000;
        area = (int)(area+0.5);
        area = (double)(area)/1000;
        
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = "+ diameter);
        System.out.println("The Area of the circle = "+ area);
        System.out.println("The Circumference of the circle = "+circumference);
    }
}
//Paste console output below:
/*
Please enter the radius: 
5.789
The Radius of the circle = 5.789
The Diameter of the circle = 11.578
The Area of the circle = 105.283
The Circumference of the circle = 36.373
 */
