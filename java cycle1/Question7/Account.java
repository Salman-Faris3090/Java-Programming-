package Question7;

abstract public class Account {
    protected String holder_name ;
    protected long acc_no;
    protected double balance;
    public Account(String holder_name, long acc_no,double balance){
        this.holder_name = holder_name;
        this.acc_no = acc_no;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println(amount+" Rupees has been deposited, new Balance = "+balance+" Rupees.");
    }
    public abstract void  withdrawal(double amount);
    public abstract void display();    
}
