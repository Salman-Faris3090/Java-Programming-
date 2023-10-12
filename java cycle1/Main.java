class Complex {
    public double real;
    public double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void printComplexNumber() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        }
    }
}

class ComplexOperations {
    public static Complex add(Complex complex1, Complex complex2) {
        double realSum = complex1.real + complex2.real;
        double imaginarySum = complex1.imaginary + complex2.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    public static Complex multiply(Complex complex1, Complex complex2) {
        double realProduct = complex1.real * complex2.real - complex1.imaginary * complex2.imaginary;
        double imaginaryProduct = complex1.real * complex2.imaginary + complex1.imaginary * complex2.real;
        return new Complex(realProduct, imaginaryProduct);
    }

    public static double getModulus(Complex complex) {
        return Math.sqrt(complex.real * complex.real + complex.imaginary * complex.imaginary);
    }
}

public class Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(2, 3);
        Complex complex2 = new Complex(4, -5);

        System.out.print("Complex Number 1: ");
        complex1.printComplexNumber();

        System.out.print("Complex Number 2: ");
        complex2.printComplexNumber();

        Complex sum = ComplexOperations.add(complex1, complex2);
        System.out.print("Sum of Complex Numbers: ");
        sum.printComplexNumber();

        Complex product = ComplexOperations.multiply(complex1, complex2);
        System.out.print("Product of Complex Numbers: ");
        product.printComplexNumber();

        double modulusComplex1 = ComplexOperations.getModulus(complex1);
        System.out.println("Modulus of Complex Number 1: " + modulusComplex1);

        double modulusComplex2 = ComplexOperations.getModulus(complex2);
        System.out.println("Modulus of Complex Number 2: " + modulusComplex2);
    }
}
