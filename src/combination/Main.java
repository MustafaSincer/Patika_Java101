package combination;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, r,nFactorial =1,rFactorial =1, a = 1 ;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("n degerini giriniz :" );
            n = input.nextInt();
            System.out.println("r degerini giriniz :");
            r = input.nextInt();
            if (n<r){
                System.out.println("Kombinasyon hesaplanamaz tekrar giriniz");

            }
        }while (n<r);

        for(int i = 1; i <= n; i++){

            nFactorial *= i;



        }
        System.out.println("n faktöriyel :"+ nFactorial);
       for(int i = 1; i<=r ; i++){
           rFactorial *= i;


       }
        System.out.println("r faktöriyel :"+ rFactorial);
       for (int i = 1 ; i <= (n-r) ; i++){

           a *= i;
           System.out.println(a);

       }

        double combination = nFactorial / (rFactorial*a);
        System.out.println("Kombinasyon sonucu : "+combination);

    }




}
