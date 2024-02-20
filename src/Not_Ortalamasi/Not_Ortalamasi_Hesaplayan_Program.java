package Not_Ortalamasi;

import java.util.Scanner ;
public class Not_Ortalamasi_Hesaplayan_Program {
    public static void main(String[] args) {
        // Değişkenleri oluşturma
        int math,phy,chem,tur,hist,music ;

        // İnput metodunu Tanımlama
        Scanner input = new Scanner(System.in);

        // Ders notlarının değerlerini alma

        System.out.println("Matematik ders notunu giriniz");

        math = input.nextInt();

        System.out.println("Fizik ders notunu giriniz");

        phy = input.nextInt();
        System.out.println("Kimya ders notunu giriniz");

        chem = input.nextInt();

        System.out.println("Türkçe ders notunu giriniz");

        tur = input.nextInt();

        System.out.println("Tarih ders notunu giriniz");

        hist = input.nextInt();
        System.out.println("Müzik ders notunu giriniz");

        music = input.nextInt();
        // Orrtalamanın Hesaplanması
        int toplam = math + phy + chem + hist + tur + music ;
        double sonuc = toplam / 6  ;
       // Dersi geçip geçmediği kontrolü

        String durum = sonuc > 60 ? "Sınıfı gecti " : "Sınıfta kaldı" ;
        System.out.println(durum);

    }
}
