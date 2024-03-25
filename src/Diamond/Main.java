package Diamond;
import java.util.Scanner;
public class Main {

    /*



    sdfasdfasdf

     */
    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.println("n değerini giriniz");
        n = input.nextInt();
        int m , k ,l;
        m = 1;
        while(m<=n){
            k = 1;
            while (k<=n-m){
                System.out.print(" ");
                k++;
            }
            l=1;
            while(l<=(2*m)-1){
                System.out.print("*");
                l++;
            }


            System.out.println();
            m++;
        }








    }
}
