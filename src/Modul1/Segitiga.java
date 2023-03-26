package Modul1;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Segitiga<T> {
    static Scanner scn = new Scanner(System.in);
    private T alas;
    private T tinggi;



    Segitiga(T alas, T tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt(T alas, T tinggi) {
        return (int) alas * (int) tinggi / 2;
    }

    public double getResultAsDouble(T alas, T tinggi) {
        return (double) alas * (double) tinggi / 2;
    }


//    public void print(List<?> list){
//        System.out.println(list);
//
//    }

    public static void main(String[] args) {


        System.out.println("""
                ===HITUNG LUAS SEGITIGA===
                
                Mau menampilkan hasil luas dalam bentuk? :
                1. Hasil Integer
                2. Hasil Double
                Masukkan pilihan 1 / 2""");

        int pilihan = scn.nextInt();
        System.out.println("Masukkan nilai alas dan tinggi segitiga secara berurutan");



        if (pilihan == 1) {
            int alasT = scn.nextInt();
            int tinggiT = scn.nextInt();
            Segitiga<Integer> luasTipeInt = new Segitiga<Integer>(alasT,tinggiT);
            System.out.println(luasTipeInt.getResultAsInt(alasT, tinggiT));
        } else if (pilihan == 2) {
            double alasT = scn.nextDouble();
            double tinggiT = scn.nextDouble();
            Segitiga<Double> luasTipeDouble = new Segitiga<Double>(alasT,tinggiT);
            System.out.println(luasTipeDouble.getResultAsDouble(alasT, tinggiT));
//            luasTipeDouble.print(Collections.singletonList(alasT));

        }
    }
}
