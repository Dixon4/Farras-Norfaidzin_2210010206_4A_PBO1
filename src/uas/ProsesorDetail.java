package uas;

//inheritance
public class ProsesorDetail extends Prosesor{
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

