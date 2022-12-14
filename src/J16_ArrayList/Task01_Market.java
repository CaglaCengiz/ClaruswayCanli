package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01_Market {

        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım :  c adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 	6.adım		 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */
        static ArrayList<String> gunler = new ArrayList<String>(List.of("pazartesi ", "salı ", "çarşamba ", "perşembe ", "cuma ", "cumartesi ", "pazar "));
     static ArrayList<Double>gunlukKazaclar=new ArrayList<>();//2.adım
    static Scanner sc=new Scanner(System.in);
   static  double hafatCirosu = 0;
    public static void main(String[] args) {

       int gun=0;
       while (gun<7){//3.adım
           System.out.println(gunler.get(gun)+ "gunun hasılatını gir :");
           double gunKazncı=sc.nextDouble();
           gunlukKazaclar.add(gunKazncı);
           double haftanınCirosu = gunKazncı;
          // haftanınCİrosu+=gunlukKazaclar.get(gunlukKazaclar.size()-1)
           gun++;
           getOrtalamaKazanc();
           getOrtalamaninUstundeKazancGünleri();
           getOrtalamaninAltindaKazancGünleri();
           System.out.println("haftanınCirosu = " + haftanınCirosu);
           System.out.println("get oratama kazanc = " +getOrtalamaKazanc() );
           System.out.println("ortalama ustu kazanc gunleri :" + getOrtalamaninUstundeKazancGünleri());
           System.out.println("ortalamanın altı kazanc gunleri :"+ getOrtalamaninAltindaKazancGünleri());
       }
    }
    private static String getOrtalamaninAltindaKazancGünleri(){//6.adım
    String ortalamAltıGun="";
        for (int i = 0; i < gunlukKazaclar.size(); i++) {
            if (gunlukKazaclar.get(i)<getOrtalamaKazanc()){
                ortalamAltıGun +=gunler.get(i);
            }
        }
       return ortalamAltıGun;
    }
    private static String getOrtalamaninUstundeKazancGünleri() {//5.adım
        String ortalaUstuGun="";
        for (int i = 0; i < gunlukKazaclar.size(); i++) {//gunluk haslat dongusu
            if (gunlukKazaclar.get(i)>getOrtalamaKazanc()){//gunluk hasılat haftanın ortalaması ile kontrol
                ortalaUstuGun +=gunler.get(i);//ortalamanın ustunde hasılat olan gun ortalama ustu gune eklendi
            }
        }
        return ortalaUstuGun;
    }
    private static double getOrtalamaKazanc() {//4.adım
        double ortalama =hafatCirosu/7;
        return ortalama;
    }
}



