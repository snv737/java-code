class Complex {
 private double real, imaginary;
 // parametrized constructor
 public Complex(double real, double imaginary) {
 System.out.println("Complex:: parametrized constructor");
 this.real = real;
 this.imaginary = imaginary; }
 // copy constructor
 Complex(Complex c) {
 System.out.println("Complex::Copy constructor called");
 real = c.real;
 imaginary = c.imaginary; }
 // Overriding the toString of Object class
 @Override
 public String toString() {
 return "(" + real + " + " + imaginary + "i)"; } }
 public class CopyConstructor {
 public static void main(String[] args) {
 Complex c1 = new Complex(1, 5); //calls parametrized constructor
 System.out.println("C1 = " + c1);
 // copy constructor called
 Complex c2 = new Complex(c1);
 System.out.println("C2 = " + c2);
 // this is a simple assignment operator
 Complex c3 = c2;
 } }


class MethodOverloading2 {
 // this method accepts int
 private static void display(int a){
 System.out.println("Got Integer data.");
 }
 // this method accepts String object
 private static void display(String a){
 System.out.println("Got String object.");
 }
 public static void main(String[] args) {
 display(1);
 display("Hello");
 }
}
















