//ID : 21CE140
//Name : Aksh Surani
public class P4_1 {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero ");
        }
    }
}