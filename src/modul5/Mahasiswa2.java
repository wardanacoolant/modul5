package modul5;

public class Mahasiswa2 {
    
    private int nrp;
    private String nama;
    
    public Mahasiswa2(){
        nrp = 0;
        nama = "";
    }
    
    public Mahasiswa2(String nama){
        nrp = 0;
        this.nama = nama;
    }
    
    public Mahasiswa2(int nrp, String nama){
        this.nrp = nrp;
        this.nama = nama;
    }
    
    public int getNrp(){
        return nrp;
    }
    public String getNama(){
        return nama;
    }
}
