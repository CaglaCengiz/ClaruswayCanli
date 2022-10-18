package day08;

public class Q08_Arrays {
    public static void main(String[] args) {
        /* Q08_Arrays

         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        String arr[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        double toplamDolar=0;
        double toplamEuro=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].contains("$")){
             toplamDolar+=3.2*(Integer.parseInt(arr[i][j].replace("$","")))  ;
            } else if(arr[i][j].contains("€")){
                toplamEuro+=4.2*(Integer.parseInt(arr[i][j].replace("€","")))  ;

                }}
    } System.out.println("toplamEuro + = " + toplamEuro + " ve toplamDolar " +toplamDolar);
    }}