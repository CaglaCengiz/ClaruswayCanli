package day08;

public class Q07_Arrays {
    public static void main(String[] args) {
/*  Q07_Arrays
 Q07_Arrays

         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */
  

       int arr[][]= {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
       int min=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<min){
                }}}
        System.out.println("min = " + min);
    }}

