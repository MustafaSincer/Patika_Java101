package Hesap_Makinesi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayıları giriniz..");
        a=input.nextDouble();

        b=input.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi seçiniz...");
        short c = input.nextShort();
        switch (c){

            case 1 :
                double toplama = a+b;
                System.out.println("Sayıların toplamı :"+ toplama);
                break;
            case 2:
                double cikarma = a-b;
                System.out.println("Sayıların farkı :"+ cikarma);
                break;

            case 3 :
                double carpma = a*b;
                System.out.println("Sayıların çarpımı : "+ carpma);
                break;

            case 4 :
                double bolme = a/b;
                System.out.println("Sayıların bölümü :"+ bolme);
                break;
            default:
                System.out.println("Geçersiz işlem yaptnız");

        }
    }
}
