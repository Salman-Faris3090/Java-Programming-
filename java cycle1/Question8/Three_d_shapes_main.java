package Question8;

import java.util.Scanner;

public class Three_d_shapes_main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Cylinder :");
        double r1 = sc.nextDouble();
        System.out.print("Enter the Height of the Cylinder : ");
        double h = sc.nextDouble();
        Cylinder ob1 = new Cylinder(r1,h);
        ob1.calcArea();
        ob1.calcVolume();
        ob1.printArea();
        ob1.printVolume();
        System.out.print("\nEnter the raidus of the Sphere : ");
        double r2 = sc.nextDouble();
        Sphere ob2 = new Sphere(r2);
        ob2.calcArea();
        ob2.calcVolume();
        ob2.printArea();
        ob2.printVolume();             
    }
}
    
