package uts;

public class HewanBeraksi {
   public static void main(String[] args) {
       Kucing kucingku = new Kucing("Whisker", 5);
       
       System.out.println("Nama Kucing: " + kucingku.getNama());
       System.out.println("Umurnya: " + kucingku.getUmur());
       kucingku.makeSound();
       
       kucingku.setNama("Garfield");
       System.out.println("Ganti Nama kucing: " + kucingku.getNama());
       
       kucingku.setUmur(6);
       System.out.println("Update umur: " + kucingku.getUmur());
   } 
}
