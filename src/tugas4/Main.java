package tugas4;

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota", 120);
        
        System.out.println(mobil.getMerk() + " Berkata : ");
        mobil.bergerak();
    }
}
