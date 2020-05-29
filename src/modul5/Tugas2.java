package modul5;

public class Tugas2 {
    public static void main( String[] args ){
    inputBiodata a = new inputBiodata("Wardana","Denpasar",20); 
    inputBiodata b = new inputBiodata(84,90.5,85);

    //overloaded methods
    a.print(a.getName() ); 
    b.print(b.getEnglishGrade(),b.getMathGrade(), b.getScienceGrade());
    }
}
