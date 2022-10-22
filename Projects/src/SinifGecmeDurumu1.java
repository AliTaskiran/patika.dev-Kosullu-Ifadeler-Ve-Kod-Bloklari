import java.util.Scanner;

public class SinifGecmeDurumu1 {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik not:");
        mat = input.nextInt();
        System.out.print("Fizik not: ");
        fizik = input.nextInt();
        System.out.print("kimya not :");
        kimya = input.nextInt();
        System.out.print("turkce not: ");
        turkce = input.nextInt();
        System.out.print("muzik not: ");
        muzik = input.nextInt();
        boolean avarage = (mat<100)&&(fizik < 100)&&(kimya <100)&&(turkce <100)&&(muzik<100)&&(mat>0)&&(fizik >0)&&(kimya >0)&&(turkce >0)&&(muzik>0);

        double sonuc = (mat + fizik + kimya +turkce + muzik) / 5;
        if((avarage == true)&& (sonuc>55)){
            System.out.print("Tebrikler Sınıfı Geçtiniz !");

        }else if(avarage == false){
            System.out.print("Yanlış Not Girişi Yaptınız. Lütfen 100'den Küçük, 0'dan Yüksek Not Giriniz");


        }else if(sonuc<55){

            System.out.print("Sınıfı Geçmeyi Başaramadınız. ") ;

        }else{
            System.out.print("Yanlış Giriş Yaptınız.");
        }
    }
}
//HOCAYA SORULACAK NASIL ORTALAMA HESAPLAMANIZA KATILAMADINIZ CIKTISI YAZILIR ???????