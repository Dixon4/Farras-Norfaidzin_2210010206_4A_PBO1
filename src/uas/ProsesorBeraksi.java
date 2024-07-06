package uas;

import java.util.Scanner;

public class ProsesorBeraksi {
    public static void main(String[] args) {
        //error handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);

            //array
            ProsesorDetail[] cpu = new ProsesorDetail[2];

            //perulangan biasa
            for(int i=0; i<cpu.length; i++){
                System.out.print("Masukkan Nama Prosesor "+(i+1)+": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Seri Prosesor "+(i+1)+": ");
                String seri = scanner.nextLine();

                //objek
                cpu[i] = new ProsesorDetail(nama, seri);
            }

            //perulangan array
            for(ProsesorDetail data: cpu){
                System.out.println("====================");
                System.out.println("Detail: ");
                System.out.println(data.displayInfo());
            } 
        } catch (NumberFormatException e){
            System.out.println("Kesalahan format nomor: "+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan format seri: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Kesalahan umum: "+e.getMessage());
        }
    }
}
