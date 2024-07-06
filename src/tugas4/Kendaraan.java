package tugas4;

public class Kendaraan {
    //enkapsulasi
    private String merk;
    private int kecepatan;
    
 
    
    public Kendaraan(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }
    
    public String getMerk () {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
        
    }
    
    public int getKecepatan() {
        return kecepatan;
    }
    
    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }
    
    //polymorphsim
    public void bergerak(){
        System.out.println("Kendaraan bergerak dengan kecepatan " + kecepatan + " km/jam.");
    }
}
