package main;

public class JatekIndito {

    public static void main(String[] args) {
        /* referencia nélkül példányosítjuk az objektumot és hívjuk a metódust */
        //new Jatek().start();
        
        /* referencián keresztül hívjuk az objektumot */
//        Jatek referencia = new Jatek();
//        referencia.start();

        /* referencia nélkül, csak a konstruktort hívjuk, azaz példányosítjuk az objektumot */
        new Jatek();
        
        new Jatekos().tippel();
    }
    
}
