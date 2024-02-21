package Daire_Alan;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double r , pi, a ;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz:");
        r = input.nextDouble();
        pi = 3.14;
        System.out.println("Merkez açısını giriniz:");
        a = input.nextDouble();
        double alan = (pi * (r*r)*a )/360;

        System.out.println(("Dairenin alanı :" + alan));




    }

}
