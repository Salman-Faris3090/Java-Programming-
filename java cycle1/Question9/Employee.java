package Question9;

public class Employee {
    protected String name;
    protected long code;
    protected double basic_pay;
    public Employee(){}
    public Employee(String name,long code, double basic_pay){
        this.name=name;
        this.code=code;
        this.basic_pay=basic_pay;
    }
    public void initialize(String name,long code, double basic_pay){
        this.name=name;
        this.code=code;
        this.basic_pay=basic_pay;
    }
    public void print(){
        System.out.println("----------Employee Details---------");
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Code : "+code);
        System.out.println("Basic Pay : "+basic_pay);        
    }
}
    
