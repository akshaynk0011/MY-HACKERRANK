
import java.util.*;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {

    static void reversePrint(SinglyLinkedListNode head) {

        if (head == null) {
            return;
        }

        reversePrint(head.next);

        System.out.println(head.data);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            SinglyLinkedListNode head = null;
            SinglyLinkedListNode tail = null;

            for (int i = 0; i < n; i++) {

                int value = sc.nextInt();

                SinglyLinkedListNode newNode =
                    new SinglyLinkedListNode(value);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            reversePrint(head);
        }

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna