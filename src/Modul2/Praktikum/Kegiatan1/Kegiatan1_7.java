package Modul2.Praktikum.Kegiatan1;

import java.util.ArrayList;
import java.util.List;

public class Kegiatan1_7 {
    static ArrayList<String> namaHewan= new ArrayList<>(List.of("Ular", "Domba", "Badak", "Bebek"));

    public static void  main(String[] args) {
        System.out.println("Jumlah Elemen : " + namaHewan.size());
        System.out.println("Posisi Index Badak : " + namaHewan.indexOf("Badak"));
    }
}
