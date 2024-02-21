package Hipotenüs;
import java.util.Scanner;
public class hip {
    public static void main(String[] args) {
        // Degiskenleri olusturalım
        int a,b,c ;

        Scanner input = new Scanner(System.in);
        System.out.println("üçgenin bir kenarını giriniz");
            a = input.nextInt();
        System.out.println("üçgenin bir kenarını giriniz");

            b = input.nextInt();
        System.out.println("üçgenin bir kenarını giriniz");
            c = input.nextInt();

          int  cevre = a+b+c ;

          double  alan = Math.sqrt(cevre * (cevre-a)*(cevre-b)*(cevre-c));
            System.out.println("Üçgenin çevresi :" + cevre);
            System.out.println("Üçgenin alanı :" + + alan);



    }
}
