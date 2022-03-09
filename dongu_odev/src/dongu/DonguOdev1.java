package dongu;
import java.util.Scanner;

public class DonguOdev1 {
    public static void main(String[]args){
        int sayi;
        int toplam=0;
        Scanner input=new Scanner(System.in);


        do{
         System.out.println("Sayı giriniz:");
         sayi= input.nextInt();
         if(sayi%4==0){
             toplam=toplam+sayi;

         }
        }while (sayi%2==0);
        System.out.println("toplam:"+toplam);

    }
}
