package Modul2.Praktikum.Kegiatan1;

import java.util.ArrayList;
import java.util.List;

public class Kegiatan1_3 {
    static ArrayList<String> namaHewan= new ArrayList<>(List.of("Angsa", "Cicak", "Domba", "Elang", "Gajah", "Badak", "Bebek"));

    public static void main(String[] args) {
        String hewan1;
        String hewan2;
        hewan1  = namaHewan.get(0);
        hewan2  = namaHewan.get(2);
        System.out.println("Index ke-0 : " + hewan1);
        System.out.println("Index ke-2 : " + hewan2);
        namaHewan.remove(0);
        System.out.println(namaHewan);


    }
}
