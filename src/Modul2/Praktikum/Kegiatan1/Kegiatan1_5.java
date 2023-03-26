package Modul2.Praktikum.Kegiatan1;

import java.util.ArrayList;
import java.util.List;

public class Kegiatan1_5 {
    static ArrayList<String> namaHewan= new ArrayList<>(List.of("Ular", "Domba", "Itik", "Elang", "Gajah", "Badak", "Bebek"));

    public static void main(String[] args) {
        namaHewan.subList(2,5).clear();
        System.out.println(namaHewan);
    }
}
