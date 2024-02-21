package UcakBileti;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmTutar = 0.10;
        int yas,yon,mesafe;
        System.out.print("Yolcunun yasını giriniz:");

        yas = input.nextInt();
        if(yas < 0 ){
            System.out.println("Yanlış deger girdiniz");
        }
        System.out.print("Yolculuk tipini giriniz: (Tek yön ise 1 gidiş dönüş ise 2");
        yon = input.nextInt();
        if (yon != 1 &&yon !=2){
            System.out.println("Yanlış yön girdiniz");
        }
        System.out.println("Mesafeyi km cinsinden giriniz :");
        mesafe = input.nextInt();
        if (mesafe < 0){
            System.out.println("Yanlış km giridiniz");
        }

        double fiyat =mesafe*kmTutar ;
        if (yas < 12 ){
            if (yon ==2){
                fiyat = fiyat*2;
                System.out.println("Normal fiyat : " + fiyat);
                double indirimliFiyat = fiyat - (fiyat*0.50)-(fiyat*0.20);
                System.out.println("İndirimli fiyatı :" +indirimliFiyat);
            }else {
                System.out.println("Normal fiyat : " + fiyat);
                double indirimliFiyat = fiyat - (fiyat*0.50);
                System.out.println("İndirimli fiyatı :" +indirimliFiyat);

            }


        } else if ((yas > 12 && yas <24)) {
            if(yon ==2){
                fiyat = fiyat*2;
                System.out.println("Normal fiyat : " + fiyat);
                double indirimliFiyat = fiyat - (fiyat*0.10)-(fiyat*0.20);
                System.out.println("Normal fiyat : " + fiyat);
                System.out.println("İndirimli fiyatı :" +indirimliFiyat);

            }else{
                System.out.println("Normal fiyat : " + fiyat);
                double indirimliFiyat = fiyat - (fiyat*0.10);
                System.out.println("Normal fiyat : " + fiyat);
                System.out.println("İndirimli fiyatı :" +indirimliFiyat);
            }

        } else if ((yas > 65)) {
            if(yon == 2){
                fiyat = fiyat*2;
                System.out.println("Normal fiyat : " + fiyat);
                double indirimliFiyat = fiyat - (fiyat*0.30)-(fiyat*0.20);
                System.out.println("İndirimli fiyatı :" +indirimliFiyat);
            }else{
                System.out.println("Normal fiyat : " + fiyat);
                double indirimliFiyat = fiyat - (fiyat*0.30);
                System.out.println("İndirimli fiyatı :" +indirimliFiyat);

            }

        }else {
            System.out.println("Normal fiyat : " + fiyat);


        }



    }
}
