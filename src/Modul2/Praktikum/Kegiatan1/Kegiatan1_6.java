package Modul2.Praktikum.Kegiatan1;

import java.util.ArrayList;
import java.util.List;

public class Kegiatan1_6 {
    static ArrayList<String> namaHewan= new ArrayList<>(List.of("Ular", "Domba", "Badak", "Bebek"));

    public static void main(String[] args) {
        System.out.println("Elemen Pertama : " + namaHewan.get(0));
        System.out.println("Elemen Terakhir : " + namaHewan.get(namaHewan.size()-1));
    }

}
