package New;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListDemo2 {
    private class Node{

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;

        }

    }
    private Node first;
    private Node last;
    public void addLast(int item){
        var node = new Node(item);
        if(first == null){
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item){

        var node = new Node(item);

        if(first == null){
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }

    }

    public int indexOf(int value){

        var current = first;
        int index = 0;
        while (current.next != null){
            if(current.data == value) return  index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void deleteLast(){
        var current = first;

        if(first==last){
            first = last = null;
        }
        while(current.next !=null){
            if(current.next== last){
                break;
            }
            current = current.next;
            last = current;
        }
    }

    public void deleteFirst(){
        if(first==null){
            throw new NoSuchElementException("No element to delete");
        }
        if(first == last){
            first =null;
            return;
        }
        var second = first.next;
        first = null;
        first = second;


    }

    public void printNodeItems(){
        Node current  = first;
        while(current != null){
            System.out.print(current.data +" ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDemo2 linkedListDemo2 = new LinkedListDemo2();
        linkedListDemo2.addFirst(42);
        linkedListDemo2.addFirst(66);
        linkedListDemo2.addFirst(42);

        System.out.println(">>\n Those Added from head \n");

       linkedListDemo2.printNodeItems();

        linkedListDemo2.addLast(1);
        linkedListDemo2.addLast(2);
        linkedListDemo2.addLast(3);


        System.out.println(">>Those Added from tail>>> ");

        linkedListDemo2.printNodeItems();




    }



}
