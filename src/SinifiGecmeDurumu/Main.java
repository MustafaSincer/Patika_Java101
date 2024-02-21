package SinifiGecmeDurumu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int matematik,fizik,turkce,kimya,muzik;
      Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz :");
        matematik = input.nextInt();
        if ((matematik < 0) || (matematik>100)){
          matematik = 0;
        }
        System.out.println("Fizik notunu giriniz :");
        fizik = input.nextInt();
        if ((fizik < 0)||(fizik >100)){
              fizik = 0;
      }
        System.out.println("turkce notunu giriniz :");
        turkce = input.nextInt();
        if ((turkce < 0) || (turkce > 100)){
            turkce = 0 ;
        }

        System.out.println("Kimya notunu giriniz :");
        kimya = input.nextInt();
        if ((kimya <0)||(kimya >100)){
            kimya = 0;
        }
        System.out.println("Müzik notunu giriniz :");

        muzik = input.nextInt();
      if ((muzik < 0)|| (muzik>100)){
          muzik = 0;
      }
       double ortalama = (matematik+fizik+turkce+kimya+muzik)/5;
      System.out.print("Not ortalamanız :" + ortalama);
      if (ortalama > 55){
          System.out.println("Sınıfı geçtiniz");

      }
      else {
          System.out.println("Sınıfta kaldınız");
      }
    }
}
