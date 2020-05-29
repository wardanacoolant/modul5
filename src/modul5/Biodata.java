package modul5;

public class Biodata {
    private String nama, nim, alamat;
    private int umur;
    public int getUmur(){
        return umur;
    }
    public String getNama(){
        return nama;
    }
    public String getNIM (){
        return nim ;
    }
    public String getAlamat (){
        return alamat ;
    }
    public void setUmur( int newUmur){
        umur = newUmur;
    }
    public void setNama(String newNama){
        nama = newNama;
    }
    public void setNIM ( String newNim){
        nim = newNim;
    }
    public void setAlamat ( String newAlamat){
        alamat = newAlamat;
    }
}
