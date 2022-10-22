import java.util.Scanner;

public class KullaniciDersi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, newUserName, newPassword;
        int d1;
        System.out.print("Kullanıcı adınızı giriniz:");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password = input.nextLine();
        if (userName.equals("alibaba123") && password.equals("alibaba123")) {
            System.out.print("Tebrikler Giriş Yaptınız!");
        } else {
            System.out.print("Yanlış Bilgi Girdiniz Yeniden Deneyiniz!");
            System.out.println("Değiştirmek İstiyor musunuz\n1)evet\n2)hayır");
            d1 = input.nextInt();
            switch (d1) {
                case 1:
                    System.out.println("Yeni kullanıcı adınız:");
                    newUserName = input.next();
                    System.out.print("Yeni Şifreniz");
                    newPassword = input.next();

                    System.out.print("Yeni Kullanıcı Adınız: " + newUserName + " Yeni Şifreniz: " + newPassword);
                    break;
                case 2:
                    System.out.print("Şifrenizin ve Kullanıcı Adınızın değişmesini istemediniz.");
                    break;
                default:
                    System.out.print("Yanlış seçim yaptınız tekrar deneyiniz.");
                    break;


            }


        }


    }
}
