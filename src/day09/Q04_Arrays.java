package day09;

import java.util.Arrays;

public class Q04_Arrays {
    public static void main(String[] args) {
        /*
Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
String s= Apex,nesne yonelimli bir programlama dilidir"       */
        String s= "Apex,nesne yonelimli bir programlama dilidir" ;
       s=s.replace(",","").replace(" ","");
        System.out.println(s);//Apexnesneyonelimlibirprogramlamadilidir
          String[]arr=s.split("");
        System.out.println(Arrays.toString(arr));//[A, p, e, x, n, e, s, n, e, y, o, n, e, l, i, m, l, i, b, i, r, p, r, o, g, r, a, m, l, a, m, a, d, i, l, i, d, i, r]

        String[] sesliHarfler={"a","e","i","o","u"};
        System.out.println(Arrays.toString(sesliHarfler));
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < sesliHarfler.length; j++) {
                if(arr[i].equalsIgnoreCase(sesliHarfler[j])){//arr deki herhangi bir karekter ,sesli harflerdeki buyuk kucuk farketmeksizin
                    //esitse sesli harf sayısını bir artır
                count++;
            }
            
        }
    }
        System.out.println("count = " + count);
}}
