class node{
    int data;
    node next;
    node(int data){
        this.data = data;
    }
}

public class rev_group{
    public static void main(String[] args) {
        node n1 = new node(4);
        node n2 = new node(5);
        node n3 = new node(6);
        node n4 = new node(7);
        node n5 = new node(8);
        node n6 = new node(9);
        node n7 = new node(10);
        node n8 = new node(11);

        node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = null;

    }
    public static node reverse(node head){
        node curr = head;
        node prev = null;
        while(curr!=null){
            node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static node reverse_in_group(node head, int k){
        node curr = head;
        node prev = null;
        int count = 0;
        while (curr!=null && count<k) {
            node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            count++;
        }
        return prev;
        

        }
    }

