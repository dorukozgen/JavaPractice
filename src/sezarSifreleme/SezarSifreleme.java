package sezarSifreleme;

import java.util.Scanner;

public class SezarSifreleme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("bir metin giriniz");
        String girilenMetin = scanner.nextLine();

        StringBuilder yeniMetin = new StringBuilder();
        for (Character each : girilenMetin.toCharArray()) {
            if (each <= 'z' && each >= 'a') {
                if (each.equals('z')) {
                    each = 'a';
                } else {
                    each++;
                }
            } else if (each <= 'Z' && each >= 'A') {
                if (each.equals('Z')) {
                    each = 'A';
                } else {
                    each++;
                }
            }
            yeniMetin.append(each);
        }

        System.out.println("Girilen metin = " + girilenMetin);
        System.out.println("Sezar şifrelenmiş metin = " + yeniMetin);
    }
}
