package L01_ForLoop.Task;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
/*girilen iki sayı arasındaki çift sayıları print eden code creae ediniz*/
        Scanner sc = new Scanner(System.in);
        System.out.println(" sayı1 giriniz:");
        int sayı1 = sc.nextInt();
        System.out.println("sayı2 giriniz");
        int sayı2=sc.nextInt();
        if(sayı1<sayı2) {
            for (int i = sayı1; i < sayı2; i++) {
                if (i % 2 == 0) {//döngü içindeki sayıların çift kontrolu
                    System.out.println(i + " ");
                }
            }
            } else System.out.print("hatalı giriş yaptınız");


        }//maın dışı

}

