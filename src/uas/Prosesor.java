package uas;

public class Prosesor {
    //atribut dan enkapsulasi
    private String nama;
    private String seri;

    //konstruktor
    public Prosesor(String nama, String seri) {
        this.nama = nama;
        this.seri = seri;
    }

    //mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    //accessor
    public String getNama() {
        return nama;
    }

    public String getSeri() {
        return seri;
    }
    
    //polimorfisme
     public String displayInfo(){
         return "Nama: "+getNama()+
                 "\nSeri: "+getSeri();
     }
}
