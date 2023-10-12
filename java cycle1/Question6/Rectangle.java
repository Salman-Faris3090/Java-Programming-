package Question6;

public class Rectangle {
    protected double length, breadth, area;
    public Rectangle(double x){
        this.length=x;
        this.breadth=x;
    }
    public Rectangle(){}
    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth = breadth;
    }
    public void calc_Area(){
        area = length*breadth;
    }
    public double get_Area(){
        return area;    
    }
    public void print_Area(){
        System.out.println("The Area is : "+ area);
    }
}
  
