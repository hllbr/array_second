
import java.util.Arrays;
import java.util.Scanner;
//Source = Mustafa Murat COŞKUN / UDEMY referans alınarak geliştirilmiştir..

public class Main {
    public static int [] arrayDoldur(int sayı){
        Scanner scn = new Scanner(System.in);
        int [] array_cıktı = new int[sayı];
        for(int i = 0;i<sayı;i++){
            array_cıktı[i] = scn.nextInt();
        }
        return array_cıktı ;
    }
    public static void arraySırala(int [] array){
        //Array sınıfı ile sıralama yapıyoruz
        Arrays.sort(array);
        arrayBastır(array);
    }
    public static void arrayBastır(int [] array){
        for(int i = 0;i<array.length ;i++){
            System.out.println("element : " +(i+1)+ " : " +array[i]);
        }
    }
    public static void main(String[] args) {
       // arrayDoldur(5);   
        //arrayBastır(arrayDoldur(5));
      //  int [] a = arrayDoldur(5);
      //  arrayBastır(a);
       // arraySırala(a);
       int [] a1 ={1,2,3,4,5,6};
       int [] b1 = {1,2,3,4,5,6};
       if(a1 == b1){
           System.out.println("bellekte aynı yeri gösteriyorlar");
       }else{
           System.out.println("bellekte farklı noktaları gösteriyorlar");
       }
       //bu eşitlik ile aynı objenin gösterilip gösterilmedğini sorgulamış olulyoruz
       //içerideki değerler aynı olsa bile aynı bellekte aynı yeri tutmuyorlar
       //2 arrayin içlerini kıyaslamak istiyorsak Arrays.equls(a1,b1) şeklinde sorgularsan olur
    if(Arrays.equals(a1, b1)){
        System.out.println("yapıların için aynı");
    }else{
        System.out.println("yapıların içi farklı");
    }
    
    
    
    
    
    }
    
}
