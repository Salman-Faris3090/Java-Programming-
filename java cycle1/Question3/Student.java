package Question3;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNo;
    private final int[] marks;
    public int total=0;
    public Student(){
        marks=new int [5];
    }
    public void initialize()
    {
        System.out.println("Enter the name of the student: ");
        Scanner n=new Scanner(System.in);
        name=n.nextLine();
        System.out.println("Enter the roll no for the student: ");
        rollNo=n.nextInt();
        System.out.println("Enter the marks for 5 subjects: ");
        for(int i=0;i<5;i++)
        {
            marks[i]=n.nextInt();
            n.nextLine();  
        }
    }
   
    public void calcTotal()
    {
        for(int i=0;i<5;i++)
        {            
        total+=marks[i];
        }
    }
    
    public int grandTotal()
    {
        return total;
    }
    
    public void details()
    {
        System.out.println("Name: "+ name);
        System.out.println("Roll No: "+ rollNo);
        System.out.println("Marks: ");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Subject "+(i+1)+": "+marks[i]);
        }
        System.out.println("Grand Total: "+ total);
    }
    
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        
        student1.initialize();
        student1.calcTotal();
        student1.grandTotal();
        student1.details();
        student2.initialize();
        student2.calcTotal();
        student2.grandTotal();
        student2.details();
        if(student1.total>student2.total)
        {
            System.out.println(student1.name + " has greater mark");
        }
        else
        {
            System.out.println(student2.name + " has greater mark");
        }
        System.out.println("Program Over!!");
    }
}
