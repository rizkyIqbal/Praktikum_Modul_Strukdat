package Modul2.Praktikum.Kegiatan1;

import java.util.ArrayList;
import java.util.List;

public class Kegiatan1_4 {
    static ArrayList<String> namaHewan= new ArrayList<>(List.of("Cicak", "Domba", "Elang", "Gajah", "Badak", "Bebek"));

    public static void main(String[] args) {
        namaHewan.set(0, "Ular");
        System.out.println(namaHewan);
        namaHewan.add(2, "Itik");

        System.out.println(namaHewan);

    }
}
