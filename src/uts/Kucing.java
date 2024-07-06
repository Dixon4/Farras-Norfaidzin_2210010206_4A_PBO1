package uts;

public class Kucing extends Hewan {
    
    public Kucing(String nama, int umur) {
        super(nama, umur);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
    
}

