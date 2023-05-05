package Modul3.Praktikum.Kegiatan2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[] a = new String[3];
    static LinkQueue queue = new LinkQueue();

    static void menu(){

        System.out.println("Pemesanan Jaket Lab :");
        System.out.println("1. Tambah Transaksi");
        System.out.println("2. Selesaikan Transaksi");
        System.out.println("3. Tampilkan Daftar Transaksi");
        System.out.println("4. Tampilkan Jumlah Transaksi");
        System.out.println("Pilih menu :");

        Scanner menuInput = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int menu = menuInput.nextInt();
        switch (menu){
            case 1:
                System.out.println("Masukkan NIM :");
                String input1 = input.nextLine();
                System.out.println("Masukkan Size Jaket Yang Akan Dibeli :");
                String input2 = input.nextLine();
                System.out.println("Masukkan Nomor Telepon :");
                String input3 = input.nextLine();
                System.out.println("Berikut adalah data yang telah anda masukkan ");
                System.out.println(input1 + ", " + input2 + ", " + input3);
                System.out.println("Apakah anda yakin ingin menambah data ke dalam daftar transaksi ?");
                System.out.println("Input 1 untuk mengkonfirmasi dan input 2 untuk membatalkan");
                int pilih = input.nextInt();
                if(pilih == 1){
                    queue.enqueue(new String[] {input1, input2, input3});
                    menu();
                }else{
                    menu();
                }
                break;
            case 2 :
                if (queue.isEmpty() ){
                    System.out.println("Queue Kosong !");
                    menu();
                }else{
                    System.out.println("Apakah Anda Ingin Menyelesaikan Transaksi Berikut ?");
                    queue.peek();
                    System.out.println("Input 1 untuk mengkonfirmasi dan input 2 untuk membatalkan");
                    int pilih2 = input.nextInt();
                    if (pilih2 == 1){
                        queue.dequeue();
                        menu();
                    }else {
                        menu();
                    }
                }
                break;
            case 3 :
                if (queue.isEmpty()){
                    System.out.println("Queue Kosong !");
                }else {
                    queue.displayQueue();
                }
                menu();
                break;
            case 4:
                System.out.println("Jumlah Transaksi Yang Belum Diproses Adalah :");
                queue.size();
                menu();
                break;
        }


//        a[0]="1";
//        a[1]="1";
//        a[2]="1";
//        queue.enqueue(new String[] {"apple", "banana", "cherry"});
//        a[0]="2";
//        a[1]="2";
//        a[2]="2";
//        queue.enqueue(new String[] {"dog", "cat", "bird"});
//        int a;
//        a=40;
//        queue.enqueue(a);
//        queue.displayQueue();
////
//        a=50;
//        queue.enqueue(a);
//        a=5;
//        queue.enqueue(a);
//        queue.displayQueue();

//        queue.dequeue();
//        queue.dequeue();
//        queue.displayQueue();
    }
    public static void main(String[] args) {

        menu();
    }
}
