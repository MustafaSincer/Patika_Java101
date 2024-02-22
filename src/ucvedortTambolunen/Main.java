package ucvedortTambolunen;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int m,toplam = 0 ,sayac = 0 ;
        double ortalama ;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        m = input.nextInt();

        for(int i = 1; i<= m; i++){
            System.out.println(i);
            if(i % 3 == 0 && i % 4 == 0 ){

                sayac += 1;
                toplam += i ;
                System.out.println("sayac :"+ sayac);
                System.out.println("kümülatif toplam :" +toplam);
            }

        }
        ortalama = (toplam/sayac);
        System.out.println("0 dan girdiğiniz sayıya kadar 3 ve 4 e bölünen sayıların ortalaması :"+ ortalama);

    }
}
