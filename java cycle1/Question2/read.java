package Question2;

import java.util.Scanner;

public class read {
    static void text()
    {
        System.out.println("Enter the number of times for the text to be repeated: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println("Enter the String: ");
        Scanner obj1 = new Scanner(System.in);
        String text = obj1.nextLine();
        System.out.println("The string is repeated " + n + " times");
        for(int i=0;i<n;i++)
        {
            System.out.println(text);
        }
        System.out.println("Program Over!!"); 
    }
    public static void main(String[] args) {
        text();
    }
}
