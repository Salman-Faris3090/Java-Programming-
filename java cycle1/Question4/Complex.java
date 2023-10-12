package Question4;

public class Complex {
    float real, imaginary;
    public Complex(){
        real =(float) 0.0;
        imaginary = (float) 0.0;
    }
    public Complex(float real,float imaginary){
        this.real = real;
        this.imaginary = imaginary;       
    }
    public Complex(float a){
        this.real = a;
        this.imaginary = a;
    }
    public void initialize(float real, float imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public void print_Complex(){
        if(imaginary>0)
            System.out.println(real+" + "+imaginary+"i ");
        else
            System.out.println(real+" "+imaginary+"i ");
    }
}
