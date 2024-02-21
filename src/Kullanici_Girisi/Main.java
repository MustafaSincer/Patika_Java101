package Kullanici_Girisi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz..");
        username = input.nextLine();

        password = "java123";

        String user = "patika";
        String onay ;

        if(username.equals(user)){
            System.out.println("Şifrenizi giriniz");
            String pass = input.nextLine();
            if(password.equals(pass)){
                System.out.println("Giriş Başarılı");
            }else {

                System.out.println("Yeni şifre belirlemek ister misiniz? evet için e/ hayır için /h tuşuna basınız");
                onay = input.nextLine();
                switch (onay) {
                    case "e" -> {
                        System.out.println("Yeni şifrenizi giriniz.Yeni şifreniz eskisiyle aynı olamaz");
                        String newPassword = input.nextLine();
                        if (newPassword.equals(password)) {
                            System.out.println("Şifreniz eski şifre ile aynı");

                        } else {
                            System.out.println("Şifreniz oluşturuldu...");
                        }
                    }
                    case "h" -> System.out.println("Programdan çıkılıyor.....");
                }



            }



        }else {
            System.out.println("Kullanıcı adını yanlış girdiniz");
        }







    }

}
