package j11_ForLoop.Task;

import java.util.Scanner;

public class Task09_Nested {
    public static void main(String[] args) {
         /*
  task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
    Örnek Ekran çıktısı
*
* *
* * *
* * * *

   */
        Scanner sc = new Scanner(System.in);

        System.out.println("kare için boyut giriniz : ");
        int boyut = sc.nextInt();

        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");//yantana olması için ln kullanılmaz

            }
            System.out.println();
        }
    }
}
