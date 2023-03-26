package Modul2.Praktikum.Kegiatan1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Kegiatan1 {
    static ArrayList<String> namaHewan= new ArrayList<>(List.of("Angsa", "Bebek", "Cicak", "Domba", "Elang", "Gajah"));

    String hewan;

    public static void main(String[] args) {
//        int indexBebek = namaHewan.indexOf("Bebek");
//        long count = namaHewan.stream().filter()count();
//        int countBebek = indexBebek.;
        namaHewan.add("Badak");
        namaHewan.add("Bebek");
        int m = Collections.frequency(namaHewan,"Bebek");

//        System.out.print("[ ");
//        for (String outputHewan : namaHewan){
            System.out.print(namaHewan);
//        }
//        System.out.println("]");
        System.out.println("Bebek = " + m);
        System.out.println("Posisi Index " + namaHewan.indexOf("Bebek") + ", " + namaHewan.lastIndexOf("Bebek") );
    }


}
