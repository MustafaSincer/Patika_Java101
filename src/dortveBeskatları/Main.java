package dortveBeskatları;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n , fourPower = 1, fifthPower = 1 ;


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        n = input.nextInt();
        System.out.println("4 ün katları : " );
        for (int i =1; i<n; i*=4){
            fourPower = i;

            System.out.println(+fourPower);

        }
        System.out.println("5 in katları : " );
        for (int i =1 ; i<n ; i *= 5){
            fifthPower = i;

            System.out.println(fifthPower);
        }


    }

}
