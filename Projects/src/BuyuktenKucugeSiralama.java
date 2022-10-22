import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        b = input.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz: ");
        c = input.nextInt();
        if (a > c && a > b) {
            if (b > c)
                System.out.print(a + " Sayısı En Büyük Sayıdır" + a + ">" + b + ">" + c);

             else
                System.out.print(a + " Sayısı En Büyük Sayıdır" + a + ">" + c + ">" + b);


        } else if (b > a && b > c) {
            if (a > c)
                System.out.print(b + " Sayısı En Büyük Sayıdır" + b + ">" + a + ">" + c);
            else
                    System.out.print(b + " Sayısı En Büyük Sayıdır" + b + ">" + c + ">" + a);



        }else if(c> b && c > a){
            if(b>a)
                System.out.print(c + "Sayısı En Büyük Sayıdır" + c + ">" + b + ">" + a);

            else
                System.out.print(b + "Sayısı En Büyük Sayıdır" + b + ">" + a + ">" + c);

        }

    }
}
