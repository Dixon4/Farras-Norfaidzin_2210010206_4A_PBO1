package tugas4;
    //inheritance
public class Mobil extends Kendaraan {
    public Mobil(String merk, int kecepatan) {
        super(merk, kecepatan);
    }
    
    @Override
    public void bergerak(){
        System.out.println("Mobil bergerak dengan kecepatan " + getKecepatan() + " km/jam.");
    }
    
}
