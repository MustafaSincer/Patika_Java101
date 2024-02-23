package HarmonicSeries;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        n = input.nextInt();
        double total = 0.0;
        for(int i = 1; i<=n ; i++){
            total += (1.0/iqq) ;
        }
        System.out.println(n+ "değerine kadar harmonik seri değeri :" + total);
    }
}
