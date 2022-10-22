import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int s1, s2, sec;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz:");
        s1 = input.nextInt();
        System.out.println("İkinci Sayıyı :");
        s2 = input.nextInt();
        System.out.println("Hangi İşlemi Yapmak İstiyosunuz\n1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
        sec = input.nextInt();

        switch (sec) {
            case 1:
                System.out.print("Sonuc: " + (s1 + s2));
                break;
            case 2:
                System.out.print("Sonuc: " + (s1 - s2));
                break;
            case 3:
                System.out.print("Sonuc: " + (s1 * s2));
                break;
            case 4:
                switch (s2){
                    case 0:
                        System.out.print("Bir Sayı Sıfıra Bölünemez!");
                        break;
                }
                System.out.print("Sonuc: " + (s1 / s2));
                break;
            default:
                System.out.print("Yanlış değer girdiniz,tekrar deneyiniz.");
        }

    }
}
