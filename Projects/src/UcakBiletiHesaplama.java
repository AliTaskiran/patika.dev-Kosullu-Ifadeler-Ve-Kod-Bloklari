import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km ,yas,yolculuktip;
        System.out.println("Kaç Km gittiniz? :");
        km = input.nextInt();
        System.out.println("Yaşınız: ");
        yas = input.nextInt();
        System.out.println("1)Tek Yön\n2)Gidiş Dönüş\nLütfen Yolculuk Tipini Seçiniz: ");
        yolculuktip = input.nextInt();
        double ucret = km * 0.10;
        if(yolculuktip==2)
            ucret*=0.8;
        else
            ucret*=1;
        if(km>0 && yas>0&&yolculuktip>0&& yolculuktip<=2){
            if(yas<12){
                ucret*=0.5;
                System.out.println("Toplam tutar: "+ ucret+"TL");
            }
            else if(yas>12&&yas<24){
                ucret*=0.9;
                System.out.println("Toplam tutar: "+ ucret+"TL");
            }else if(yas>=24&&yas<65){
                System.out.println("Toplam tutar: "+ ucret+"TL");
            }else if(yas>=65){
                ucret*=0.7;
                System.out.println("Toplam tutar: "+ ucret+"TL");
            }
        }else
            System.out.println("Yanlış Değer Girdiniz!");
    }
}
