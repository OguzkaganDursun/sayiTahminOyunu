import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hak = 0, tahmin, sayi;

        //Random sayi tanimlandi.
        Random rnd = new Random();
        sayi = rnd.nextInt(100);


        Scanner scan = new Scanner(System.in);

        int[] yanlisTahmin = new int[5];
        boolean kazandiMi = false;

        while (hak < 5)
        {
            System.out.print("Lutfen Sayi Tahmininizi Giriniz : ");
            tahmin = scan.nextInt();
            if (tahmin < 0 || tahmin > 99)
            {
                System.out.println("Lutfen 0 Ile 100 Arasinda Deger Giriniz!");
                continue;
            }
            if (tahmin == sayi)
            {
                System.out.println("Tebrikler Dogru Tahmin! \nTahmin Edilen Sayi : " + sayi);
                kazandiMi = true;
                break;
            }
            else
            {
                yanlisTahmin[hak] = tahmin;

                System.out.println("Hatali Bir Sayi Girdiniz!");
                if (tahmin > sayi)
                {
                    System.out.println(tahmin + " Sayisi, Gizli Sayidan Buyuktur. Tekrar Deneyin!");
                }
                else
                {
                    System.out.println(tahmin + " Sayisi, Gizli Sayidan Kucuktur. Tekrar Deneyin!");
                }
                hak++;
                System.out.println("Kalan Hakkiniz : " + (5 - hak));
                System.out.println();
                System.out.println("*******************************");

            }

        }
        if (!kazandiMi)
        {
            System.out.println("Kaybettiniz!");
            System.out.println("Dogru Sayi : " + sayi);
        }
        System.out.print("Tahminleriniz : " + Arrays.toString(yanlisTahmin));
        
    }
}
