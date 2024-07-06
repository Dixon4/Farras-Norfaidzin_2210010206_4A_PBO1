package uts;

public class Hewan {
    //Enkapsulasi
    private String nama;
    private int umur;
    
    //konstruktor
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    //Accessor
    public String getNama() {
        return nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    //Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    //Polymorphism
    public void makeSound() {
        System.out.println("Menghasilkan sebuah suara");
    }
}
