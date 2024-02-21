package Manav_Kasa;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;
        double a,b,c,d,e ;
        Scanner input = new Scanner(System.in);
        System.out.println("armut kaç kilo :");
        a = input.nextDouble();
        System.out.println("elma kaç kilo :");
        b = input.nextDouble();
        System.out.println("domates kaç kilo :");
        c = input.nextDouble();
        System.out.println("muz kaç kilo :");
        d = input.nextDouble();
        System.out.println("patlıcan kaç kilo :");
        e = input.nextDouble();
        armut = 2.14;
        elma = 3.67;
        domates =1.11;
        muz = 0.95;
        patlican = 5;

        double tutar = armut*a + elma*b + domates*c + muz*d + patlican*e;
        System.out.println("Toplam tutar :"+ tutar);

    }
}
