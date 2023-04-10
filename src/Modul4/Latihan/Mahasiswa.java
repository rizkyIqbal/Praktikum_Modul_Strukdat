//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modul4.Latihan;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama;
    String kelas;
    String matkulPraktikum;
    int nim;

    public Mahasiswa(String namaMhs, String klsMhs, String matkulMhs, int nimMhs) {
        this.nama = namaMhs;
        this.kelas = klsMhs;
        this.matkulPraktikum = matkulMhs;
        this.nim = nimMhs;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        mhs.put("1", new Mahasiswa("M.Iqbal", "4K", "Struktur Data", 325));
        mhs.put("2", new Mahasiswa("M.Rojul", "4K", "Pengantar Game", 123));
        mhs.put("3", new Mahasiswa("Budi", "4K", "Pemrograman Berorientasi Object", 565));
        System.out.print("Masukkan ID: ");
        String input = scn.nextLine();
        Mahasiswa data = (Mahasiswa)mhs.get(input);
        if (data != null) {
            System.out.println("Data mahasiswa" + data.nama + ", kelas : " + data.kelas + ", mata kuliah praktikum : " + data.matkulPraktikum + ", nim : " + data.nim);
        } else {
            System.out.println("Data tidak ditemukan");
        }

    }
}
