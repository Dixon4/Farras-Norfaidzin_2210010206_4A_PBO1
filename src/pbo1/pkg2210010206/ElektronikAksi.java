
package pbo1.pkg2210010206;

public class ElektronikAksi {
    
    public static void main(String[] args) {
      Elektronik handphone = new Elektronik ();
      Elektronik laptop = new Elektronik ();
      
      handphone.merk = "Infinix";
      handphone.warna = "Jingga";
      handphone.tahunProduksi = 2023;
      
      laptop.merk = "Acer";
      laptop.warna = "Hitam";
      laptop.tahunProduksi = 2022;
      
      System.out.println("Merk Hp = "+handphone.merk);
      System.out.println("Warna = "+handphone.warna);
      System.out.println("Tahun Produksi = "+handphone.tahunProduksi);
      
      System.out.println("=========================");
      
      System.out.println("Merk Laptop = "+laptop.merk);
      System.out.println("Warna = "+laptop.warna);
      System.out.println("Tahun Produksi = "+laptop.tahunProduksi);
      
      
    }
    
}
