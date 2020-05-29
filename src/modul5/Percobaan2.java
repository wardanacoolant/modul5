package modul5;

public class Percobaan2 {
    
     public static void main(String[] args) {
    
         Mahasiswa2 mhs = new Mahasiswa2();
         System.out.println("\nKonstruktor 1" );
         System.out.println("NIM\t: " +mhs.getNrp());
         System.out.println("Nama\t: " +mhs.getNama());
         
         mhs = new Mahasiswa2("I Made Wardana");
         System.out.println("\nKonstruktor 2" );
         System.out.println("NIM\t: " +mhs.getNrp());
         System.out.println("Nama\t: " +mhs.getNama());
         
         mhs = new Mahasiswa2(1608561029, "I Made Wardana");
         System.out.println("\nKonstruktor 3" );
         System.out.println("NIM\t: " +mhs.getNrp());
         System.out.println("Nama\t: " +mhs.getNama());

     }
}
