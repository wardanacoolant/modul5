package modul5;

public class Kalender {
    private int tahun, tanggal, bulan;
        public Kalender(int tanggal) {
        setTanggal(tanggal);
        setBulan(1);
        setTahun(2000);
    }
    public Kalender(int bulan, int tahun) {
        setTanggal(1);
        setBulan(bulan);
        setTahun(tahun);
    }
    public Kalender(int tanggal, int bulan, int tahun) {
        setTanggal(tanggal);
        setBulan(bulan);
        setTahun(tahun);
    }
    void setTanggal(int i) {
        this.tanggal = i;
    }
    void setBulan(int i) {
        this.bulan = i;
    }
    void setTahun(int i) {
        this.tahun = i;
    }
    int getTanggal() {
        return tanggal;
    }
    int getBulan() {
        return bulan;
    }
    int getTahun() {
        return tahun;
    }
}
