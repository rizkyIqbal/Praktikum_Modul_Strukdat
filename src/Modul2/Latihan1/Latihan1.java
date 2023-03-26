package Modul2.Latihan1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Latihan1 {
    static ArrayList<String> namaHewan = new ArrayList<>(List.of("Sapi","Kelinci", "Kambing", "Unta", "Domba"));
    static ArrayList<String> deleteHewan = new ArrayList<>(List.of("Kelinci", "Kambing", "Unta"));

    public static void main(String[] args) {
        System.out.println("Hewan : " + namaHewan);
        System.out.println("Hewan yang dihapus : ");
        System.out.println(deleteHewan);

        for (String hapusHewan : deleteHewan){
            namaHewan.remove(hapusHewan);
        }

        System.out.println("Output Hewan :");
        System.out.println(namaHewan);
    }
}
