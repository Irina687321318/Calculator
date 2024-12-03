// Base Code: Calculator.java
public class Calculator {
    public int add(int a, int b) {

        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
    public int modulus(int a, int b){return a%b;}
    public double sqrt(int a) {return sqrt(int a)}
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiply: " + calculator.multiply(10, 5));
        System.out.println("Divide: " + calculator.divide(10, 5));
        System.out.println("Sqrt: " + calculator.sqrt(10));

    }
}
