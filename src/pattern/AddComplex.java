package pattern;

class Complex{
    private int real;
    private int imaginary;

    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public String add(Complex obj)
    {
        int real = this.real + obj.real;
        int imaginary = this.imaginary + obj.imaginary;
        return String.valueOf(real) + " + " + String.valueOf(imaginary) + "i";
    }
}

public class AddComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(1,2);
        System.out.println(c1.add(c2));
    }
}
