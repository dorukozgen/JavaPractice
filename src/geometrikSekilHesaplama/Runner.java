package geometrikSekilHesaplama;

public class Runner {

    public static void main(String[] args) {
        Cember cember = new Cember(5);
        System.out.println("Çember alanı = " + cember.alanHesapla());
        System.out.println("Çember çevresi = " + cember.cevreHesapla());

        Dikdortgen dikdortgen = new Dikdortgen(10, 15);
        System.out.println("Dikdörtgen alanı = " + dikdortgen.alanHesapla());
        System.out.println("Dikdörtgen çevresi = " + dikdortgen.cevreHesapla());

        Kare kare = new Kare(30);
        System.out.println("Kare alanı = " + kare.alanHesapla());
        System.out.println("Kare çevresi = " + kare.cevreHesapla());
    }

}
