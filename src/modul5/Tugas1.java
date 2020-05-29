package modul5;

public class Tugas1 {
    public static void main(String[] args) {
        Biodata wardana = new Biodata();
        wardana.setNama("I Made Wardana");
        wardana.setUmur(20);
        wardana.setNIM ("1608561029");
        wardana.setAlamat ("Denpasar");
        System.out.println("Nama : " + wardana.getNama());
        System.out.println("Umur : " + wardana.getUmur());
        System.out.println("NIM : " + wardana.getNIM());
        System.out.println("Alamat : " + wardana.getAlamat());
    } 
}
