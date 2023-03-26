package Modul2.Praktikum.Kegiatan2;

public class Link {
    Node head;

    public void add(int data){
        if (head == null){
            head = new Node(data);
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void showData(){
        if(head == null){
            System.out.println("Linklist is Empty");
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
            int data = current.data;
            System.out.print(data + " ");
        }
        System.out.println("");
    }

    public void sortedData(){
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            if (currNode.data < prevNode.data) {
                // remove currNode
                prevNode.next = currNode.next;
                // find the insertion point
                Node insertNode = head;
                Node insertPrevNode = null;
                while (insertNode != null && currNode.data > insertNode.data) {
                    insertPrevNode = insertNode;
                    insertNode = insertNode.next;
                }
                // insert currNode
                if (insertPrevNode == null) {
                    currNode.next = head;
                    head = currNode;
                } else {
                    insertPrevNode.next = currNode;
                    currNode.next = insertNode;
                }
                currNode = prevNode.next;
            } else {
                prevNode = currNode;
                currNode = currNode.next;
            }
        }
    }
}
