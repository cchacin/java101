// Example how to import Java Development Kit libraries
import java.lang.Math;

// Define the Square class
public class Square {    // Save as "Square.java"
   // Private variables
   private double side;
   private String color;
   
   // Constructors (overloaded)
   public Square() {                   // 1st Constructor
      side = 1.0;
      color = "red";
   }
   public Square(double r) {           // 2nd Constructor
      side = r;
      color = "red";
   }
   public Square(double r, String c) { // 3rd Constructor
      side = r;
      color = c;
   }
   
   // Public methods
   public double getSide() {
      return side;
   }
   public String getColor() {
      return color;
   }
   public double getArea() { // Function to calculate the area using Math.pow
      return Math.pow(side, 2);
   }
}