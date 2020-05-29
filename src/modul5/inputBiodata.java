package modul5;

public class inputBiodata {

    private String name, address;
    private int age;
    private double mGrade, eGrade, sGrade;
    
    public void print( String temp ){ 
        System.out.println("Nama : " + name); 
        System.out.println("Alamat : " + address); 
        System.out.println("Umur : " + age);
    }

    public void print(double eGrade, double mGrade, double sGrade) {
        System.out.println("Nilai Matematika = " + mGrade); 
        System.out.println("Nilai Bahasa Inggris = " + eGrade); 
        System.out.println("Nilai IPA = " + sGrade);
    }
    
    public inputBiodata(String name, String address, int age){ 
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public inputBiodata(double mathGrade, double englishGrade, double scienceGrade){ 
        this.mGrade = mathGrade;
        this.eGrade = englishGrade; 
        this.sGrade = scienceGrade;
    }

    String getName() {
        return name;
    }
    
    double getMathGrade() {
        return mGrade;
    }
    
    double getEnglishGrade() {
        return eGrade;
    }
    
    double getScienceGrade() {
        return sGrade;
    }
}
