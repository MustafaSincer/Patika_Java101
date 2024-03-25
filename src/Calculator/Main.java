package Calculator;
import java.util.Scanner;
public class Main {

    static void add(int a, int b){

        System.out.println("Sayıların toplamı"+ a+b);

    }
    static void subst(int a, int b){
        int result = a-b ;
        System.out.println("Sayıların farkı :" + result);

    }
    static void multip(int a , int b){
        int result = a*b;
        System.out.println("Sayıların çarpımı :" + result);

    }
    static double div(double a , double b ){
        double result ;
        if (b == 0 ){
            System.out.println("İşlem yapılamaz");

            return 0;

        }
        result  = a/b;
        System.out.println("Bölme işlemi sonucu : "+ result);
        return result;



    }
    static void power(int a , int b ){
        int result = 1;
        for(int i = 1; i <= b; i++){

            result *= a ;


        }
        System.out.println("a üzeri b = "+ result);
    }

    static int factorial(int a){

        if (a < 0){
            System.out.println("Faktoriyel negatif sayılarda hesaplanamaz");
            return 0;



        }else if (a == 0){
            return 1;



        }else {
            return a* factorial(a-1);

        }




    }
    static void mod(int a, int b ){
        int result = a % b ;

        System.out.println("a mod b :" + result);



    }
    static void rectangular(int a, int b){

        int area = a* b;
        int perimeter = 2* (a+b);
        System.out.println("Dikdörtgenin alanı :"+ area );
        System.out.println("Dikdörtgenin çevresi :" +perimeter);

    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int operation ;

        do {
            String menu = "1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme işlemi\n" +
                    "5- Üslü Sayı Hesaplama\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                    "0- Cıkıs Yapılır";
            System.out.println(menu);

            System.out.println("Please enter a operation");
            operation  = input.nextInt();
            switch (operation){

                case 1 :
                    System.out.println("Toplayacagınız iki sayıyı giriniz");
                    int a = input.nextInt();
                    int b = input.nextInt();
                    add(a,b);
                    break;
                case 2 :
                    System.out.println("Çıkaracagınız iki sayıyı giriniz");
                    a = input.nextInt();
                    b = input.nextInt();
                    subst(a,b);
                    break;
                case 3 :
                    System.out.println("Çarpacagınız iki sayıyı giriniz");
                    a = input.nextInt();
                    b = input.nextInt();
                    multip(a,b);
                    break;
                case 4 :
                    System.out.println("Böleceğiniz iki sayıyı giriniz");
                    a = input.nextInt();
                    b = input.nextInt();
                    div(a,b);
                    break;
                case 5 :
                    System.out.println("taban sayısını ve üs sayısını giriniz");

                    a = input.nextInt();
                    b = input.nextInt();
                    power(a,b);
                    break;
                case 6 :
                    System.out.println("Faktöriyel hesaplanacak sayıyı giriniz");

                    a = input.nextInt();

                    System.out.println("Faktöriyel "+factorial(a));
                    break;


                case 7:
                    System.out.println("Mod alınacak sayıyı ve alınacak modu giriniz");
                    a = input.nextInt();
                    b = input.nextInt();
                    mod(a,b);
                    break;

                case 8:
                    System.out.println("Dikdörtgeinin kenarlarını giriniz");

                    a = input.nextInt();
                    b = input.nextInt();
                    rectangular(a,b);
                    break;

            }





        }while (operation != 0);
        System.out.println("Çıkış yapılıyor....");




    }
}
