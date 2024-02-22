package usluSayi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,total ;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        a = input.nextInt();
        System.out.println("Üssünü giriniz : ");
        b = input.nextInt();

        total = 1 ;
        for(int i =0 ; i < b; i++ ){
            total *= a;




        }
        System.out.println( +a +"^" +b + ":" + total);






    }
}
