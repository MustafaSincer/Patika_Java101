package Taksimetre;
import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
    int km ;
    double tutar;
    Scanner input = new Scanner(System.in);
        System.out.println("Kaç km yol gidildi?" );
        km = input.nextInt();

        tutar = 10 + km * 2.2;


        double son_tutar = tutar > 20 ? tutar  : 20 ;
        System.out.println("Ödenecek tutar :" + son_tutar);


    }
}
