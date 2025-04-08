package Diamond;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.println("n değerini giriniz");
        n = input.nextInt();
        // Upper Triangle
        for(int i = 1 ; i<= n ; i++){

            for (int j = 1 ; j <= (n-i); j++){

                System.out.print(" ");
            }
            for (int k = 1 ; k<= (2*i-1); k++){

                System.out.print("*");
            }
            System.out.println();



        }
        //lower triangle

        for (int i = n-1; i >= 1 ; i --){

            for(int j =1 ; j<= n-i; j++ ){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        }









}

