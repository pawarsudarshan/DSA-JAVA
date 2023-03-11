package LinkedList;
import java.util.Scanner;

public class SearchingInLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);

        int target = sc.nextInt();
        System.out.println(search(head,target));
    }
    public static boolean search(Node head,int target){
        boolean flag = false;
        Node temp = head;
        while(temp!=null){
            if(temp.data==target) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        return flag;
    }
}
