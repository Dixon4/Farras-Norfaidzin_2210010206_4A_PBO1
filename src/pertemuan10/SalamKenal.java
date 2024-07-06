package pertemuan10;

import java.util.Scanner;

public class SalamKenal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("ketikkan nama ikam = ");
        String nama = input.nextLine();
        
        System.out.print("ketikkan umur ikam = ");
        int umur = input.nextInt();
        
        System.out.println("halo, salam kenal "+nama+", dan ikam sudah berumur "+umur+" tahun.");
    }
}
