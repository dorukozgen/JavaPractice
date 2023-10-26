package geometrikSekilHesaplama;

public abstract class Sekil {

    private int yaricap;
    private int uzunluk;
    private int genislik;

    private int alan;
    private int cevre;


    public abstract int alanHesapla();

    public abstract int cevreHesapla();

    public int getYaricap() {
        return yaricap;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public int getGenislik() {
        return genislik;
    }

    public int getAlan() {
        return alan;
    }

    public int getCevre() {
        return cevre;
    }

    public void setYaricap(int yaricapDegeri) {
        yaricap = yaricapDegeri;
    }

    public void setUzunluk(int uzunlukDegeri) {
        uzunluk = uzunlukDegeri;
    }

    public void setGenislik(int genislikDegeri) {
        genislik = genislikDegeri;
    }

    public void setAlan(int alanDegeri) {
        alan = alanDegeri;
    }

    public void setCevre(int cevreDegeri) {
        cevre = cevreDegeri;
    }
}
