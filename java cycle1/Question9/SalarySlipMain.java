package Question9;

import java.util.Scanner;

public class SalarySlipMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee Name : ");
        String name = sc.next();
        System.out.print("Enter the Employee Code : ");
        long code = sc.nextLong();
        System.out.print("Enter the Basic Pay : ");
        double basic_pay = sc.nextDouble();
        System.out.print("Enter the Deduction Percentage : ");
        double deduction = sc.nextDouble();
        System.out.print("Enter the Allowances Percentage : ");
        double allowances = sc.nextDouble();
        deduction=deduction/100;
        allowances= allowances/100;
        SalarySlip sal = new SalarySlip(name,code,basic_pay,deduction,allowances) {            
            @Override
            public void salary() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        sal.Salary();
        sal.printSalarySlip();               
    }
}
 
