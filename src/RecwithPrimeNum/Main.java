package RecwithPrimeNum;
import java.util.Scanner;
public class Main {

    static boolean prime(int number,int tempt){

        if (number <=1){
            return false;

        } else if (tempt ==1) {
            return true;

        } else if (number%tempt == 0) {
            return false;


        }else {
            return prime(number,tempt-1);

        }


    }

    public static void main(String[] args) {
        int number ;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz :");
        number = input.nextInt();

        if(prime(number,number-1)){
            System.out.println("Sayı asal sayıdır");

        }
        else{
            System.out.println("Sayı asal değildir");

        }


    }
}
