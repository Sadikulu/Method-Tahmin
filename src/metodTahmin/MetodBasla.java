package metodTahmin;

import java.util.Scanner;

public class MetodBasla extends MetodIslemler{
    public static void main(String[] args) {

        System.out.println("~~~~~~METHOD TAHMIN ETME OYUNUNA HOSGELDIN~~~~~~");
        System.out.println("1- " + (methodlar.size()) + " arasinda bir sayi giriniz");
        Scanner scan = new Scanner(System.in);
        int secilenMethodIndex = scan.nextInt();
        methodGetir(methodlar, secilenMethodIndex - 1);
    }
}
