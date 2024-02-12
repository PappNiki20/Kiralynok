package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
    public String Megjelenit(char[][] kapott) {

        String megjelen = "";
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                megjelen += (kapott[i][j]);
            }
            megjelen += ("\n");
        }
        megjelen += ("\n");

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
// 7.feladat

    public boolean UresOszlop(int oszlopSzama) {
        int i = 0;
        while (i <= 7 && T[i][oszlopSzama] == UresCella) {
            i++;
        }
        return !(i <= 7);
    }

    public boolean UresSor(int sorSzama) {
        int i = 0;
        while (i <= 7 && T[sorSzama][i] == UresCella) {
            i++;
        }
        return !(i <= 7);
    }

    public int UresOszlopokSzama() {
        int db = 0;
        for (int i = 0; i <= 7; i++) {
            if (UresOszlop(i)) {
                db++;
            }
        }
        return db;
    }

    public int UresSorokSzama() {
        int db = 0;
        for (int i = 0; i <= 7; i++) {
            if (UresSor(i)) {
                db++;
            }
        }
        return db;
    }

     public void FajlbaIr(String tartalom) {
        try {
            Path filePath = Paths.get("tablak64.txt");

            Files.writeString(filePath, tartalom, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
