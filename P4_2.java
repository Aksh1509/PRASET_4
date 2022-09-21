//ID : 21CE140
//Name : Aksh Surani
package Pra4;
import static Pra4.MyCustomException.validate;
class MyCustomException1 extends Exception {
    public static void validate(int age) throws ArithmeticException{
        if(age<18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
}
public class P4_2 {
    public static void main(String[] args) {
        try
        {
            // throw an object of user defined exception
            throw new MyCustomException1();
        }
        catch (MyCustomException1 ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }

        validate(13);
    }
}
