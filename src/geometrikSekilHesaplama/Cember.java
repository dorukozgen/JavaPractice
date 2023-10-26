package geometrikSekilHesaplama;

public class Cember extends Sekil {

    public Cember(int yaricap) {
        setYaricap(yaricap);
    }

    @Override
    public int alanHesapla() {
        int sekilYaricap = getYaricap();
        int alan = 3 * (sekilYaricap * sekilYaricap);

        setAlan(alan);
        return getAlan();
    }

    @Override
    public int cevreHesapla() {
        int sekilYaricap = getYaricap();
        int cevre = 2 * 3 * sekilYaricap;

        setCevre(cevre);
        return getCevre();
    }
}
