package recursiveFactorial;
import java.util.Scanner;
public class Main {

    static int factorial(int a){

        if (a < 0){

            return 0;

        }


        int result = factorial(a)*factorial(a-1);
        return result;

    }
    public static void main(String[] args) {
        int a ;
        Scanner inp = new Scanner(System.in);

        a = inp.nextInt();
        int b = factorial(a);
        System.out.println(b);



    }
}
