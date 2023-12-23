package Model;

public class LinkedList {
    public Node root;

    LinkedList() {
    }

    LinkedList(Elevator elevator) {
        root = new Node(elevator);
    }

    public void add(Elevator elevator) {
        if (root == null) {
            root = new Node(elevator);
        } else {
            Node temp = root;
            while (temp.next != root) {
                temp = temp.next;
            }
            temp.next = new Node(elevator);
        }
        close();
    }

    public void close() {
        Node temp = root;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = root;
    }
}
