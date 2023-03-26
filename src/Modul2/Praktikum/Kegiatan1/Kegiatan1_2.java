package Modul2.Praktikum.Kegiatan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kegiatan1_2 {
    static ArrayList<String> namaHewan= new ArrayList<>(List.of("Angsa", "Bebek", "Cicak", "Domba", "Elang", "Gajah", "Badak", "Bebek"));

    String hewan;

    public static void main(String[] args) {
        namaHewan.remove("Bebek");
        System.out.print(namaHewan);

    }
}
