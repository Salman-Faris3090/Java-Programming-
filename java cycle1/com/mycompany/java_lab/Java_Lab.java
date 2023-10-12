package com.mycompany.java_lab;

import java.util.Scanner;

public class Java_Lab{
    static void isprime(int n)
    {
        int a=0;
        int x=2;
        while (a!=n)
        {
            boolean check=true;
            for(int i=2;i<x;i++)
            {
                if(x%i==0)
                {
                    check = false;
                    break;
                }
            }
            if(check){
            System.out.println(x+" ");
            a++;
            }
            x++;
        }        
    }    
    public static void main(String[] args) {
        System.out.println("Enter the limtit for printing prime numbers: ");
        Scanner obj1 = new Scanner(System.in);
        int number = obj1.nextInt();
        System.out.println("The prime numbers within the range is:");
        isprime(number);System.out.println("Program Over!!");
    }    
}
  
