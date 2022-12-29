import java.util.Scanner;

public class algoritma {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sayi1,sayi2;
        int sayac=0,top=0;

        System.out.print("1. sayisi giriniz: ");
        sayi1=s.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        sayi2=s.nextInt();

        while (sayac!=sayi2){
            top+=sayi1;
            sayac++;
        }

        System.out.println("Carpim sonucu: "+top);
    }
}
