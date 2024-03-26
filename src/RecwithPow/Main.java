package RecwithPow;
import java.util.Scanner;
public class Main {

    static int pow(int taban,int pow){

        if (pow == 0){
            return 1;
        }else {
            return taban* pow(taban,pow-1);
        }



    }

    public static void main(String[] args) {

        int number , power ;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayıyı giriniz :");
        number = input.nextInt();
        System.out.println("Üs değerini giriniz");

        power = input.nextInt();

        int result = pow(number,power);

        System.out.println("Girdiğiniz değerin sonucu :" +result);


    }
}
