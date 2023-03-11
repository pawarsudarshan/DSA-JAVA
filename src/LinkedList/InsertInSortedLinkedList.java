package LinkedList;

public class InsertInSortedLinkedList {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(7);
        head.next.next = new Node(9);

        int nodeToInsert = 13;

        // code to insert a new node in sorted linked list
        if(head.data>nodeToInsert){
            Node newHead = new Node(nodeToInsert);
            newHead.next = head;
            head = newHead;
        }
        else {
            Node temp = head;
            Node prev = head;
            boolean flag = false;
            while (temp != null) {
                if (temp.data > nodeToInsert) {
                    prev.next = new Node(nodeToInsert);
                    prev.next.next = temp;
                    flag = true;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            if (!flag) {
                prev.next = new Node(nodeToInsert);
                prev.next.next = temp;
            }
        }

        // printing the linked list
        Node temp2 = head;
        while(temp2!=null){
            System.out.print(temp2.data+" ");
            temp2 = temp2.next;
        }
    }
}
