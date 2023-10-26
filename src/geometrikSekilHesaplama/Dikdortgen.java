package geometrikSekilHesaplama;

public class Dikdortgen extends Sekil {

    public Dikdortgen() {

    }

    public Dikdortgen(int uzunluk, int genislik) {
        setUzunluk(uzunluk);
        setGenislik(genislik);
    }

    @Override
    public int alanHesapla() {
        int alan = getUzunluk() * getGenislik();

        setAlan(alan);
        return getAlan();
    }

    @Override
    public int cevreHesapla() {
        int cevre = (getUzunluk() + getGenislik()) * 2;

        setCevre(cevre);
        return getCevre();
    }
}
