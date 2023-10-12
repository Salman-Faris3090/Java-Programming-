package Question1;

public class Prime {
     public boolean check_prime(int no){
        int c =0;
        boolean b = false;
        for(int i =1;i<=no/2;i++){
            if (no%i==0)
                c++;
        }
        if (c==1)
            b = true;
        return b;
    }
     public void print_prime(int n){
       int count =0;
       int i = 1;
       System.out.print("The First "+n+" prime numbers are : ");
       while(count<n){
           boolean ch = check_prime(i);
           if(ch){
               count++;
	       System.out.print(i+" ");
           }
           i++;
       }       
       System.out.println();  
     }
}
