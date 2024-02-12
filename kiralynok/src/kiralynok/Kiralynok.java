package kiralynok;

import model.Tabla;

public class Kiralynok {

    public static void main(String[] args) {

        Tabla t = new Tabla('*');
        char[][] matrix = t.getT();
         String fajlbaIrok="";
        kiir(t.Megjelenit(matrix));
        fajlbaIrok+=""+t.Megjelenit(matrix);
        t.Elhelyez(8, matrix);
        kiir(t.Megjelenit(matrix));
        fajlbaIrok+=""+t.Megjelenit(matrix);
        
        kiir("Üres oszlopok: " + t.UresOszlop(3));
        kiir("Üres Sorok: " + t.UresSor(1));
        kiir("Üres Oszlopok száma" + t.UresOszlopokSzama());
        kiir("Üres sorok száma" + t.UresSorokSzama());
       
        t.FajlbaIr(fajlbaIrok);
    }

    private static void kiir(String Megjelenit) {
        System.out.println(Megjelenit);
    }

}
