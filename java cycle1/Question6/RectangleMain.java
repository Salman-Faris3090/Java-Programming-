
package Question6;

import java.util.Scanner;

public class RectangleMain {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of the Rectangle : ");
        double l = sc.nextDouble();
        System.out.print("\nEnter the Breadth of the Rectangle : ");
        double b = sc.nextDouble();
        Rectangle rect = new Rectangle(l,b);
        rect.calc_Area();
        rect.print_Area();
        System.out.print("Enter the Length of the Box : ");
        double l1 = sc.nextDouble();
        System.out.print("\nEnter the Breadth of the Box: ");
        double b1 = sc.nextDouble();
        System.out.print("\nEnter the Height of the Box : ");
        double h1 = sc.nextDouble();
        Box box = new Box(l1,b1,h1);
        box.calc_Area();
        box.print_Area();
        box.calc_Volume();
        box.print_Volume();
    }
    
}
