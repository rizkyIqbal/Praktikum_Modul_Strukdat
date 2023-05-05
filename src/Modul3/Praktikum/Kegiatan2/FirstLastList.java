package Modul3.Praktikum.Kegiatan2;

public class FirstLastList {
    public Link first;
    public Link last;

    public FirstLastList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertLast(String[] dd){
        Link newLink = new Link(dd);
        if(isEmpty()){
            first = newLink;
        }else {
            last.next = newLink;
        }

        last = newLink;
    }

    public void showFirst(){
        Link current = first;
        current.displayLink();
    }
    public String[] deleteFirst(){
        String[] temp = (String[]) first.dData;
        if (first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void showSize() {
        int count = 0;
        Link current = first;
        if (current == null){
            System.out.println("Tidak Ada");
        }else{
            while(current != null){
                current = current.next;
                count++;
            }
        }
        System.out.println(count);
    }

    public void displayList(){
        Link current = first;
        if (current == null){
            System.out.println("Queue Kosong !");
        }else{
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
        }
    }
}
