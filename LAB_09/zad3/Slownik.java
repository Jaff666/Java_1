package zad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Slownik <K,V> {
    private K[] klucze;
    private V[] wartosci;

    public Slownik(int size) {
        klucze = (K[])new Object[size];
        wartosci = (V[]) new Object[size];
    }

    public boolean dodaj(K klucz, V wartosc){
        int wolnyIndeks = pierwszyWolnyIndeks();
        if (wolnyIndeks==-1){
            return false;
        }else {
            int indeksKlucza = indeksKlucza(klucz);
            if (indeksKlucza==-1){
                klucze[wolnyIndeks] = klucz;
                wartosci[wolnyIndeks] = wartosc;
                return true;
            }else {
                wartosci[indeksKlucza] = wartosc;
                return true;
            }
        }
    }

    public boolean czyZawiera(K klucz){
        if (indeksKlucza(klucz) == -1) 
        {
            return false;
        } else 
        {
            return true;
        }
    }

    public int wielkosc() {
        return pierwszyWolnyIndeks();
    }

    private int indeksKlucza(K klucz) {
        for (int i = 0; i < pierwszyWolnyIndeks(); i++) {
            if (klucze[i] == (klucz)) {
                return i;
            }
        }
        return -1;
    }


    private int pierwszyWolnyIndeks(){
        if (klucze[0]==null){
            return 0;
        }
        int wolnyIndeks=1;
        for (int i=1;i<klucze.length; i++){
            if (klucze[i]==null){
                return i;
            }
            wolnyIndeks++;
        }
        return wolnyIndeks>klucze.length? -1:wolnyIndeks;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (int i=0;i<pierwszyWolnyIndeks();i++){
            buffer.append(String.format("%s->%s,", klucze[i], wartosci[i]));
        }
        if (buffer.length()>1){
            buffer.deleteCharAt(buffer.length()-1);
        }
        buffer.append("]");
        return buffer.toString();
    }

    public static Slownik<String, String> wczytajSlownik(File file){
    List<String> lines = new ArrayList<String>();
    Scanner scanner;
    try {
        scanner = new Scanner(file);
        while (scanner.hasNextLine())
        {
            lines.add(scanner.nextLine());
        } 
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    String[] words;
    Slownik<String, String> result = new Slownik<>(lines.size());
    for (String line : lines) {
        words = line.split("-");
        result.dodaj(words[0], words[1]);
    }

    return result;
}
}

