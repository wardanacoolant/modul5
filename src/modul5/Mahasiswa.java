package modul5;

public class Mahasiswa {
    
    private int nrp;
    private String nama;
    
    public Mahasiswa(int nrp, String nama){
        setNrp(nrp);
        setNama(nama);
    }
    public int getNrp(){
        return nrp;
    }
    public String getNama(){
        return nama;
    }
    public void setNrp(int nrp){
        this.nrp = nrp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
}
