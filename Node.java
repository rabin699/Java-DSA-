public class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void insertAtIndex(int data,int pos){
        if (pos <= 0) {
            insertAtFirst(data);
            return;
        }
        if (head == null) {
            // empty list: inserting at any positive index is same as inserting last/first
            insertAtLast(data);
            return;
        }
        Node temp = head;
        int i = 0;
        // move to node at index pos-1 or last node if list is shorter
        while (i < pos - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void delData(int data){
        if (head == null) {
            System.out.println("List is empty. Cannot delete");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.data == data) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        // not found -> nothing to do
    }

    public void delFromIndex(int pos){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos <= 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        int i = 0;
        // move to node at index pos-1
        while (i < pos - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }
        if (temp.next == null) {
            System.out.println("Index out of range");
            return;
        }
        temp.next = temp.next.next;
    }
    public void displayList(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" --> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}