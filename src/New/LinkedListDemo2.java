package New;

import java.util.*;

public class LinkedListDemo2 {
    private class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;

        }

    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        var node = new Node(item);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {

        var node = new Node(item);

        if (first == null) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }

    }

    public int indexOf(int value) {

        var current = first;
        int index = 0;
        while (current.next != null) {
            if (current.data == value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    private void removeLast() {
        var current = first;

        while (current != null) {
            if (current.next == last) {
                break;
            }
            current = current.next;
        }
       last = current;
        last.next = null;
    }

//    private void removeLast(){
//        var previous = getPrevious(last);
//        last = previous;
//        last.next = null;
//    }

    public Node getPrevious(Node node) {
        Node current = first;
        while (current != node) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public void deleteFirst() {
        if (first == null) {
            throw new NoSuchElementException("No element to delete");
        }
        if (first == last) {
            first = null;
            return;
        }
        var second = first.next;
        first = null;
        first = second;


    }

    public void printNodeItems() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        LinkedListDemo2 linkedListDemo2 = new LinkedListDemo2();
        linkedListDemo2.addFirst(10);
        linkedListDemo2.addFirst(20);
        linkedListDemo2.addFirst(30);

        System.out.println(">>\n Those Added from head ");

        linkedListDemo2.printNodeItems();

        linkedListDemo2.addLast(1);
        linkedListDemo2.addLast(2);
        linkedListDemo2.addLast(3);

        System.out.println(">>Those Added from tail>>> ");

        linkedListDemo2.printNodeItems();

        System.out.println("PRINTING AFTER THE LAST ELEMENT WS REMOVED");

        linkedListDemo2.removeLast();

        linkedListDemo2.printNodeItems();


    }

    public static int largestNum(int num) {
        String strNum = String.valueOf(num);
        int index = 0, highest = 0, value = 0;
        for (int i = 0; i < strNum.length(); i++) {
            if (i < strNum.length() - 1) {
                value = Integer.parseInt(strNum.charAt(i) + "" + strNum.charAt(i + 1));
                if (value > highest) {
                    index = i;
                    highest = value;
                }
            }
        }
        return Integer.parseInt(strNum.charAt(index) + "" + strNum.charAt(index + 1));
    }


}
