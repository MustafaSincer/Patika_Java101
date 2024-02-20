package Kdv;

import java.util.Scanner;

public class kdv_orani{

    public static void main(String[] args) {
        // Değişkenleri oluşturma

        double deger, kdv_deger;
        // input metodunu tanımlama
        Scanner input = new Scanner(System.in);
        System.out.println("Ücreti giriniz...");
        // Kullanıcıdan ücretin girilmesi
        deger = input.nextDouble();
        double kdv_orani = deger < 1000 ? 0.18 : 0.08;
        kdv_deger = deger * kdv_orani + deger;

        System.out.println("Kdvli fiyatı :" + kdv_deger);
        System.out.println("Kdv oranı : " + kdv_orani);
        System.out.println("Kdv_tutarı :" + deger * kdv_orani);
        System.out.println("Kdvsiz değer :" + deger);


    }
}
