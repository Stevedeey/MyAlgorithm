package _encentral;

import java.util.NoSuchElementException;

public class LinkedListPrac1 {

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    /**
     * Printing the elements in linkedlist
     * */

    private void printLinkedListElements(){
        var current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    private void addLast(int item){
        var node = new Node(item);
        if(head == null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }

    }

    private void addFirst(int item){

        var node = new Node(item);
        if(head == null)
            head = tail = node;
       else {
           node.next = head;
           head = node;

        }
    }

    private void removeFirst(){

        if(head == null){
            throw new NoSuchElementException("No node");
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        var second = head.next;
        head = null;
        head = second;
    }

    private void removeLast(){
        var current = head;
        
        while (current!= null){
            if(current.next == tail){
                break;
            }
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    private int indexOf(int value){
        var current = head;
        int index = 0;
        while(current != null){
            if(current.data == value) return  index;
            index++;
            current = current.next;
        }
        return -1;
    }

    public boolean contains(int value){
        return indexOf(value) != -1;
    }


    public static void main(String[] args) {
        LinkedListPrac1 linkedListPrac1 = new LinkedListPrac1();
        linkedListPrac1.addLast(10);
        linkedListPrac1.addLast(20);
        linkedListPrac1.addLast(30);
        linkedListPrac1.addFirst(5);


        linkedListPrac1.printLinkedListElements();
        linkedListPrac1.removeFirst();
        System.out.println("The result after the first element has been removed");
        linkedListPrac1.printLinkedListElements();

        var res = linkedListPrac1.indexOf(3);
        var boolRes = linkedListPrac1.contains(2);

        System.out.println("Index: "+res);
        System.out.println("Contains:  "+ boolRes);

//        System.out.println("The result after the last element has been removed");
//        linkedListPrac1.printLinkedListElements();

    }
}
