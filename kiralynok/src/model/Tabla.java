
package model;
public class Tabla {
      private char[][] T = new char[8][8];;
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
}
