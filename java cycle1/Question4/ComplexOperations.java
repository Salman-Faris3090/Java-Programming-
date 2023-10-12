package Question4;

class ComplexOperations {
    public static Complex add( Complex a , Complex b){
        float realsum = a.real + b.real;
        float imaginarysum = a.imaginary + b.imaginary;
        Complex sum = new Complex(realsum,imaginarysum);
        return sum;             
    }
    public static Complex multiply( Complex a , Complex b){
        float realp = a.real*b.real + b.imaginary*a.imaginary;
        float imagp = a.imaginary*b.real + b.imaginary*a.real;
        Complex product = new Complex(realp, imagp);
        return(product);
    }
    public static double Modulus(Complex a){
        double mod = Math.sqrt(a.real*a.real+a.imaginary*a.imaginary);
        return mod;
    }
    
}
