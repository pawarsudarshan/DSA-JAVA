package LinkedList;

public class LengthOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(7);
        head.next.next = new Node(9);

        // code to get the length of the linked list
        int length = 0;
        while(head!=null){
            length++;
            head = head.next;
        }

        System.out.println("The length of the linked list is "+length);
    }
}
