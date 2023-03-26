package Modul2.Praktikum.Kegiatan2;

public class LinkedList {
    public static void main(String[] args) {
        Link myLink = new Link();
        myLink.add(8);
        myLink.add(7);
        myLink.add(1);
        myLink.add(4);
        myLink.add(6);
        myLink.add(6);
        myLink.add(2);
        myLink.add(3);
        System.out.print("before : ");
        myLink.showData();
        myLink.sortedData();
        System.out.print("after : " );
        myLink.showData();
    }
}
