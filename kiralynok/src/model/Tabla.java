
package model;
public class Tabla {
      private char[][] T = new char[8][8];
       private char UresCella;
       
//3.feladat konstruktor elkeszitese
    public Tabla(char c) {
        UresCella = c;

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                T[i][j] = UresCella;
            }
        }
    }
    //negyedik feladat
   public String Megjelenit(char[][] kapott){
       
        String megjelen="";
         for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                megjelen+=(kapott[i][j]);
            }
            megjelen+=("\n");
        }
        megjelen+=("\n");
        
        return megjelen;
    }
   
   //5.feladat
    public void Elhelyez(int n, char[][] kapott) {
    for (int i = 0; i < n; i++) {
        int sor = (int) (Math.random() * 8);
        int oszlop = (int) (Math.random() * 8);

        while (kapott[sor][oszlop] != UresCella) {
            sor = (int) (Math.random() * 8);
            oszlop = (int) (Math.random() * 8);
        }

        kapott[sor][oszlop] = 'K';
    }
}

    public char[][] getT() {
        return T;
    }

    
}
