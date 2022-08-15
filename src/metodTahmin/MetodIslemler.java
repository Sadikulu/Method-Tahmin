package metodTahmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MetodIslemler {
    protected static List<String> methodlar = new ArrayList<>(Arrays.asList("add()", "random()", "get()", "remove()",
            "sort()", "set()", "subList()", "isEmpty()", "valueOf()", "parseOf()", "subString()", "setCharAt()",
            "replaceAll()", "contains()", "equalsIgnoreCase()"));

    static Scanner scan = new Scanner(System.in);

    static void methodGetir(List<String> methodlar, int index) {
        StringBuilder tahminMetod = new StringBuilder(methodlar.get(index).replaceAll("\\S", "*"));
        System.out.println(methodlar.get(index).length() + " Karakterli bir metod seçtin : " + tahminMetod);
        int tahminHakki = methodlar.get(index).length() * 2;
        int yanlisTahminSayisi = 0;
        do {
            System.out.println("Kalan tahmin hakkın: " + (tahminHakki - yanlisTahminSayisi));
            System.out.println("Lütfen bir karakter giriniz");
            char karakter = scan.next().charAt(0);
            String str = "" + karakter;
            if (!methodlar.get(index).contains(str)) {
                yanlisTahminSayisi++;
            }
            for (int i = 0; i < methodlar.get(index).length(); i++) {
                if (methodlar.get(index).charAt(i) == karakter) {
                    tahminMetod.setCharAt(i, karakter);
                }
            }
            if (methodlar.get(index).equalsIgnoreCase(tahminMetod.toString())) {
                System.out.println("Tebrikler kazandın \n" + "Tahmin ettiğin metod : " + methodlar.get(index));
                break;
            }
            if (tahminHakki == yanlisTahminSayisi) {
                System.out.println("Agabee kusura bakma kaybettin \n" + "Tahmin edeceğin metod : " + methodlar.get(index));
                break;
            }
            System.out.println(tahminMetod);
        } while (!methodlar.get(index).equalsIgnoreCase(tahminMetod.toString()));
    }
}