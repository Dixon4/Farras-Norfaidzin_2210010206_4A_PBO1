# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data prosesor menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan seri prosesor, dan memberikan output berupa informasi detail dari seri tersebut seperti seri prosesor, generasi, model, dan suffix/kode tambahan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Prosesor`, `ProsesorDetail`, dan `ProsesorBeraksi` adalah contoh dari class.

```bash
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

public class ProsesorDetail extends Prosesor {
    //overriding
    public ProsesorDetail(String nama, String seri) {
        super(nama, seri);
    }
    
    public String getSeriProsesor(){
        String kodeSeri = getSeri().substring(0, 2);
        //seleksi switch
        switch(kodeSeri){
            case "i3":
                return "Core i3";
            case "i5":
                return "Core i5";
            case "i7":
                return "Core i7";
            case "i9":
                return "Core i9";
            default:
                return "Tidak ditemukan"; //i3-13900K
        }
    }
    
    public int getGenerasi(){
        return Integer.parseInt(getSeri().substring(3, 5));
    }
    
    public int getModel(){
        return Integer.parseInt(getSeri().substring(5, 8));
    }
    
    public String getSuffix(){
        String kodeTambahan = getSeri().substring(8);
        //seleksi switch
        switch(kodeTambahan){
            case "K":
                return "K(Mendukung overclocking)";
            case "T":
                return "T(Dioptimalkan untuk konsumsi daya rendah)";
            case "H":
                return "H(Dirancang untuk kinerja tinggi pada laptop)";
            default:
                return "Tidak ditemukan";
        }
    }
    
    //polimorfisme overriding
    @Override
    public  String displayInfo(){
        return super.displayInfo()+
                "\nSeri Prosesor: "+getSeriProsesor()+
                "\nGenerasi Ke: "+getGenerasi()+"th"+
                "\nModel: "+getModel()+
                "\nSuffix/Kode Tambahan: "+getSuffix();
    }
}

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
```

2. **Object** adalah instance dari class. Pada kode ini, `cpu[i] = new ProsesorDetail(nama, seri);` adalah contoh pembuatan object.

```bash
cpu[i] = new ProsesorDetail(nama, seri);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `seri` adalah contoh atribut.

```bash
String nama;
String seri;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Prosesor` dan `ProsesorDetail`.

```bash
public Mahasiswa(String nama, String seri) {
    this.nama = nama;
    this.seri = seri;
}

public MahasiswaDetail(String nama, String seri) {
    super(nama, seri);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setSeri` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setSeri(String seri) {
    this.seri = seri;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getSeri`, `getSeriProsesor`, `getGenerasi`, `getModel`, dan `getSuffix` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getSeri() {
    return seri;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `seri` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String seri;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ProsesorDetail` mewarisi `Prosesor` dengan sintaks `extends`.

```bash
public class ProsesorDetail extends Prosesor {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo` di `ProsesorDetail` merupakan override dari method `displayInfo` di `Prosesor`.

```bash
@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getSeriProsesor` dan method `getSuffix`.

```bash
public String getSeriProsesor() {
   String kodeSeri = getSeri().substring(0, 2);
        //seleksi switch
        switch(kodeSeri){
            case "i3":
                return "Core i3";
            case "i5":
                return "Core i5";
            case "i7":
                return "Core i7";
            case "i9":
                return "Core i9";
            default:
                return "Tidak ditemukan"; //i3-13900K
        }
}

public String getSuffix() {
    String kodeTambahan = getSeri().substring(8);
        //seleksi switch
        switch(kodeTambahan){
            case "K":
                return "K(Mendukung overclocking)";
            case "T":
                return "T(Dioptimalkan untuk konsumsi daya rendah)";
            case "H":
                return "H(Dirancang untuk kinerja tinggi pada laptop)";
            default:
                return "Tidak ditemukan";
        }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < cpu.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Prosesor "+(i+1)+": ");
String nama = scanner.nextLine();
System.out.print("Masukkan Seri Prosesor "+(i+1)+": ");
String seri = scanner.nextLine();

System.out.println("====================");
System.out.println("Detail: ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `ProsesorDetail[] cpu = new ProsesorDetail[2];` adalah contoh penggunaan array.

```bash
ProsesorDetail[] cpu = new ProsesorDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e){
 System.out.println("Kesalahan format nomor: "+e.getMessage());
}catch (StringIndexOutOfBoundsException e){
 System.out.println("Kesalahan format seri: "+e.getMessage());
} catch (Exception e){
 System.out.println("Kesalahan umum: "+e.getMessage());
 }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Farras Norfaidzin
NPM: 2210010206
