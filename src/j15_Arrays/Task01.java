package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task->kullanıcıdan alınan datalarla bir int array elemanlarının buyukten kucuge printeden code create ediniz
     /*   Scanner sc=new Scanner(System.in);
        System.out.println("agam kac elemanlı array istirsen");
        int sayı=sc.nextInt();
        int arr[]=new int[arrBoyut];//boyutu belirlenmiş boş int array
        for (int i = 0; i <arrBoyut ; i++) {
            System.out.println(i+". elemanı giriniz :");
            arr[i]=sc.nextInt();

        }
        System.out.println("agam istediğin array :"+Arrays.toString(arr));
      Arrays.sort(arr);//arr k->b sortıngen yapıldı
        for (int i =arr.length-1;i>=0 ; i--) {
            System.out.println(arr[i]+" ");


        }*/
        Scanner sc=new Scanner(System.in);
        System.out.println("kac elemanlı array ıstıyorsun");
        int sayı=sc.nextInt();
        int arr[]=new int[sayı];
        for (int i = 0; i <sayı ; i++) {
            System.out.println(i +".elemanını giriniz");
            arr[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i = 0; i <=arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");

        }


    }
}
