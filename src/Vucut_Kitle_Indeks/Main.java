package Vucut_Kitle_Indeks;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      double boy , kilo , vki;

      Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz(metre cinsinden) :");
        boy = input.nextDouble();
        System.out.println("Kilonuzu giriniz(kg cinsinden) :");
        kilo = input.nextDouble();

        System.out.println("Boy :"+boy);
        System.out.println("Kilo :"+kilo);
        vki = kilo / (boy*boy);
        System.out.println("Vücut Kitle indeksi :"+ vki);
    }
}
