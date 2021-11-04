package _encentral;

public class LinkedListGenerics {

    static class  Node{
      private int data;
      private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node x = new Node(12, null);
        Node y = new Node(23,x);
        Node z = new Node(33, y);

        System.out.println("X: " +y.getNext().getData());
        System.out.println("Y: " +z.getNext().getData());
        System.out.println("Z: " +z.getData());
    }
}
