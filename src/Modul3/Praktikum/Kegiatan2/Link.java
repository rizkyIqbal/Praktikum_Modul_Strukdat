package Modul3.Praktikum.Kegiatan2;

import java.util.Arrays;

public class Link {
    public String[] dData;
    public Link next;

    public Link (String[] d){
        dData = d;
    }

    public void displayLink(){
        System.out.println(Arrays.toString(dData) + " ");
    }
}
